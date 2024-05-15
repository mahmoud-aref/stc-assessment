package com.stc.application.group.usecase.impl;

import com.stc.application.common.UseCase;
import com.stc.application.group.dto.GroupDto;
import com.stc.application.group.mapper.GroupMapper;
import com.stc.application.group.usecase.GroupCrud;
import com.stc.domain.group.service.GroupService;
import lombok.AllArgsConstructor;

import java.util.UUID;

@UseCase
@AllArgsConstructor
public class GroupCrudImpl implements GroupCrud {

    private final GroupService groupService;
    private final GroupMapper groupMapper;

    @Override
    public GroupDto create(GroupDto groupDto) {
        var group = groupMapper.toDomainGroup(groupDto);
        var createdGroup = groupService.saveGroup(group);
        return groupMapper.toDtoGroup(createdGroup);
    }

    @Override
    public GroupDto read(String id) {
        var group = groupService.getGroupById(UUID.fromString(id));
        return groupMapper.toDtoGroup(group);
    }

    @Override
    public GroupDto update(GroupDto groupDto) {
        var group = groupMapper.toDomainGroup(groupDto);
        var updatedGroup = groupService.updateGroup(group);
        return groupMapper.toDtoGroup(updatedGroup);
    }

    @Override
    public void delete(String id) {
        groupService.deleteGroup(UUID.fromString(id));
    }
}
