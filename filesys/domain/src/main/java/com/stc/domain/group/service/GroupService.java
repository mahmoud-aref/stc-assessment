package com.stc.domain.group.service;

import com.stc.domain.group.model.Group;

import java.util.List;
import java.util.UUID;

public interface GroupService {
    Group saveGroup(Group group);
    Group getGroupById(UUID id);
    List<Group> getAllGroups();
    Boolean deleteGroup(UUID id);
    Group updateGroup(Group group);
}
