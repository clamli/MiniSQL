package Interpreter.Command;

import javafx.util.Pair;
import java.util.*;

public class CommandSet {
    /**
     * Map<status(New/Old), commands></>
     */
    private Map<String, List<Command>> comm_map;
    private Command cur_comm;

    public CommandSet() {
        comm_map = new HashMap<String, List<Command>>();
        comm_map.put("OLD", new ArrayList<Command>());
        comm_map.put("NEW", new ArrayList<Command>());
    }

    /**
     * 增加一条待执行的命令
     * @param comm_status
     */
    public void addCommand(String comm_status) {
        cur_comm = new Command();
        comm_map.get(comm_status).add(cur_comm);
    }

    /**
     * 返回当前命令
     * @return command
     */
    public Command retCurCommand() {
        return cur_comm;
    }

    /**
     * 存储待执行命令的类型(Select/Delete/...)
     * @param comm_type
     */
    public void setCommandName(String comm_type) {
        cur_comm.comm = comm_type;
    }

    /**
     * 存储待执行命令的目标列名称
     * @param columns
     */
    public void setColumnsName(String[] columns) {
        cur_comm.clnNames = columns;
    }

    /**
     * 存储待执行命令的目标表格名称
     * @param table
     */
    public void setTableName(String table) {
        cur_comm.tblName = table;
    }

    /**
     * 存储索引名字
     * @param index
     */
    public void setIndexName(String index) {
        cur_comm.idxName = index;
    }

    /**
     * 存储表中的参数和值列表
     * @param values
     */
    public void setValueMap(Map<String, String> values) {
        cur_comm.valueMap = values;
    }

    /**
     * 存储表中的参数和类型列表
     * @param types
     */
    public void setTypeMap(Map<String, String> types) {
        cur_comm.typeMap = types;
    }

    /**
     * 存储表的主键
     * @param primary_key
     */
    public void setPrimaryKey(String primary_key) {
        cur_comm.primaryKey = primary_key;
    }

    /**
     * 存储表的唯一键
     * @param unique_key
     */
    public void setUniqueKey(String[] unique_key) {
        cur_comm.uniqueKey = unique_key;
    }

    /**
     * 存储表中可为NULL的值
     * @param nullList
     */
    public void setNulls(List<String> nullList) {
        cur_comm.nulls = nullList.toArray(new String[nullList.size()]);
    }

    /**
     * 存储表中不可为NULL的值
     * @param notNullList
     */
    public void setNotNulls(List<String> notNullList) {
        cur_comm.notNulls = notNullList.toArray(new String[notNullList.size()]);
    }

    /**
     * 存储待执行命令的Order子句
     * @param clause
     */
    public void setOrderClause(List<Pair<String, String>> clause) {
        cur_comm.orderClause = clause;
    }

    /**
     * 存储待执行命令的Where子句
     *
     */
    public void setWhereClause(ClauseTreeNode clause) {
        cur_comm.whereClause = clause;
    }
}
