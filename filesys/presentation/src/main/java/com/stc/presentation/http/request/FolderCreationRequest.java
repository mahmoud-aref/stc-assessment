package com.stc.presentation.http.request;

import lombok.Data;

@Data
public class FolderCreationRequest {
    private String name;
    private String parentId;
}
