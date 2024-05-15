package com.stc.infrastructure.datasource.postgres.group.entity;

import com.stc.domain.group.model.Group;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class GroupEntity extends Group {

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

}
