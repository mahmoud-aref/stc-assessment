package com.stc.application.file.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FileDto {
    private String id;
    private byte[] binary;
    private String itemId;
}
