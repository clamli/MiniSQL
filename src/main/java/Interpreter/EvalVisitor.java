package Interpreter;


import Interpreter.Command.ClauseTreeNode;
import Interpreter.Command.Command;
import Interpreter.Command.CommandSet;
import antlr.gen.MiniSQLBaseVisitor;
import antlr.gen.MiniSQLLexer;
import antlr.gen.MiniSQLParser;
import javafx.util.Pair;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CharStreams;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class EvalVisitor extends MiniSQLBaseVisitor {

    private static CommandSet commandSet = new CommandSet();

    @Override
    public Object visitSelect_statement(MiniSQLParser.Select_statementContext ctx) {
        List<ParseTree> children = ctx.children;
        commandSet.addCommand("NEW");                                /* command status */
        commandSet.setCommandName(children.get(0).getText().toUpperCase());       /* command name */
        commandSet.setColumnsName(children.get(1).getText().split(","));   /* columns name */
        commandSet.setTableName(children.get(3).getText());                       /* table name */
        return visitChildren(ctx);
    }

    public <T> ClauseTreeNode expFactorHandler(List<T> exp_factors, Method method, String operation) {
        ClauseTreeNode root = new ClauseTreeNode();
        ClauseTreeNode node = root;
        try {
            if (exp_factors.size() == 1)
                return (ClauseTreeNode) method.invoke(EvalVisitor.class.newInstance(), exp_factors.get(0));
            if (operation.equals("NOT")) {
                node.setOperation(operation);
                node.setChild((ClauseTreeNode) method.invoke(EvalVisitor.class.newInstance(), exp_factors.get(0)));
                return node;
            }
            for ( T exp_factor : exp_factors ) {
                node.setOperation(operation);
                node.setChild((ClauseTreeNode) method.invoke(EvalVisitor.class.newInstance(), exp_factor));
                node = node.sibling;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return root;
    }

    @Override
    public ClauseTreeNode visitExp_factor3(MiniSQLParser.Exp_factor3Context ctx) {
        ClauseTreeNode clauseTreeNode = null;
        try {
            clauseTreeNode = expFactorHandler(new ArrayList<MiniSQLParser.Exp_factor4Context>(Arrays.asList(ctx.exp_factor4())),
                    EvalVisitor.class.getMethod("visitExp_factor4", MiniSQLParser.Exp_factor4Context.class),
                    "NOT");
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
                    "AND");
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
                    "XOR");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return clauseTreeNode;
//        List<MiniSQLParser.Exp_factor2Context> exp_factor2s = ctx.exp_factor2();
//        if (exp_factor2s.size() == 1)
//            return visitExp_factor2(exp_factor2s.get(0));
//        ClauseTreeNode root = new ClauseTreeNode();
//        ClauseTreeNode node = root;
//        for (MiniSQLParser.Exp_factor2Context exp_factor2 : exp_factor2s) {
//            node.setOperation("XOR");
//            node.setLeftChild(visitExp_factor2(exp_factor2));
//            node = node.left;
//        }
//        return root;
    }

    @Override
    public ClauseTreeNode visitExpression(MiniSQLParser.ExpressionContext ctx) {
        ClauseTreeNode clauseTreeNode = null;
        try {
            clauseTreeNode = expFactorHandler(ctx.exp_factor1(),
                    EvalVisitor.class.getMethod("visitExp_factor1", MiniSQLParser.Exp_factor1Context.class),
                    "OR");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return clauseTreeNode;
//        List<MiniSQLParser.Exp_factor1Context> exp_factor1s = ctx.exp_factor1();
//        if (exp_factor1s.size() == 1)
//            return visitExp_factor1(exp_factor1s.get(0));
//        ClauseTreeNode root = new ClauseTreeNode();
//        ClauseTreeNode node = root;
//        for (MiniSQLParser.Exp_factor1Context exp_factor1 : exp_factor1s ) {
//            node.setOperation("OR");
//            node.setLeftChild(visitExp_factor1(exp_factor1));
//            node = node.left;
//        }
//        return root;
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
            clause.add(new Pair<String, String>(children.get(i).getChild(0).getText(), children.get(i).getChild(1).getText()));
        }
        commandSet.setOrderClause(clause);
        return visitChildren(ctx);
    }


    public static void main(String args[]) throws Exception {
        String sql = "select id, name from test where id > 0 && id > 0;";

        // 1. Lexer Analysis
        MiniSQLLexer lexer = new MiniSQLLexer(CharStreams.fromString(sql));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 2. Syntax Analysis
        MiniSQLParser parser = new MiniSQLParser(tokens);
        ParseTree tree = parser.root_statement();

        // 3. Application based on Syntax Tree
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
//        System.out.println();
    }
}

