package com.stc.domain.permission.repository;

import com.stc.domain.permission.model.Permission;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PermissionRepository{
    Permission save(Permission permission);
    Optional<Permission> findById(UUID id);
    List<Permission> findAll();
    boolean existsById(UUID id);
    void delete(UUID id);
    Permission update(Permission permission);
}
