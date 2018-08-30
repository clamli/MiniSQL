import Interpreter.Command.Command;
import Interpreter.EvalVisitor;
import antlr.gen.MiniSQLLexer;
import antlr.gen.MiniSQLParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MiniSQL {

    private static MiniSQL miniSQL = new MiniSQL();
    private static EvalVisitor eval = new EvalVisitor();

    /**
     * 读入命令行输入
     * @param prompt
     * @return input string
     */
    private String readCommandFromConsole(String prompt) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        try {
            System.out.print(prompt);
            str = bf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }


    /**
     * 调用解释器分析命令内容，返回命令各个部分信息
     * @param sql
     * @return Command content
     */
    private Command callInterpreter(String sql) {
        /* 1. Lexer Analysis */
        MiniSQLLexer lexer = new MiniSQLLexer(CharStreams.fromString(sql));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        /* 2. Syntax Analysis */
        MiniSQLParser parser = new MiniSQLParser(tokens);
        ParseTree tree = parser.root_statement();

        /* 3. Application based on Syntax Tree */
        eval.visit(tree);

        return EvalVisitor.commandSet.retCurCommand();
    }

    public static void main(String[] args) {
//        String sql = "select id, name from test where (id+3)*2.1 > 0 && ab < 5 order by id ASC, ab;";
//        String sql = "delete from test where id > 5;";
//        String sql = "update test set stuName='liutao', stuAge=13 where id > 5;";
//        String sql = "create database test;";
//        String sql = "CREATE TABLE test (id1 int default 1, id2 float not null, id3 char(5) default 'hello' , primary key (id1), unique (id1, id2));";
//        String sql = "CREATE UNIQUE INDEX index1 ON test (id1, id2, id3);";
//        String sql = "DROP INDEX index1 ON test;";

        while (true) {
            String sql = miniSQL.readCommandFromConsole("MiniSQL> ");
            Command command = miniSQL.callInterpreter(sql);
            if (command.comm.equals("EXIT")) {
                break;
            } else if (command.comm.equals("SELECT")) {

            } else if (command.comm.equals("DELETE")) {

            } else if (command.comm.equals("INSERT")) {

            } else if (command.comm.equals("UPDATE")) {

            } else if (command.comm.equals("CREATEDATABASE")) {

            } else if (command.comm.equals("DROPDATABASE")) {

            } else if (command.comm.equals("CREATETABLE")) {

            } else if (command.comm.equals("DROPTABLE")) {

            } else if (command.comm.equals("CREATEINDEX")) {

            } else if (command.comm.equals("DROPINDEX")) {

            }
        }


    }
}
