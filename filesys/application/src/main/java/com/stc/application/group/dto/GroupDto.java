package com.stc.application.group.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GroupDto {
    private String id;
    private String name;
}
