package com.stc.application.item.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemDto {
    private String id;
    private String name;
    private String type;
    private String groupId;
    private String parentId;
}
