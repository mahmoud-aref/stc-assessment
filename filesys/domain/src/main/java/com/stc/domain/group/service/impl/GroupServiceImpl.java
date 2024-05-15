package com.stc.domain.group.service.impl;

import com.stc.domain.group.exception.GroupNotFoundException;
import com.stc.domain.group.model.Group;
import com.stc.domain.group.repository.GroupRepository;
import com.stc.domain.group.service.GroupService;

import java.util.List;
import java.util.UUID;

public class GroupServiceImpl implements GroupService {

    private final GroupRepository groupRepository;

    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public Group saveGroup(Group group) {
        return groupRepository.save(group);
    }

    @Override
    public Group getGroupById(UUID id) {
        return groupRepository.findById(id).orElseThrow(() -> new GroupNotFoundException(
                String.format("Group with id %s not found", id)
        ));
    }

    @Override
    public List<Group> getAllGroups() {
        return groupRepository.findAll();
    }

    @Override
    public Boolean deleteGroup(UUID id) {
        if (groupRepository.existsById(id)) {
            groupRepository.delete(id);
            return true;
        }
        return false;
    }

    @Override
    public Group updateGroup(Group group) {
        if (groupRepository.existsById(group.getId())) {
            return groupRepository.update(group);
        } else {
            throw new GroupNotFoundException(
                    String.format("Group with id %s not found", group.getId())
            );
        }
    }
}
