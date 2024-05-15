package com.stc.domain.permission.service;

import com.stc.domain.permission.model.Permission;

import java.util.List;
import java.util.UUID;

public interface PermissionService {
    Permission savePermission(Permission permission);
    Permission getPermissionById(UUID id);
    List<Permission> getAllPermissions();
    Boolean deletePermission(UUID id);
    Permission updatePermission(Permission permission);
}
