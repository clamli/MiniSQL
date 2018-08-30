package Interpreter.Command;

/**
 *  type == 0 : literal_value
 *  type == 1 : column_spec
 *  type == 2 : bit expr
 *
 *  valType == 0 : int
 *  valType == 1 : float
 *  valType == 2 : string
 *  valType == 3 : null
 */
public class SimExpTreeNode {
    public int valType;
    public int type;
    public String content;
    public BitExpTreeNode bitExpTreeNode;

//    public void setType(int o_type) {
//        this.type = o_type;
//    }
//
//    public int getType() {
//        return this.type;
//    }
//
//    public void setContent(String o_content) {
//        this.content = o_content;
//    }
//
//    public String getContent() {
//        return this.content;
//    }
}
