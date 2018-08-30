package CatalogManager;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Table implements Serializable {
    public String tableName;
    public Map<String, Attribute> attributes;
    public Map<String, Integer> attrOrder;
    public int recordSize;
    public int recordNum;
    public String primaryKey;
    public Set<String> uniqueKeys;
    public Set<String> nullAttrs;
    public Set<String> notNullAttrs;
}
