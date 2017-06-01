package org.awalasek.fakedropbox.common;

public enum ChangeType {
    CREATE("CREATE"), REMOVE("REMOVE");
    
    private final String changeType;
    
    ChangeType(String changeType) {
        this.changeType = changeType;
    }
    
    @Override
    public String toString() {
        return changeType;
    }
    
}
