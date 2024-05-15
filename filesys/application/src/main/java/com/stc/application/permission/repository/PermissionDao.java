package com.stc.application.permission.repository;

import com.stc.application.permission.mapper.PermissionMapper;
import com.stc.domain.permission.model.Permission;
import com.stc.domain.permission.repository.PermissionRepository;
import com.stc.infrastructure.datasource.postgres.permission.repository.PermissionJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@AllArgsConstructor
public class PermissionDao implements PermissionRepository {

    private final PermissionJpaRepository permissionJpaRepository;
    private final PermissionMapper permissionMapper;

    @Override
    public Permission save(Permission permission) {
        var permissionEntity = permissionMapper.toPermissionEntity(permission);
        return permissionMapper
                .toDomainPermission(permissionJpaRepository.save(permissionEntity));
    }

    @Override
    public Optional<Permission> findById(UUID id) {
        return permissionJpaRepository
                .findById(id)
                .map(permissionMapper::toDomainPermission);
    }

    @Override
    public List<Permission> findAll() {
        return permissionJpaRepository
                .findAll()
                .stream()
                .map(permissionMapper::toDomainPermission)
                .toList();
    }

    @Override
    public boolean existsById(UUID id) {
        return permissionJpaRepository.existsById(id);
    }

    @Override
    public void delete(UUID id) {
        permissionJpaRepository.deleteById(id);
    }

    @Override
    public Permission update(Permission permission) {
        var permissionEntity = permissionMapper.toPermissionEntity(permission);
        return permissionMapper
                .toDomainPermission(permissionJpaRepository.save(permissionEntity));
    }
}
