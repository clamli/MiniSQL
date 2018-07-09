package Interpreter.Command;

public class ClauseTreeNode<T> {
    private String operation;
    private String operator1;
    private T operator2;
    private ClauseTreeNode left;
    private ClauseTreeNode right;

    public void set(String o_operation, String o_operator1, T o_operator2) {
        this.operation = o_operation;
        this.operator1 = o_operator1;
        this.operator2 = o_operator2;
    }

    public String getOperation() {
        return this.operation;
    }

    public String getOperator1() {
        return this.operator1;
    }

    public T getOperator2() {
        return this.operator2;
    }
}
