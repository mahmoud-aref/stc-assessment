package com.stc.application.permission.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PermissionDto {
    private String id;
    private String userEmail;
    private String level;
}
