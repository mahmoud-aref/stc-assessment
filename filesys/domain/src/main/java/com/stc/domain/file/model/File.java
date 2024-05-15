package com.stc.domain.file.model;

import com.stc.domain.item.model.Item;

import java.util.UUID;

public class File {

    private UUID id;
    private byte[] binary;
    private Item item;

    public File() {
    }

    public File(UUID id, byte[] binary, Item item) {
        this.id = id;
        this.binary = binary;
        this.item = item;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public byte[] getBinary() {
        return binary;
    }

    public void setBinary(byte[] binary) {
        this.binary = binary;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
