package org.awalasek.FakeDropBox.common;

public class ModifyFileChange extends AbstractFileChange {

    public ModifyFileChange(String filePath) {
        super(filePath, ChangeType.MODIFY);
    }
}
