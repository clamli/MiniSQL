package CatalogManager;

import java.io.Serializable;

public class Attribute implements Serializable {
    public String attriName;
    // INT, FLOAT, CHAR
    public String attriType;
    public int attrSize;
    // 如果没有默认值，default=null
    public String defValue;
}
