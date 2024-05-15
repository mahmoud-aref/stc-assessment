package com.stc.application.permission.usecase;

import com.stc.application.permission.dto.PermissionDto;

public interface PermissionCrud {
    PermissionDto create(PermissionDto permissionDto);
    PermissionDto read(String id);
    PermissionDto update(PermissionDto permissionDto);
    void delete(String id);
}
