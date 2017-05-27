package org.awalasek.fakedropbox.common;

class ModifyFileChange extends AbstractFileChange {

    ModifyFileChange(String username, String filePath) {
        super(username, filePath, ChangeType.MODIFY);
    }
}
