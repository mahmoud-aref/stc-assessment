package com.stc.presentation.http.request;

import lombok.Data;

@Data
public class PermissionRequest {
    private String userEmail;
    private String level;
}
