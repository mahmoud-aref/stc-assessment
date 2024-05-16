package com.stc.presentation.http.request;

import lombok.Data;

@Data
public class FileCreationRequest {
    private String name;
    private String parentId;
}
