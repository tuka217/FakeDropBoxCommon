package org.awalasek.FakeDropBox.common;

public interface FileChange {
    String getFilePath();
    ChangeType getChangeType();
}
