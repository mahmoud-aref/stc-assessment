package com.stc.presentation.http.request;

import lombok.Data;

@Data
public class SpaceCreationRequest {
    private String name;
    private String permissionGroupId;
}
