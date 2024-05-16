package com.stc.presentation.api.facade;

import com.stc.application.group.dto.GroupDto;
import com.stc.application.item.dto.ItemDto;
import com.stc.application.permission.dto.PermissionDto;
import com.stc.presentation.http.request.*;
import com.stc.presentation.http.response.BaseResponse;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileSysManagementFacade {
    BaseResponse<ItemDto> createSpace(SpaceCreationRequest request);
    BaseResponse<ItemDto> createFolder(FolderCreationRequest request);
    BaseResponse<ItemDto> createFile(MultipartFile file, FileCreationRequest request) throws IOException;
    BaseResponse<GroupDto> createPermissionGroup(PermissionGroupRequest request);
    BaseResponse<PermissionDto> createPermission(PermissionRequest request);
}
