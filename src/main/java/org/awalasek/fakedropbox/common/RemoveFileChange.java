package org.awalasek.fakedropbox.common;

class RemoveFileChange extends AbstractFileChange {

    RemoveFileChange(String username, String filePath) {
        super(username, filePath, ChangeType.REMOVE);
    }
}
