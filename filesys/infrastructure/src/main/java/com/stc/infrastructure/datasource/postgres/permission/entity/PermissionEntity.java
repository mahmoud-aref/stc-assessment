package com.stc.infrastructure.datasource.postgres.permission.entity;

import com.stc.domain.permission.model.Permission;
import com.stc.domain.permission.model.PermissionLevel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class PermissionEntity extends Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Override
    public UUID getId() {
        return super.getId();
    }

    @Override
    public String getUserEmail() {
        return super.getUserEmail();
    }

    @Override
    @Enumerated(EnumType.STRING)
    public PermissionLevel getLevel() {
        return super.getLevel();
    }
}
