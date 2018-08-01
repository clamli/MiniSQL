package Interpreter.Command;

/**
 *  type == 0 : factor
 *  type == 1 : simple expression
 */
public class BitExpTreeNode {
    private int type;
    private String operation;
    public BitExpTreeNode left;
    public BitExpTreeNode right;
    public SimExpTreeNode simExpTreeNode;

    public void setType(int o_type) {
        this.type = o_type;
    }

    public int getType() {
        return this.type;
    }

    public void setOperation(String o_operation) {
        this.operation = o_operation;
    }

    public String getOperation() {
        return this.operation;
    }
}
