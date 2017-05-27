package org.awalasek.fakedropbox.common;

abstract class AbstractFileChange implements FileChange {

    private String username;
    private String filePath;
    private ChangeType changeType;

    protected AbstractFileChange(String username, String filePath, ChangeType changeType) {
        this.filePath = filePath;
        this.changeType = changeType;
    }
    
    @Override
    public String getUsername() {
        return username;
    }
    
    @Override
    public String getFilename() {
        return filePath;
    }

    @Override
    public ChangeType getChangeType() {
        return changeType;
    }

}
