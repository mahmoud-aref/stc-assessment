package com.stc.domain.item.model;

import com.stc.domain.group.model.Group;

import java.util.UUID;

public class Item {

    private UUID id;
    private String name;
    private ItemType type;
    private Group group;

    public Item() {
    }

    public Item(UUID id, String name, ItemType type, Group group) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.group = group;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
