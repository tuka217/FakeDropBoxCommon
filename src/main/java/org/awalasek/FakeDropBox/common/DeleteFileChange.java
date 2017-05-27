package org.awalasek.FakeDropBox.common;

public class DeleteFileChange extends AbstractFileChange {

    public DeleteFileChange(String filePath) {
        super(filePath, ChangeType.REMOVE);
    }
}
