package Interpreter;


import Interpreter.Command.*;
import antlr.gen.MiniSQLBaseVisitor;
import antlr.gen.MiniSQLLexer;
import antlr.gen.MiniSQLParser;
import javafx.util.Pair;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.Method;
import java.util.*;


public class EvalVisitor extends MiniSQLBaseVisitor {

    public static CommandSet commandSet = new CommandSet();

    public <T> ClauseTreeNode expFactorHandler(List<T> exp_factors, Method method, String operation) {
        ClauseTreeNode root = null;
        try {
            if (exp_factors.size() == 1 && !operation.equals("NOT"))
                return (ClauseTreeNode) method.invoke(EvalVisitor.class.newInstance(), exp_factors.get(0));
            root = new ClauseTreeNode();
            ClauseTreeNode node = root;
            if (operation.equals("NOT")) {
                node.operation = operation;
                node.child = (ClauseTreeNode) method.invoke(EvalVisitor.class.newInstance(), exp_factors.get(0));
                return node;
            }
            for ( int i = 0; i < exp_factors.size(); i++ ) {
                node.operation = operation;
                node.child = (ClauseTreeNode) method.invoke(EvalVisitor.class.newInstance(), exp_factors.get(i));
                if (i != exp_factors.size()-1) {
                    node.sibling = new ClauseTreeNode();
                    node = node.sibling;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return root;
    }

    public CompExpTreeNode compExpHandler(List<MiniSQLParser.Bit_exprContext> bit_exprs, Method method, String operation) {
        CompExpTreeNode compExpTreeNode = new CompExpTreeNode();
        try {
            compExpTreeNode.operation = operation;
            compExpTreeNode.left = (BitExpTreeNode) method.invoke(EvalVisitor.class.newInstance(), bit_exprs.get(0));
            compExpTreeNode.right = (BitExpTreeNode) method.invoke(EvalVisitor.class.newInstance(), bit_exprs.get(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return compExpTreeNode;
    }

    public <T> BitExpTreeNode bitExpHandler(List<T> bit_exprs, Method method, String operation) {
        BitExpTreeNode bitExpTreeNode = null;
        try {
            if (bit_exprs.size() == 1)
                return (BitExpTreeNode) method.invoke(EvalVisitor.class.newInstance(), bit_exprs.get(0));
            bitExpTreeNode = new BitExpTreeNode();
//            bitExpTreeNode.setType(0);          /* set node type as factor */
            bitExpTreeNode.operation = operation;
            bitExpTreeNode.left = (BitExpTreeNode) method.invoke(EvalVisitor.class.newInstance(), bit_exprs.get(0));
            bitExpTreeNode.right = (BitExpTreeNode) method.invoke(EvalVisitor.class.newInstance(), bit_exprs.get(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitExpTreeNode;
    }

    public <T> BitExpTreeNode simExpHandler(MiniSQLParser.Simple_exprContext simple_expr, Method method) {
        BitExpTreeNode bitExpTreeNode = null;
        try {
            bitExpTreeNode = new BitExpTreeNode();
            bitExpTreeNode.simExpTreeNode = new SimExpTreeNode();
//            bitExpTreeNode.setType(1);         /* set node type as simExpTreeNode */
            if (simple_expr.literal_value() != null) {
                bitExpTreeNode.simExpTreeNode.type = 0;
                if (simple_expr.literal_value().string_literal() != null) bitExpTreeNode.simExpTreeNode.valType = 2;
                else if (simple_expr.literal_value().NULL_SYM() != null) bitExpTreeNode.simExpTreeNode.valType = 3;
                else if (simple_expr.literal_value().number_literal().INTEGER_NUM() != null) bitExpTreeNode.simExpTreeNode.valType = 0;
                else if (simple_expr.literal_value().number_literal().REAL_NUM() != null) bitExpTreeNode.simExpTreeNode.valType = 1;
//                    String sign = simple_expr.literal_value().number_literal().getChild(0).getText();
                bitExpTreeNode.simExpTreeNode.content = simple_expr.literal_value().getText();
            } else if (simple_expr.column_spec() != null) {
                bitExpTreeNode.simExpTreeNode.type = 1;
                bitExpTreeNode.simExpTreeNode.content = simple_expr.column_spec().getText();
            } else {
                bitExpTreeNode.simExpTreeNode.type = 2;
                bitExpTreeNode.simExpTreeNode.bitExpTreeNode = (BitExpTreeNode) method.invoke(EvalVisitor.class.newInstance(), simple_expr.bit_expr());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitExpTreeNode;
    }

    @Override
    public BitExpTreeNode visitFactor2(MiniSQLParser.Factor2Context ctx) {
        BitExpTreeNode bitExpTreeNode = null;
        try {
            bitExpTreeNode = simExpHandler(ctx.simple_expr(),
                    EvalVisitor.class.getMethod("visitBit_expr", MiniSQLParser.Bit_exprContext.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return bitExpTreeNode;
    }

    @Override
    public BitExpTreeNode visitFactor1(MiniSQLParser.Factor1Context ctx) {
        BitExpTreeNode bitExpTreeNode = null;
        try {
            bitExpTreeNode = bitExpHandler(ctx.factor2(),
                    EvalVisitor.class.getMethod("visitFactor2", MiniSQLParser.Factor2Context.class),
                    ctx.getChildCount() == 1 ? "" : ctx.getChild(1).getText());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return bitExpTreeNode;
    }

    @Override
    public BitExpTreeNode visitBit_expr(MiniSQLParser.Bit_exprContext ctx) {
        BitExpTreeNode bitExpTreeNode = null;
        try {
            bitExpTreeNode = bitExpHandler(ctx.factor1(),
                    EvalVisitor.class.getMethod("visitFactor1", MiniSQLParser.Factor1Context.class),
                    ctx.getChildCount() == 1 ? "" : ctx.getChild(1).getText());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return bitExpTreeNode;
    }

    @Override
    public ClauseTreeNode visitExp_factor4(MiniSQLParser.Exp_factor4Context ctx) {
        ClauseTreeNode clauseTreeNode;
        if (ctx.expression() != null) {
            clauseTreeNode = visitExpression(ctx.expression());
        } else {
            CompExpTreeNode compExpTreeNode = null;
            try {
                compExpTreeNode = compExpHandler(ctx.bit_expr(),
                        EvalVisitor.class.getMethod("visitBit_expr", MiniSQLParser.Bit_exprContext.class), ctx.relational_op().getText());
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
            clauseTreeNode = new ClauseTreeNode();
            clauseTreeNode.compExpTreeNode = compExpTreeNode;
        }
        return clauseTreeNode;
    }

    @Override
    public ClauseTreeNode visitExp_factor3(MiniSQLParser.Exp_factor3Context ctx) {
        ClauseTreeNode clauseTreeNode = null;
        try {
            clauseTreeNode = expFactorHandler(new ArrayList<MiniSQLParser.Exp_factor4Context>(Arrays.asList(ctx.exp_factor4())),
                    EvalVisitor.class.getMethod("visitExp_factor4", MiniSQLParser.Exp_factor4Context.class),
                    ctx.NOT_SYM() == null ? "" : "NOT");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return clauseTreeNode;
    }

    @Override
    public ClauseTreeNode visitExp_factor2(MiniSQLParser.Exp_factor2Context ctx) {
        ClauseTreeNode clauseTreeNode = null;
        try {
            clauseTreeNode = expFactorHandler(ctx.exp_factor3(),
                    EvalVisitor.class.getMethod("visitExp_factor3", MiniSQLParser.Exp_factor3Context.class),
                    ctx.AND_SYM() == null ? "" : "AND");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return clauseTreeNode;
    }

    @Override
    public ClauseTreeNode visitExp_factor1(MiniSQLParser.Exp_factor1Context ctx) {
        ClauseTreeNode clauseTreeNode = null;
        try {
            clauseTreeNode = expFactorHandler(ctx.exp_factor2(),
                    EvalVisitor.class.getMethod("visitExp_factor2", MiniSQLParser.Exp_factor2Context.class),
                    ctx.XOR_SYM() == null ? "" : "XOR");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return clauseTreeNode;
    }

    @Override
    public ClauseTreeNode visitExpression(MiniSQLParser.ExpressionContext ctx) {
        ClauseTreeNode clauseTreeNode = null;
        try {
            clauseTreeNode = expFactorHandler(ctx.exp_factor1(),
                    EvalVisitor.class.getMethod("visitExp_factor1", MiniSQLParser.Exp_factor1Context.class),
                    ctx.OR_SYM() == null ? "" : "OR");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return clauseTreeNode;
    }

    @Override
    public Integer visitWhere_clause(MiniSQLParser.Where_clauseContext ctx) {
        commandSet.setWhereClause(visitExpression(ctx.expression()));
        return 0;
    }

    @Override
    public Object visitOrderby_clause(MiniSQLParser.Orderby_clauseContext ctx) {
        List<ParseTree> children = ctx.children;
        List<Pair<String, String>> clause = new ArrayList<Pair<String, String>>();
        for (int i = 2; i < children.size(); i += 2) {
            if (children.get(i).getChildCount() == 1)  /* Default order : ASC */
                clause.add(new Pair<String, String>(children.get(i).getChild(0).getText(), "ASC"));
            else
                clause.add(new Pair<String, String>(children.get(i).getChild(0).getText(), children.get(i).getChild(1).getText().toUpperCase()));
        }
        commandSet.setOrderClause(clause);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSelect_statement(MiniSQLParser.Select_statementContext ctx) {
        List<ParseTree> children = ctx.children;
        commandSet.addCommand("NEW");                                /* command status */
        commandSet.setCommandName(children.get(0).getText().toUpperCase());       /* command name */
        commandSet.setColumnsName(children.get(1).getText().split(","));   /* columns name */
        commandSet.setTableName(children.get(3).getText());                       /* table name */
        return visitChildren(ctx);
    }

    @Override
    public Object visitDelete_statement(MiniSQLParser.Delete_statementContext ctx) {
        List<ParseTree> children = ctx.children;
        commandSet.addCommand("NEW");                                /* command status */
        commandSet.setCommandName(children.get(0).getText().toUpperCase());       /* command name */
        commandSet.setTableName(children.get(2).getText());                       /* table name */
        return visitChildren(ctx);
    }

    @Override
    public Object visitInsert_statement(MiniSQLParser.Insert_statementContext ctx) {
        List<ParseTree> children = ctx.children;
        commandSet.addCommand("NEW");                                /* command status */
        commandSet.setCommandName(children.get(0).getText().toUpperCase());       /* command name */
        commandSet.setTableName(children.get(2).getText());                       /* table name */
        Map<String, String> valueMap = new HashMap<String, String>();            /* insert values map*/
        String columnsName = children.get(3).getText();
        String columnsValue = children.get(4).getText();
        String[] columns = columnsName.substring(1, columnsName.length()-1).split(",");
        String[] values = columnsValue.substring(columnsValue.indexOf('(')+1, columnsValue.lastIndexOf(')')).split(",");
        for (int i = 0; i < columns.length; i++) {
            valueMap.put(columns[i], values[i].replace("\'", ""));
        }
        commandSet.setValueMap(valueMap);
        return null;
    }

    @Override
    public Object visitUpdate_statement(MiniSQLParser.Update_statementContext ctx) {
        List<ParseTree> children = ctx.children;
        commandSet.addCommand("NEW");                                /* command status */
        commandSet.setCommandName(children.get(0).getText().toUpperCase());       /* command name */
        commandSet.setTableName(children.get(1).getText());                       /* table name */
        String[] valuesArr = children.get(2).getText().substring(3).split(",");
        Map<String, String> valueMap = new HashMap<String, String>();
        for (String valueArr : valuesArr) {
            int pos = valueArr.indexOf('=');
            String name = valueArr.substring(0, pos);
            String value = valueArr.substring(pos+1).replace("\'", "");
            valueMap.put(name, value);
        }
        commandSet.setValueMap(valueMap);
        return visitChildren(ctx);
    }

    public void crtdrpHandler(List<ParseTree> children) {
        commandSet.addCommand("NEW");                                           /* command status */
        commandSet.setCommandName(children.get(0).getText().toUpperCase()+children.get(1).getText().toUpperCase());       /* command name */
        commandSet.setTableName(children.get(2).getText());                                   /* table name */
    }

    @Override
    public Object visitCreate_database_statement(MiniSQLParser.Create_database_statementContext ctx) {
        crtdrpHandler(ctx.children);
        return null;
    }

    @Override
    public Object visitDrop_database_statement(MiniSQLParser.Drop_database_statementContext ctx) {
        crtdrpHandler(ctx.children);
        return null;
    }

    @Override
    /**
     * @return {NULL OR NOT NULL, TYPE, int/float: DEFAULT VALUE OR NULL char: DEFAULT VALUE OR "    "}
     */
    public String[] visitColumn_data_type_header(MiniSQLParser.Column_data_type_headerContext ctx) {
        String status = "NULL";
        String type = ctx.getChild(0).getText().toUpperCase();
        String value = null;
//        if (type.equals("CHAR")) {      /* type : char initializes to "   " */
//            int size = Integer.parseInt(ctx.getChild(2).getText());
//            StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < size; i++) sb.append('#');
//            value = sb.toString();
//        }
        if (ctx.null_or_notnull() != null)
            status = ctx.null_or_notnull().getText().toUpperCase();       /* NOTNULL */
        if (ctx.DEFAULT() != null) {
            if (type.equals("CHAR")) {
//                String defvalue = ctx.TEXT_STRING().getText().replace("\'", "");
//                if (value.length() <= defvalue.length()) value = defvalue.substring(0, value.length());
//                else value = defvalue + value.substring(defvalue.length());
                value = ctx.TEXT_STRING().getText().replace("\'", "");
                int size = Integer.parseInt(ctx.getChild(2).getText());
                if (value.length() > size) value = value.substring(0, size);
                else { /* 把字符串补足指定长度 */
                    StringBuilder tail = new StringBuilder();
                    for (int i = 0; i < size - value.length(); i++) tail.append('#');
                    value += tail;
                }
            } else {
                value = ctx.number_literal().getText();
            }
        }
        return new String[] {status, type, value};
    }

    @Override
    public Pair<String, String[]> visitCreate_definition(MiniSQLParser.Create_definitionContext ctx) {
        Pair<String, String[]> ret;
        if (ctx.PRIMARY_SYM() != null) {
            ret = new Pair<String, String[]>("PRIMARY", new String[] {ctx.getChild(3).getText()});
        } else if (ctx.UNIQUE_SYM() != null) {
            String content = ctx.getText();
            String[] unique_keys = content.substring(content.indexOf('(')+1, content.indexOf(')')).split(",");
            ret = new Pair<String, String[]>("UNIQUE", unique_keys);
        } else {
            String name = ctx.getChild(0).getText();
            String[] status_type_value = visitColumn_data_type_header(ctx.column_data_type_header());
            ret = new Pair<String, String[]>(status_type_value[0], new String[] {name, status_type_value[1], status_type_value[2]});
        }
        return ret;
    }

    @Override
    public Object visitCreate_table_statement(MiniSQLParser.Create_table_statementContext ctx) {
        List<ParseTree> children = ctx.children;
        commandSet.addCommand("NEW");                                           /* command status */
        commandSet.setCommandName(children.get(0).getText().toUpperCase()+children.get(1).getText().toUpperCase());       /* command name */
        commandSet.setTableName(children.get(2).getText());
        Map<String, String> valueMap = new HashMap<String, String>();
        Map<String, String> typeMap = new HashMap<String, String>();
        List<String> nullList = new ArrayList<String>();
        List<String> notNullList = new ArrayList<String>();
        for (MiniSQLParser.Create_definitionContext crtdef : ctx.create_definition()) {
            Pair<String, String[]> result =  visitCreate_definition(crtdef);
            String key = result.getKey(), value[] = result.getValue();
            if (key.equals("PRIMARY")) commandSet.setPrimaryKey(value[0]);
            else if (key.equals("UNIQUE")) commandSet.setUniqueKey(value);
            else {
                if (key.equals("NULL"))
                    nullList.add(value[0]);
                else
                    notNullList.add(value[0]);
                valueMap.put(value[0], value[2]);
                typeMap.put(value[0], value[1]);
            }
        }
        commandSet.setNulls(nullList);
        commandSet.setNotNulls(notNullList);
        commandSet.setValueMap(valueMap);
        commandSet.setTypeMap(typeMap);
        return null;
    }

    @Override
    public Object visitDrop_table_statement(MiniSQLParser.Drop_table_statementContext ctx) {
        crtdrpHandler(ctx.children);
        return null;
    }

    @Override
    public Object visitCreate_index_statement(MiniSQLParser.Create_index_statementContext ctx) {
        List<ParseTree> children = ctx.children;
        commandSet.addCommand("NEW");                                           /* command status */
        commandSet.setCommandName(children.get(0).getText().toUpperCase()+children.get(2).getText().toUpperCase());       /* command name */
        commandSet.setIndexName(children.get(3).getText());                                 /* index name */
        commandSet.setTableName(children.get(5).getText());                                 /* table name */
        String ctx_text = ctx.getText();
        String[] columns = ctx_text.substring(ctx_text.indexOf('(')+1, ctx_text.lastIndexOf(')')).split(",");
        commandSet.setColumnsName(columns);
        return null;
    }

    @Override
    public Object visitDrop_index_statement(MiniSQLParser.Drop_index_statementContext ctx) {
        List<ParseTree> children = ctx.children;
        commandSet.addCommand("NEW");                                           /* command status */
        commandSet.setCommandName(children.get(0).getText().toUpperCase()+children.get(1).getText().toUpperCase());       /* command name */
        commandSet.setIndexName(children.get(2).getText());
        commandSet.setTableName(children.get(4).getText());
        return null;
    }

    @Override
    public Object visitExit(MiniSQLParser.ExitContext ctx) {
        commandSet.addCommand("NEW");
        commandSet.setCommandName("EXIT");
        return null;
    }

    public static void main(String args[]) {
        String sql = "select id1, id2 from test where (id1+1)>0 && id2>=12 || !(id3 == 0 && id4 < -1);";
//        String sql = "select id, name from test where (id+3)*2.1 >= 0 && ab < 5 order by id ASC, ab;";
//        String sql = "delete from test where id > 5;";
//        String sql = "update test set stuName='liutao', stuAge=13 where id > 5;";
//        String sql = "create database test;";
//        String sql = "CREATE TABLE test (id1 int default 1, id2 float not null, id3 char(15) default 'hello' , primary key (id1), unique (id1, id2));";
//        String sql = "CREATE UNIQUE INDEX index1 ON test (id1, id2, id3);";
//        String sql = "DROP INDEX index1 ON test;";

        /* 1. Lexer Analysis */
        MiniSQLLexer lexer = new MiniSQLLexer(CharStreams.fromString(sql));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        /* 2. Syntax Analysis */
        MiniSQLParser parser = new MiniSQLParser(tokens);
        ParseTree tree = parser.root_statement();

        /* 3. Application based on Syntax Tree */
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
    }
}

