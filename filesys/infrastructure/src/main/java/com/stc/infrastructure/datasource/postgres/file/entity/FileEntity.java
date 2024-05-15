package com.stc.infrastructure.datasource.postgres.file.entity;

import com.stc.domain.file.model.File;
import com.stc.infrastructure.datasource.postgres.item.entity.ItemEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class FileEntity extends File {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Override
    public UUID getId() {
        return super.getId();
    }

    @Lob
    @Column(nullable = false)
    @Override
    public byte[] getBinary() {
        return super.getBinary();
    }

    @ManyToOne
    @JoinColumn(name = "item_id", nullable = false)
    @Override
    public ItemEntity getItem() {
        return (ItemEntity) super.getItem();
    }

}
