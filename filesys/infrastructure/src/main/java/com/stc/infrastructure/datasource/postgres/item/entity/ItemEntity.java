package com.stc.infrastructure.datasource.postgres.item.entity;

import com.stc.domain.item.model.Item;
import com.stc.domain.item.model.ItemType;
import com.stc.infrastructure.datasource.postgres.group.entity.GroupEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ItemEntity extends Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Override
    public UUID getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Enumerated(EnumType.STRING)
    @Override
    public ItemType getType() {
        return super.getType();
    }

    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    @Override
    public GroupEntity getGroup() {
        return (GroupEntity) super.getGroup();
    }


}
