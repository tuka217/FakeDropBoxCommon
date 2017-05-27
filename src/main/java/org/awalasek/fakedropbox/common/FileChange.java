package org.awalasek.fakedropbox.common;

public interface FileChange {
    String getUsername();
    String getFilename();
    ChangeType getChangeType();
}
