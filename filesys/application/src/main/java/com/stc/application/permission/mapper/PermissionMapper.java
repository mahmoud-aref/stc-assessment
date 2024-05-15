package com.stc.application.permission.mapper;

import com.stc.application.permission.dto.PermissionDto;
import com.stc.domain.permission.model.Permission;
import com.stc.infrastructure.datasource.postgres.permission.entity.PermissionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    
    PermissionMapper INSTANCE = Mappers.getMapper(PermissionMapper.class);
    
    Permission toDomainPermission(PermissionDto permissionDto);
    Permission toDomainPermission(PermissionEntity permissionEntity);
    
    PermissionDto toPermissionDto(Permission permission);
    PermissionDto toPermissionDto(PermissionEntity permissionEntity);
    
    PermissionEntity toPermissionEntity(Permission permission);
    PermissionEntity toPermissionEntity(PermissionDto permissionDto);
}
