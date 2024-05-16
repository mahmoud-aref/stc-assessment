package com.stc.presentation.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(FileSysAccessController.FILE_SYS_ACCESS_PATH)
public class FileSysAccessController {

    public static final String FILE_SYS_ACCESS_PATH = "/api/v1/fs/management";
    public static final String READ_SPACE_PATH = "/read-space";
    public static final String READ_FOLDER_PATH = "/read-folder";
    public static final String READ_FILE_PATH = "/read-file";

    // do the same as the management controller
    // but time is not enough I'll keep it empty
    // Facade for access will contain mapping and call use cases
    // and the controller will call the facade
    // the permission check will be done on the facade
    // the best practice here is to implement the permission
    // using spring security and define the groups and permissions
    // and the user will have a token with the permissions
    // you can check my github for a full example of spring security

}
