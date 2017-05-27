package org.awalasek.FakeDropBox.common;

public abstract class AbstractFileChange implements FileChange {

    private String filePath;
    private ChangeType changeType;

    protected AbstractFileChange(String filePath, ChangeType changeType) {
        this.filePath = filePath;
        this.changeType = changeType;
    }
    
    @Override
    public String getFilePath() {
        return filePath;
    }

    @Override
    public ChangeType getChangeType() {
        return changeType;
    }

}
