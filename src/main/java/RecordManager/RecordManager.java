package RecordManager;

import BufferManager.BufferManager;
import BufferManager.Block;
import CatalogManager.CatalogManager;
import CatalogManager.Table;
import CatalogManager.Attribute;
import Interpreter.Command.*;
import Interpreter.EvalVisitor;
import antlr.gen.MiniSQLLexer;
import antlr.gen.MiniSQLParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecordManager {

    private static final int INTSIZE = 4;
    private static BufferManager bufferManager = new BufferManager();

    /**
     * 在buffer管理的block中选择一个作为存放该表的内存空间
     * @param tableName
     * @return 无返回值，建表是否成功在catalog manager里判断
     */
    public void createTable(String tableName) {
//        File file = new File(directory+tableName);
//        // 创建表文件
//        try {
//            if (!file.createNewFile()) return false;
//        } catch (IOException e) {
//            return false;
//        }
        // 调用buffer manager在内存中分出一个block给该表使用

        Block block = bufferManager.getBlock(tableName, 0);
        block.writeInt(0, 0);
    }

    /**
     * 根据表名删除表文件，并在buffer管理的block中将表记录删除
     * @param tableName
     * @return 建表是否成功
     */
    public boolean dropTable(String tableName) {
//        File file = new File(directory+tableName);
//        // 删除表文件
//        if (!file.delete()) return false;
        // 调用buffer manager清除该表记录占用的内存
        bufferManager.dropBlock(tableName);
        return true;
    }

    /**
     * 解析insert指令得到一条记录，并利用buffer manager插入内存中
     * @param command
     * @return 插入记录是否成功
     */
    public boolean insert(Command command) {
        Table table = CatalogManager.getInstance().getTable(command.tblName);
        // 将Command中的记录值取出来，以字符串链表形式存储
        List<String> tuple = new ArrayList<String>();
        for (Attribute attribute : table.attributes.values()) {
            if (command.valueMap.containsKey(attribute.attriName))
                tuple.add(command.valueMap.get(attribute.attriName));
            // 如果未赋值，但是有默认值
            else if (attribute.defValue != null)
                tuple.add(attribute.defValue);
            // 如果未赋值且无默认值，但是可以为null
            else if (table.nullAttrs.contains(attribute.attriName))
                tuple.add(null);
            else
                return false;
        }
        // 调用buffer manager将记录插入内存中
        // step 1: 找到待插入的位置
        Block firstBlk = bufferManager.getBlock(command.tblName, 0);
        int nextPos = firstBlk.readInt(0);
        Block targetBlk;
        int recordOffset = 0;
        int recPerBlk = firstBlk.BLOCKSIZE / (INTSIZE + table.recordSize);
        if (nextPos == 0) {
            int blockOffset = (table.recordNum + 1) / recPerBlk;
            targetBlk = bufferManager.getBlock(command.tblName, blockOffset);
            recordOffset = (INTSIZE + table.recordSize) * ((table.recordNum + 1) % recPerBlk);
        } else {
            int blockOffset = nextPos / recPerBlk;
            targetBlk = bufferManager.getBlock(command.tblName, blockOffset);
            recordOffset = (INTSIZE + table.recordSize) * (nextPos % recPerBlk);
        }
        // 初始化记录头为-1，表示当前记录有效
        targetBlk.writeInt(recordOffset, -1);
        recordOffset += 4;
        // step 2: 插入数据到内存
        int idx = 0;
        for (Attribute attribute : table.attributes.values()) {
            // 更新指定位置的值
            writeValue(attribute, tuple.get(idx++), targetBlk, recordOffset);
            recordOffset += attribute.attrSize;
        }
        table.recordNum++;
        return true;
    }

    /**
     * 选择指令，返回生成结果
     * @param command
     * @return 选择出来的结果，一条记录存为一个字符串list，所有记录存为一个list。
     */
    public List<List<String>> select(Command command) {
        Table table = CatalogManager.getInstance().getTable(command.tblName);
        List<List<String>> res = new ArrayList<List<String>>();
        // 从buffer manager里取出表中所有的记录，并判断每一条是否符合条件
        int count = 0;
        int blockOffset = 0;
        Block curBlk = bufferManager.getBlock(table.tableName, blockOffset);
        int recPerBlk = curBlk.BLOCKSIZE / (INTSIZE + table.recordSize);
        int recNum = 1;
        while (count < table.recordNum) {
            if (recNum == recPerBlk) {
                recNum = 1;
                curBlk = bufferManager.getBlock(table.tableName, ++blockOffset);
            }
            int recordOffset = (INTSIZE + table.recordSize) * (recNum++);
            // 当前位置没有存储记录
            if (curBlk.readInt(recordOffset) != -1) continue;
            recordOffset += 4;
            // 返回当前位置的记录
            List<String> record = getRecord(table, curBlk, recordOffset);
            count++;
            // 判断有当前记录是否满足选取条件
            if (condition(table, record, command.whereClause)) res.add(record);
        }
        return res;
    }

    /**
     * 删除指令，返回删除后的结果
     * @param command
     * @return 被删除记录数目
     */
    public int delete(Command command) {
        Table table = CatalogManager.getInstance().getTable(command.tblName);
        // 调用buffer manager把删除的记录做标记
        int count = 0;
        int blockOffset = 0;
        Block curBlk = bufferManager.getBlock(table.tableName, blockOffset);
        int recPerBlk = curBlk.BLOCKSIZE / (INTSIZE + table.recordSize);
        int preRecNum = 0;
        int recNum = 1;
        int removed = 0;
        while (count < table.recordNum) {
            if (recNum == recPerBlk) {
                preRecNum = 0;
                recNum = 1;
                curBlk = bufferManager.getBlock(table.tableName, ++blockOffset);
            }
            int recordOffset = (INTSIZE + table.recordSize) * (recNum++);
            // 当前位置没有存储记录
            if (curBlk.readInt(recordOffset) != -1) {
                preRecNum = recNum - 1;
                continue;
            }
            recordOffset += 4;
            // 返回当前位置的记录
            List<String> record = getRecord(table, curBlk, recordOffset);
            count++;
            // 判断有当前记录是否满足删除条件
            if (condition(table, record, command.whereClause)) {
                int preRecordOffset = (INTSIZE + table.recordSize) * (preRecNum);
                curBlk.writeInt(preRecordOffset, recNum-1);
                preRecNum = recNum - 1;
                removed++;
            }
        }
        // 把最后一个记录头置0，表示已到结尾
        int preRecordOffset = (INTSIZE + table.recordSize) * (preRecNum);
        curBlk.writeInt(preRecordOffset, 0);
        // 返回删除记录数目
        return removed;
    }

    /**
     * 返回指定block指定位置的那条记录
     * @param table
     * @param curBlk
     * @param recordOffset
     * @return
     */
    private List<String> getRecord(Table table, Block curBlk, int recordOffset) {
        List<String> record = new ArrayList<String>();
        for (Attribute attribute : table.attributes.values()) {
            if (attribute.attriType.equals("INT")) {
                int intValue = curBlk.readInt(recordOffset);
                if (intValue == Integer.MAX_VALUE) record.add(null);
                else record.add(String.valueOf(intValue));
            } else if (attribute.attriType.equals("FLOAT")) {
                float floatValue = curBlk.readFloat(recordOffset);
                if (floatValue == Float.MAX_VALUE) record.add(null);
                else record.add(String.valueOf(floatValue));
            } else if (attribute.attriType.equals("CHAR")) {
                String strValue = curBlk.readString(recordOffset, attribute.attrSize);
                String remain = strValue.replace("$", "");
                if (remain.equals("")) record.add(null);
                else record.add(strValue);
            }
            recordOffset += 4;
        }
        return record;
    }

    /**
     * 更新指令，返回更新记录的数目
     * @param command
     * @return 被更新记录数目
     */
    public int update(Command command) {
        Table table = CatalogManager.getInstance().getTable(command.tblName);
        // 调用buffer manager把更新后的记录存储回去
        List<List<String>> res = new ArrayList<List<String>>();
        // 从buffer manager里取出表中所有的记录，存成List<List<String>>的形式，allRecords
        int count = 0;
        int blockOffset = 0;
        Block curBlk = bufferManager.getBlock(table.tableName, blockOffset);
        int recPerBlk = curBlk.BLOCKSIZE / (INTSIZE + table.recordSize);
        int recNum = 1;
        while (count < table.recordNum) {
            if (recNum == recPerBlk) {
                recNum = 1;
                curBlk = bufferManager.getBlock(table.tableName, ++blockOffset);
            }
            int recordOffset = (INTSIZE + table.recordSize) * (recNum++);
            // 当前位置没有存储记录
            if (curBlk.readInt(recordOffset) != -1) continue;
            recordOffset += 4;
            // 返回当前位置的记录
            List<String> record = getRecord(table, curBlk, recordOffset);
            count++;
            // 判断有当前记录是否满足选取条件
            if (condition(table, record, command.whereClause)) {
                updateRecord(table, curBlk, recordOffset, command.valueMap);
            }
        }
        // 返回更新记录数目
        return command.valueMap.size();
    }

    /**
     * 更新指定位置的记录
     * @param table
     * @param curBlk
     * @param recordOffset
     * @param valueMap
     */
    private void updateRecord(Table table, Block curBlk, int recordOffset, Map<String, String> valueMap) {
        for (String id : valueMap.keySet()) {
            int seq = table.attrOrder.get(id);
            int offset = 0;
            Attribute[] attributes = (Attribute[]) table.attributes.values().toArray();
            Attribute curAttr = table.attributes.get(id);
            for (int i = 0; i < seq; i++) {
                offset += attributes[i].attrSize;
            }
            // 往id对应的位置写入值
            writeValue(curAttr, valueMap.get(id), curBlk, recordOffset+offset);
        }
    }

    /**
     * 更新指定位置
     * @param attribute
     * @param value
     * @param block
     * @param recordOffset
     */
    private void writeValue(Attribute attribute, String value, Block block, int recordOffset) {
        if (attribute.attriType.equals("INT")) {
            if (value == null) {
                // 以整型数最大值表示null
                block.writeInt(recordOffset, Integer.MAX_VALUE);
            } else {
                int intValue = Integer.parseInt(value);
                block.writeInt(recordOffset, intValue);
            }
        } else if (attribute.attriType.equals("FLOAT")) {
            if (value == null) {
                // 以浮点数最大值表示null
                block.writeFloat(recordOffset, Float.MAX_VALUE);
            } else {
                float floatValue = Float.parseFloat(value);
                block.writeFloat(recordOffset, floatValue);
            }
        } else if (attribute.attriType.equals("CHAR")) {
            if (value == null) {
                StringBuilder sb = new StringBuilder();
                // 以 '$' 字符串表示null字符串
                for (int i = 0; i < attribute.attrSize; i++) sb.append('$');
                block.writeString(recordOffset, sb.toString(), sb.length());
            } else {
                String strValue = value;
                block.writeString(recordOffset, strValue, strValue.length());
            }
        }
    }

    /**
     * 判断当前记录是否被选中
     * @param table
     * @param record
     * @param whereClause
     * @return true 被选中 ; false 未被选中
     */
    public boolean condition(Table table, List<String> record, ClauseTreeNode whereClause) {
        boolean flag;
        if (whereClause.compExpTreeNode != null) flag = compExpTreeNodeAnalyzer(table, record, whereClause.compExpTreeNode);
        else {
            flag = condition(table, record, whereClause.child);
            if (whereClause.operation == "NOT") flag = !flag;
        }
        while (whereClause.sibling != null) {
            if (whereClause.operation == "OR") flag |= condition(table, record, whereClause.sibling);
            else if (whereClause.operation == "AND") flag &= condition(table, record, whereClause.sibling);
            else if (whereClause.operation == "XOR") flag ^= condition(table, record, whereClause.sibling);
            whereClause = whereClause.sibling;
        }
        return flag;
    }

    /**
     * 分析CompExpNode节点，该节点对应关系表达式
     * @param table
     * @param record
     * @param compExpTreeNode
     * @return CompExpNode节点判断结果，true/false
     */
    public boolean compExpTreeNodeAnalyzer(Table table, List<String> record, CompExpTreeNode compExpTreeNode) {
        String operation = compExpTreeNode.operation;
        Value valueLeft = bitExpTreeNodeAnalyzer(table, record, compExpTreeNode.left);
        Value valueRight = bitExpTreeNodeAnalyzer(table, record, compExpTreeNode.right);
        boolean flag = false;
        if (valueLeft.type == valueRight.type) {
            if (valueLeft.type != 2) flag = compareNumericalValue(valueLeft, valueRight, valueLeft.type, operation);
            else flag = compareString(valueLeft, valueRight, operation);
        }
        return flag;
    }

    /**
     * 分析bitExpTreeNode节点，该节点对应算术表达式
     * @param table
     * @param record
     * @param bitExpTreeNode
     * @return 算术表达式的计算值
     */
    public Value bitExpTreeNodeAnalyzer(Table table, List<String> record, BitExpTreeNode bitExpTreeNode) {
        if (bitExpTreeNode.simExpTreeNode != null) return simExpTreeNodeAnalyzer(table, record, bitExpTreeNode.simExpTreeNode);
        else {
            String operation = bitExpTreeNode.operation;
            Value valueLeft = bitExpTreeNodeAnalyzer(table, record, bitExpTreeNode.left);
            Value valueRight = bitExpTreeNodeAnalyzer(table, record, bitExpTreeNode.right);
            Value value = null;
            if (valueLeft.type == valueRight.type) { /* else error */
                if (valueLeft.type == 0) value = calInt(valueLeft, valueRight, operation);
                else if (valueLeft.type == 1) value = calFloat(valueLeft, valueRight, operation);
                else if (valueLeft.type == 2) value = calString(valueLeft, valueRight, operation);
            }
            return value;
        }
    }

    /**
     * 分析simExpTreeNode节点，该节点对应单一值或算术表达式
     * @param table
     * @param record
     * @param simExpTreeNode
     * @return 单一值或算术表达式的值
     */
    public Value simExpTreeNodeAnalyzer(Table table, List<String> record, SimExpTreeNode simExpTreeNode) {
        if (simExpTreeNode.type == 2) return bitExpTreeNodeAnalyzer(table, record, simExpTreeNode.bitExpTreeNode);
        Value value = new Value();
        if(simExpTreeNode.type == 0) /*存储的是数值*/{
            value.type = simExpTreeNode.valType;
            value.val = simExpTreeNode.content;
        } else if (simExpTreeNode.type == 1) /* 存储的是列名 */ {
            String type = table.attributes.get(simExpTreeNode.content).attriType;
            if (type == "INT") value.type = 0;
            else if (type == "FLOAT") value.type = 1;
            else if (type == "CHAR") value.type = 2;
            value.val = record.get(table.attrOrder.get(simExpTreeNode.content));
        }
        return value;
    }

    public Value calInt(Value valueLeft, Value valueRight, String operation) {
        int left = Integer.parseInt(valueLeft.val), right = Integer.parseInt(valueRight.val);
        if (operation.equals("+")) {
            return new Value(left + right);
        } else if (operation.equals("-")) {
            return new Value(left - right);
        } else if (operation.equals("*")) {
            return new Value(left * right);
        } else if (operation.equals("/")) {
            return new Value(left / right);
        } else if (operation.equals("%")) {
            return new Value(left % right);
        } else /* ^ */ {
            return new Value((int)Math.pow(left, right));
        }
    }

    public Value calFloat(Value valueLeft, Value valueRight, String operation) {
        float left = Float.parseFloat(valueLeft.val), right = Float.parseFloat(valueRight.val);
        if (operation.equals("+")) {
            return new Value(left + right);
        } else if (operation.equals("-")) {
            return new Value(left - right);
        } else if (operation.equals("*")) {
            return new Value(left * right);
        } else if (operation.equals("/")) {
            return new Value(left / right);
        } else { /* error */
            return null;
        }
    }

    public Value calString(Value valueLeft, Value valueRight, String operation) {
        String left = valueLeft.val, right = valueRight.val;
        if (operation.equals("+")) {
            return new Value(left + right);
        } else { /* error */
            return null;
        }
    }

    /**
     *
     * @param valueLeft
     * @param valueRight
     * @param type: 0表示比较INT，1表示比较FLOAT
     * @param operation
     * @return
     */
    public boolean compareNumericalValue(Value valueLeft, Value valueRight, int type, String operation) {
        if (operation.equals("==")) {
            return type == 0 ? Integer.parseInt(valueLeft.val) == Integer.parseInt(valueRight.val) : Float.parseFloat(valueLeft.val) == Float.parseFloat(valueRight.val);
        } else if (operation.equals("!=")) {
            return type == 0 ? Integer.parseInt(valueLeft.val) != Integer.parseInt(valueRight.val) : Float.parseFloat(valueLeft.val) != Float.parseFloat(valueRight.val);
        } else if (operation.equals("<")) {
            return type == 0 ? Integer.parseInt(valueLeft.val) < Integer.parseInt(valueRight.val) : Float.parseFloat(valueLeft.val) < Float.parseFloat(valueRight.val);
        } else if (operation.equals(">")) {
            return type == 0 ? Integer.parseInt(valueLeft.val) > Integer.parseInt(valueRight.val) : Float.parseFloat(valueLeft.val) > Float.parseFloat(valueRight.val);
        } else if (operation.equals("<=")) {
            return type == 0 ? Integer.parseInt(valueLeft.val) <= Integer.parseInt(valueRight.val) : Float.parseFloat(valueLeft.val) <= Float.parseFloat(valueRight.val);
        } else /* >= */ {
            return type == 0 ? Integer.parseInt(valueLeft.val) >= Integer.parseInt(valueRight.val) : Float.parseFloat(valueLeft.val) >= Float.parseFloat(valueRight.val);
        }
    }

    public boolean compareString(Value valueLeft, Value valueRight, String operation) {
        String left = valueLeft.val, right = valueRight.val;
        if (operation.equals("==")) {
            return left.compareTo(right) == 0;
        } else if (operation.equals("!=")) {
            return left.compareTo(right) != 0;
        } else if (operation.equals("<")) {
            return left.compareTo(right) < 0;
        } else if (operation.equals(">")) {
            return left.compareTo(right) > 0;
        } else if (operation.equals("<=")) {
            return left.compareTo(right) <= 0;
        } else {
            return left.compareTo(right) >= 0;
        }
    }


    public static void main(String[] args) {
        RecordManager recordManager = new RecordManager();
//        recordManager.createTable("hello");
//        recordManager.dropTable("hello");

//        String sql = "CREATE TABLE test (id1 int default 1, id2 float not null, id3 char(5) default 'hello', primary key (id1), unique (id1, id2));";
        //String sql = "DROP INDEX index1 ON test;";
//        String sql = "INSERT INTO test (id1, id2) VALUES ('hello', 5.1)";
//        String sql = "select id1, id2 from test where (id1+1)>0 && id2>=12 || !(id3 == 0 && id4 < -1);";
//        String sql = "select id1, id2 from test where !(id3 == 0) && (id > 0 || id3 == 0);";
//        String sql = "select id, name from test where (id+3)*2.1 > 0 && ab < 5 order by id ASC, ab;";
        String sql = "update test set stuName='liutao', stuAge=13 where id > 5;";


        /* 1. Lexer Analysis */
        MiniSQLLexer lexer = new MiniSQLLexer(CharStreams.fromString(sql));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        /* 2. Syntax Analysis */
        MiniSQLParser parser = new MiniSQLParser(tokens);
        ParseTree tree = parser.root_statement();

        /* 3. Application based on Syntax Tree */
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);

        Command command = EvalVisitor.commandSet.retCurCommand();
//        recordManager.insert(command);

        System.out.println("");

        Table table = new Table();
        table.tableName = "test";
        table.attrOrder = new HashMap<String, Integer>();
        table.attrOrder.put("id1", 0);
        table.attrOrder.put("id2", 1);
        table.attrOrder.put("id3", 2);
        table.attrOrder.put("id4", 3);
        Attribute attribute1 = new Attribute();
        Attribute attribute2 = new Attribute();
        Attribute attribute3 = new Attribute();
        Attribute attribute4 = new Attribute();
        attribute1.attriType = "INT";
        attribute2.attriType = "INT";
        attribute3.attriType = "INT";
        attribute4.attriType = "INT";
        table.attributes = new HashMap<String, Attribute>();
        table.attributes.put("id1", attribute1);
        table.attributes.put("id2", attribute2);
        table.attributes.put("id3", attribute3);
        table.attributes.put("id4", attribute4);
        List<String> record = new ArrayList<String>();
        record.add("-1");
        record.add("1");
        record.add("13");
        record.add("4");
        boolean flag = recordManager.condition(table, record, command.whereClause);
        System.out.println(flag);
    }

    public class Value {
        // 0: INT
        // 1: FLOAT
        // 2: CHAR
        // 3: null
        public int type;
        public String val;

        Value() {}

        Value(int ival) {
            val = String.valueOf(ival);
        }

        Value(float fval) {
            val = String.valueOf(fval);
        }

        Value(String sval) {
            val = sval;
        }
    }
}
