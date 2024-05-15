package com.stc.domain.permission.service.impl;

import com.stc.domain.permission.exception.PermissionNotFoundException;
import com.stc.domain.permission.model.Permission;
import com.stc.domain.permission.repository.PermissionRepository;
import com.stc.domain.permission.service.PermissionService;

import java.util.List;
import java.util.UUID;

public class PermissionServiceImpl implements PermissionService {

    private final PermissionRepository permissionRepository;

    public PermissionServiceImpl(PermissionRepository permissionRepository) {
        this.permissionRepository = permissionRepository;
    }

    @Override
    public Permission savePermission(Permission permission) {
        return permissionRepository.save(permission);
    }

    @Override
    public Permission getPermissionById(UUID id) {
        return permissionRepository.findById(id).orElseThrow(() -> new PermissionNotFoundException(
                String.format("Permission with id %s not found", id)
        ));
    }

    @Override
    public List<Permission> getAllPermissions() {
        return permissionRepository.findAll();
    }

    @Override
    public Boolean deletePermission(UUID id) {
        if (permissionRepository.existsById(id)) {
            permissionRepository.delete(id);
            return true;
        }
        return false;
    }

    @Override
    public Permission updatePermission(Permission permission) {
        if (permissionRepository.existsById(permission.getId())) {
            return permissionRepository.update(permission);
        } else {
            throw new PermissionNotFoundException(
                    String.format("Permission with id %s not found", permission.getId())
            );
        }
    }
}
