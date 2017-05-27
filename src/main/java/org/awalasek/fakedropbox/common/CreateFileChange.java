package org.awalasek.fakedropbox.common;

class CreateFileChange extends AbstractFileChange {

    CreateFileChange(String username, String filePath) {
        super(username, filePath, ChangeType.CREATE);
    }
}
