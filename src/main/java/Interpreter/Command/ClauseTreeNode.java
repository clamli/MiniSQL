package Interpreter.Command;

/**
 * @type: 0 => Operation Node (&&/||/...)
 *         1 => Expression Node (id == 1/...)
 * @param <T>
 */
public class ClauseTreeNode<T> {
    private int type;
    private String operation;
    private String operator1;
    private T operator2;
    public ClauseTreeNode child;
    public ClauseTreeNode sibling;

    public void setOperation(String o_operation) {
        this.operation = o_operation;
    }

    public void setChild(ClauseTreeNode o_child) {
        this.child = o_child;
    }

    public void setSiblingChild(ClauseTreeNode o_sibling) {
        this.sibling = o_sibling;
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
