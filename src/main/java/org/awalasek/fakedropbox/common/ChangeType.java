package org.awalasek.fakedropbox.common;

public enum ChangeType {
    CREATE("CREATE"), MODIFY("MODIFY"), REMOVE("REMOVE");
    
    private final String changeType;
    
    ChangeType(String changeType) {
        this.changeType = changeType;
    }
    
    @Override
    public String toString() {
        return changeType;
    }
    
}
