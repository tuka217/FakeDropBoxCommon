package org.awalasek.fakedropbox.common;

import java.nio.file.Path;
import java.nio.file.WatchEvent.Kind;

import javax.servlet.http.HttpServletRequest;

import org.awalasek.fakedropbox.common.CreateFileChange;
import org.awalasek.fakedropbox.common.RemoveFileChange;
import org.awalasek.fakedropbox.common.ModifyFileChange;

public class FileChangeFactory {

    private String username;

    public FileChangeFactory() {
        this.username = null;
    }

    public FileChangeFactory(String username) {
        this.username = username;
    }

    public FileChange getFileChange(Kind<?> eventKind, Path child) {
        if (eventKind == null) {
            return null;
        }

        switch (eventKind.name()) {
        case "ENTRY_CREATE":
            return new CreateFileChange(username, child.toString());
        case "ENTRY_MODIFY":
            return new ModifyFileChange(username, child.toString());
        case "ENTRY_DELETE":
            return new RemoveFileChange(username, child.toString());
        }

        return null;
    }

    public FileChange getFileChange(HttpServletRequest request) {
        if (request == null) {
            return null;
        }

        String username = request.getParameter("username");
        String filename = request.getParameter("filename");
        ChangeType changeType = ChangeType.valueOf(request.getParameter("changeType"));

        switch (changeType) {
        case CREATE:
            return new CreateFileChange(username, filename);
        case MODIFY:
            return new ModifyFileChange(username, filename);
        case REMOVE:
            return new RemoveFileChange(username, filename);
        }

        return null;
    }

    public FileChange getFileChange(String username, Path filename, ChangeType changeType) {
        if (username == null || filename == null || changeType == null) {
            return null;
        }

        switch (changeType) {
        case CREATE:
            return new CreateFileChange(username, filename.toString());
        case MODIFY:
            return new ModifyFileChange(username, filename.toString());
        case REMOVE:
            return new RemoveFileChange(username, filename.toString());
        }

        return null;
    }

}
