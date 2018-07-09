package Interpreter;


import Interpreter.Command.Command;
import Interpreter.Command.CommandSet;
import antlr.gen.MiniSQLBaseVisitor;
import antlr.gen.MiniSQLLexer;
import antlr.gen.MiniSQLParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CharStreams;

import java.util.ArrayList;
import java.util.List;


public class EvalVisitor extends MiniSQLBaseVisitor {

    private static CommandSet commandSet = new CommandSet();

    @Override
    public Command visitSelect_statement(MiniSQLParser.Select_statementContext ctx) {
        List<ParseTree> children = ctx.children;

//        children.get(0).getText();
        String[] columns_name = children.get(1).getText().split(",");
        String table_name = children.get(3).getText();

        System.out.println(children.size() + " "+columns_name[0]+" "+columns_name[1]);
//        for (ParseTree child : children) {
//
//        }
//        System.out.println(ctx.getChild(0).getChildCount());


        return Handler.getInstance().selectCmdAnalyze(ctx.children);
    }


    public static void main(String args[]) throws Exception {
        String sql = "select id, name from test where id == 1;";

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

