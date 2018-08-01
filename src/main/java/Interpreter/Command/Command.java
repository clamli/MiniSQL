package Interpreter.Command;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Command {
    public String comm;
    public String tblName;
    public String idxName;
    public Map<String, String> valueMap;
    public Map<String, String> typeMap;
    public String[] clnNames;
    public ClauseTreeNode whereClause;
    public String primaryKey;
    public String[] uniqueKey;
    public String[] nulls;
    public String[] notNulls;
    /* <Column Name, ASC/DESC> */
    public List<Pair<String, String>> orderClause;
}
