package CatalogManager;

import Interpreter.Command.Command;
import Interpreter.EvalVisitor;
import antlr.gen.MiniSQLLexer;
import antlr.gen.MiniSQLParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


import java.io.*;
import java.util.*;

public class CatalogManager {

    private static String tableInfoPath = "Catalog/table catalog";
    private static Map<String, Integer> sizeMap = new HashMap<String, Integer>();
    static {
        sizeMap.put("INT", 4);
        sizeMap.put("FLOAT", 4);
        sizeMap.put("CHAR", 1);
    }
    private static Map<String, Table> tables;

    /**
     * 单例模式，因为Catalog Manager在整个MiniSQL运行过程中只需要有一个实例
     */
    private static class CMHolder {
        public static CatalogManager instance = new CatalogManager();
    }
    CatalogManager() {
        tables = new HashMap<String, Table>();
        initCatalogManager();
    }
    public static CatalogManager getInstance() {
        return CMHolder.instance;
    }

    /**
     * 初始化Catalog Manager, 将所有表头信息读入并存到
     * map结构中供后续调用
     */
    public void initCatalogManager() {
        try {
            // 如果没有该表目录文件，则需要先创建
            File file = new File(tableInfoPath);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileInputStream freader = new FileInputStream(tableInfoPath);
            ObjectInputStream objectInputStream = new ObjectInputStream(freader);
            tables = (Map<String, Table>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // 当第一次使用数据库时，文件中无内容，
            // 因此直接将tables初始化成空的即可
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 关闭数据库时调用，将所有表头信息存入磁盘中
     */
    public void storeCatalogManager() {
        try {
            FileOutputStream outStream = new FileOutputStream(tableInfoPath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outStream);
            objectOutputStream.writeObject(tables);
            outStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 提供给record manager，根据表名获取表头信息
     * @param tableName
     * @return Table实例
     */
    public Table getTable(String tableName) {
        return tables.get(tableName);
    }

    /**
     * 建表时调用，存储所有表头信息
     * @param command: 建表指令
     * @return 返回建表是否成功
     */
    public boolean createTable(Command command) {
        // 表名重复
        if (tables.containsKey(command.tblName))
            return false;

        Table table = new Table();
        table.tableName = command.tblName;
        table.recordNum = 0;
        table.primaryKey = command.primaryKey;
        table.attributes = new HashMap<String, Attribute>();
        table.nullAttrs = new HashSet<String>(Arrays.asList(command.nulls));
        table.notNullAttrs = new HashSet<String>(Arrays.asList(command.notNulls));
        table.uniqueKeys = new HashSet<String>(Arrays.asList(command.uniqueKey));
        // 初始化属性信息
        int recSize = 0, order = 0;
        for (String id : command.typeMap.keySet()) {
            Attribute attribute = new Attribute();
            attribute.attriName = id;
            attribute.attriType = command.typeMap.get(id);
            attribute.defValue = command.valueMap.get(id);
            if (attribute.attriType.equals("CHAR"))
                attribute.attrSize = sizeMap.get("CHAR") * attribute.defValue.length();
            else
                attribute.attrSize = sizeMap.get(attribute.attriType);
            table.attributes.put(id, attribute);
            table.attrOrder.put(id, order++);
            recSize += attribute.attrSize;
        }
        table.recordSize = recSize;
        tables.put(table.tableName, table);
        return true;
    }

    /**
     * 删表时调用，删除所有表头信息
     * @param command: 删表指令
     * @return  返回删表是否成功
     */
    public boolean dropTable(Command command) {
        return tables.remove(command.tblName) != null;
    }

    /**
     * 更新对应表的记录条数
     * @param tableName: 对应表名， number: 变化数字
     * @return 是否更新成功
     */
    public boolean updateRecordNumber(String tableName, int number) {
        Table table = tables.get(tableName);
        int newNumber = table.recordNum + number;
        if (newNumber < 0) {
            return false;
        } else {
            table.recordNum = newNumber;
            return true;
        }
    }

    public static void main(String args[]) {
//        CatalogManager catalogManager = new CatalogManager();
//        Table table = new Table();
//        table.tableName = "hello";
//        table.recordNum = 5;
//        table.recordSize = 10;
//        catalogManager.tables.put("first", table);
//        catalogManager.storeCatalogManager();

//        for (String key : catalogManager.tables.keySet()) {
//            System.out.println(key + " " + catalogManager.tables.get(key).tableName);
//        }

        String sql = "CREATE TABLE test (id1 int default 1, id2 float not null, id3 char(5) default 'hello', primary key (id1), unique (id1, id2));";
        //String sql = "DROP INDEX index1 ON test;";

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

//        Map<String, Table> table = CatalogManager.getInstance().getTables();
//        System.out.println(table.size());
    }
}
