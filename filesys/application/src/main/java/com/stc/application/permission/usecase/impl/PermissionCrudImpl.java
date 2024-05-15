package com.stc.application.permission.usecase.impl;

import com.stc.application.common.UseCase;
import com.stc.application.permission.dto.PermissionDto;
import com.stc.application.permission.mapper.PermissionMapper;
import com.stc.application.permission.usecase.PermissionCrud;
import com.stc.domain.permission.service.PermissionService;
import lombok.AllArgsConstructor;

import java.util.UUID;

@UseCase
@AllArgsConstructor
public class PermissionCrudImpl implements PermissionCrud {

    private final PermissionService permissionService;
    private final PermissionMapper permissionMapper;

    @Override
    public PermissionDto create(PermissionDto permissionDto) {
        var permission = permissionMapper.toDomainPermission(permissionDto);
        var createdPermission = permissionService.savePermission(permission);
        return permissionMapper.toPermissionDto(createdPermission);
    }

    @Override
    public PermissionDto read(String id) {
        var permission = permissionService.getPermissionById(UUID.fromString(id));
        return permissionMapper.toPermissionDto(permission);
    }

    @Override
    public PermissionDto update(PermissionDto permissionDto) {
        var permission = permissionMapper.toDomainPermission(permissionDto);
        var updatedPermission = permissionService.updatePermission(permission);
        return permissionMapper.toPermissionDto(updatedPermission);
    }

    @Override
    public void delete(String id) {
        permissionService.deletePermission(UUID.fromString(id));
    }
}
