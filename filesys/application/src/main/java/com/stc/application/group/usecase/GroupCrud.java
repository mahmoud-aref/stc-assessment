package com.stc.application.group.usecase;

import com.stc.application.group.dto.GroupDto;

public interface GroupCrud {
    GroupDto create(GroupDto groupDto);
    GroupDto read(String id);
    GroupDto update(GroupDto groupDto);
    void delete(String id);
}
