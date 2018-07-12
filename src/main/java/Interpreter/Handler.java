package Interpreter;

import Interpreter.Command.ClauseTreeNode;
import Interpreter.Command.Command;
import antlr.gen.MiniSQLParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class Handler {

    private static class HandlerHolder{
        private static Handler instance = new Handler();
    }

    public static Handler getInstance(){
        return HandlerHolder.instance;
    }

    /**
     * 解析 Select 命令
     * @return Command
     */
    public ClauseTreeNode expFactorHandler(List<MiniSQLParser.Exp_factor1Context> exp_factor1s) {
        if (exp_factor1s.size() == 1)
            return visitExp_factor1(exp_factor1s.get(0));
        ClauseTreeNode root = new ClauseTreeNode();
        ClauseTreeNode node = root;
        for (MiniSQLParser.Exp_factor1Context exp_factor1 : exp_factor1s ) {
            node.setOperation("OR");
            node.setLeftChild(visitExp_factor1(exp_factor1));
            node = node.left;
        }
        return root;
    }
}
