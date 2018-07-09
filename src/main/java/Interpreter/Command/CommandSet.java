package Interpreter.Command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandSet {
    /**
     * Map<status(New/Old), commands></>
     */
    private Map<String, List<Command>> comm_map;

    public CommandSet() {
        comm_map = new HashMap<String, List<Command>>();
        comm_map.put("OLD", new ArrayList<Command>());
        comm_map.put("NEW", new ArrayList<Command>());
    }
}
