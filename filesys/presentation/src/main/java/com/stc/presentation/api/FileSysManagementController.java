package com.stc.presentation.api;


import com.stc.application.group.dto.GroupDto;
import com.stc.application.item.dto.ItemDto;
import com.stc.application.permission.dto.PermissionDto;
import com.stc.presentation.api.facade.FileSysManagementFacade;
import com.stc.presentation.http.request.*;
import com.stc.presentation.http.response.BaseResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping(FileSysManagementController.FILE_SYS_MANAGEMENT_PATH)
@AllArgsConstructor
public class FileSysManagementController {

    /*
     it's bad doing this on one controller , in normal I would separate
        the controllers to be more organized and clean
        but for time ill do it on one controller
     */

    // main
    public static final String FILE_SYS_MANAGEMENT_PATH = "/api/v1/fs/management";
    // space
    public static final String CREATE_SPACE_PATH = "/create-space";
    // folder
    public static final String CREATE_FOLDER_PATH = "/create-folder";
    // file
    public static final String CREATE_FILE_PATH = "/create-file";
    // permission group
    public static final String CREATE_PERMISSION_GROUP_PATH = "/create-permission-group";
    // permission
    public static final String CREATE_PERMISSION_PATH = "/create-permission";

    private final FileSysManagementFacade fileSysManagementFacade;

    @PostMapping(CREATE_SPACE_PATH)
    public ResponseEntity<BaseResponse<ItemDto>> createSpace(@RequestBody SpaceCreationRequest request) {
        return ResponseEntity.ok(fileSysManagementFacade.createSpace(request));
    }

    @PostMapping(CREATE_FOLDER_PATH)
    public ResponseEntity<BaseResponse<ItemDto>> createFolder(@RequestBody FolderCreationRequest request) {
        return ResponseEntity.ok(fileSysManagementFacade.createFolder(request));
    }

    @PostMapping(CREATE_FILE_PATH)
    public ResponseEntity<BaseResponse<ItemDto>> createFile(
            @RequestPart("file") MultipartFile file,
            @RequestPart("metadata") FileCreationRequest request
    ) throws IOException {
        return ResponseEntity.ok(fileSysManagementFacade.createFile(file, request));
    }

    @PostMapping(CREATE_PERMISSION_GROUP_PATH)
    public ResponseEntity<BaseResponse<GroupDto>> createPermissionGroup(@RequestBody PermissionGroupRequest request) {
        return ResponseEntity.ok(fileSysManagementFacade.createPermissionGroup(request));
    }

    @PostMapping(CREATE_PERMISSION_PATH)
    public ResponseEntity<BaseResponse<PermissionDto>> createPermission(@RequestBody PermissionRequest request) {
        return ResponseEntity.ok(fileSysManagementFacade.createPermission(request));
    }

}
