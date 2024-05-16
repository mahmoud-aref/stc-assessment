package com.stc.presentation.api.facade.impl;

import com.stc.application.file.dto.FileDto;
import com.stc.application.file.usecase.FilesCrud;
import com.stc.application.group.dto.GroupDto;
import com.stc.application.group.usecase.GroupCrud;
import com.stc.application.item.dto.ItemDto;
import com.stc.application.item.usecase.ItemCrud;
import com.stc.application.permission.dto.PermissionDto;
import com.stc.application.permission.usecase.PermissionCrud;
import com.stc.presentation.api.facade.FileSysManagementFacade;
import com.stc.presentation.http.request.*;
import com.stc.presentation.http.response.BaseResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Component
@AllArgsConstructor
public class FileSysManagementFacadeImpl implements FileSysManagementFacade {

    private final ItemCrud itemCrud;
    private final FilesCrud filesCrud;
    private final GroupCrud groupCrud;
    private final PermissionCrud permissionCrud;

    @Override
    public BaseResponse<ItemDto> createSpace(SpaceCreationRequest request) {

        var itemDto = ItemDto
                .builder()
                .name(request.getName())
                .type("SPACE")
                .parentId(null)
                .groupId(request.getPermissionGroupId())
                .build();

        var createdItem = itemCrud.create(itemDto);
        var response = new BaseResponse<ItemDto>();
        response.setData(createdItem);
        response.setMessage("Space created successfully");
        return response;
    }

    @Override
    public BaseResponse<ItemDto> createFolder(FolderCreationRequest request) {

        var itemDto = ItemDto
                .builder()
                .name(request.getName())
                .type("FOLDER")
                .parentId(request.getParentId())
                .build();

        var createdItem = itemCrud.create(itemDto);
        var response = new BaseResponse<ItemDto>();
        response.setData(createdItem);
        response.setMessage("Folder created successfully");
        return response;
    }

    @Override
    public BaseResponse<ItemDto> createFile(MultipartFile file, FileCreationRequest request) throws IOException {
        var item = ItemDto
                .builder()
                .name(request.getName())
                .type("FILE")
                .parentId(request.getParentId())
                .build();
        var createdItem = itemCrud.create(item);
        var fileDto = FileDto
                .builder()
                .itemId(createdItem.getId())
                .binary(file.getBytes())
                .build();
        filesCrud.create(fileDto);
        var response = new BaseResponse<ItemDto>();
        response.setData(createdItem);
        response.setMessage("File created successfully");
        return response;
    }

    @Override
    public BaseResponse<GroupDto> createPermissionGroup(PermissionGroupRequest request) {
        var groupDto = GroupDto
                .builder()
                .name(request.getName())
                .build();
        var createdGroup = groupCrud.create(groupDto);
        var response = new BaseResponse<GroupDto>();
        response.setData(createdGroup);
        response.setMessage("Permission group created successfully");
        return response;
    }

    @Override
    public BaseResponse<PermissionDto> createPermission(PermissionRequest request) {
        var permissionDto = PermissionDto
                .builder()
                .userEmail(request.getUserEmail())
                .level(request.getLevel())
                .build();
        var createdPermission = permissionCrud.create(permissionDto);
        var response = new BaseResponse<PermissionDto>();
        response.setData(createdPermission);
        response.setMessage("Permission created successfully");
        return response;
    }
}
