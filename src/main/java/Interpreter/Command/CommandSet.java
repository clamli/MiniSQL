package Interpreter.Command;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
     * 存储待执行命令的类型(Select/Delete/...)
     * @param comm_type
     */
    public void setCommandName(String comm_type) {
        cur_comm.setCommType(comm_type);
    }

    /**
     * 存储待执行命令的目标列名称
     * @param columns
     */
    public void setColumnsName(String[] columns) {
        cur_comm.setClnNames(columns);
    }

    /**
     * 存储待执行命令的目标表格名称
     * @param table
     */
    public void setTableName(String table) {
        cur_comm.setTblName(table);
    }

    /**
     * 存储待执行命令的Order子句
     * @param clause
     */
    public void setOrderClause(List<Pair<String, String>> clause) {
        cur_comm.setOrdClause(clause);
    }

    /**
     * 存储待执行命令的Where子句
     *
     */
    public void setWhereClause(ClauseTreeNode clause) {
        cur_comm.setWhereClause(clause);
    }
}
