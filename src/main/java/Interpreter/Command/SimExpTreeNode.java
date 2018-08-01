package Interpreter.Command;

/**
 *  type == 0 : literal_value
 *  type == 1 : column_spec
 *  type == 2 : bit expr
 */
public class SimExpTreeNode {
    private int type;
    private String content;
    public BitExpTreeNode bitExpTreeNode;

    public void setType(int o_type) {
        this.type = o_type;
    }

    public int getType() {
        return this.type;
    }

    public void setContent(String o_content) {
        this.content = o_content;
    }

    public String getContent() {
        return this.content;
    }
}
