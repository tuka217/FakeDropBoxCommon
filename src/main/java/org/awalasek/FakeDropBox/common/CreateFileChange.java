package org.awalasek.FakeDropBox.common;

public class CreateFileChange extends AbstractFileChange {

    public CreateFileChange(String filePath) {
        super(filePath, ChangeType.CREATE);
    }
}
