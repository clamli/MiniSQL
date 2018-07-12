package Interpreter.Command;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Command {
    private String comm;
    private String tblName;
    private List<String> clnNames;
    private ClauseTreeNode whereClause;
    /* <Column Name, ASC/DESC> */
    private List<Pair<String, String>> orderClause;

    public void setCommType(String commType) {
        this.comm = commType;
    }

    public void setClnNames(String[] columns) {
        this.clnNames = new ArrayList<String>(Arrays.asList(columns));
    }

    public void setTblName(String table) {
        this.tblName = table;
    }

    public void setOrdClause(List<Pair<String, String>> clause) {
        this.orderClause = clause;
    }

    public void setWhereClause(ClauseTreeNode clause) {
        this.whereClause = clause;
    }
}
