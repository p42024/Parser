package org.g5;

import java.util.HashMap;

public class ValueTable {
    private HashMap<String, ValueTableEntry> table;

    {
        table = new HashMap<>();
    }

    /**
     * @param id the identifier to check for.
     * @return Returns true if the value table contains an entry for this id.
     */
    public Boolean hasId(String id) {
        return table.containsKey(id);
    }

    /**
     * @param id the identifier of the object to look for.
     * @return Returns the type of the object found, otherwise null.
     */
    public Class<?> getType(String id) {
        ValueTableEntry entry = this.table.get(id);
        if (entry == null) {
            return null;
        }

        return entry.getType();
    }

    /**
     * @param id the identifier of the object to look for.
     * @return Returns the value of the object found, otherwise null.
     */
    public Object getValue(String id) {
        ValueTableEntry entry = this.table.get(id);
        if (entry == null) {
            return null;
        }

        return entry.getValue();
    }

    /**
     * @param id the identifier to associate with the object to be inserted.
     * @param value the object to store in the value table.
     * @return Returns the ValueTableEntry if an object already exists in the value table. This value is overwritten. Returns null if no overwrite takes place.
     */
    public ValueTableEntry insertValue(String id, Object value) {
        ValueTableEntry entry = new ValueTableEntry(value.getClass(), value);

        return this.table.put(id, entry);
    }
}
