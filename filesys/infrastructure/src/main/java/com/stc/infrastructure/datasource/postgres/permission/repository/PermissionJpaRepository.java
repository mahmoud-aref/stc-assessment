package com.stc.infrastructure.datasource.postgres.permission.repository;

import com.stc.infrastructure.datasource.postgres.permission.entity.PermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PermissionJpaRepository extends JpaRepository<PermissionEntity, UUID> {
}
