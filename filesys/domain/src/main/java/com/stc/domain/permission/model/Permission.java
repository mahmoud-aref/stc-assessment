package com.stc.domain.permission.model;

import com.stc.domain.group.model.Group;

import java.util.UUID;

public class Permission {

    private UUID id;
    private String userEmail;
    private PermissionLevel level;
    private Group group;

    public Permission() {
    }

    public Permission(UUID id, String userEmail, PermissionLevel level, Group group) {
        this.id = id;
        this.userEmail = userEmail;
        this.level = level;
        this.group = group;
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

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
