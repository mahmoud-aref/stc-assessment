package com.stc.domain.permission.model;

import java.util.UUID;

public class Permission {

    private UUID id;
    private String userEmail;
    private PermissionLevel level;

    public Permission() {
    }

    public Permission(UUID id, String userEmail, PermissionLevel level) {
        this.id = id;
        this.userEmail = userEmail;
        this.level = level;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public PermissionLevel getLevel() {
        return level;
    }

    public void setLevel(PermissionLevel level) {
        this.level = level;
    }
}
