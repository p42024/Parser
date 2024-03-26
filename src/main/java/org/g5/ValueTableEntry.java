package org.g5;

public class ValueTableEntry {
    private Object value;
	private Class<?> type;

    public ValueTableEntry(Class<?> type, Object value) {
        super();
        this.type = type;
        this.value = value;
    }

	public Class<?> getType() {
		return type;
	}

    public Object getValue() {
		return value;
	}
}
