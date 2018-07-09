package Interpreter;

import Interpreter.Command.Command;
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
    public Command selectCmdAnalyze(List<ParseTree> elements) {
        return new Command();
    }
}
