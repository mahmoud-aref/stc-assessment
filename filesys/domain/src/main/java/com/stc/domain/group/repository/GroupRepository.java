package com.stc.domain.group.repository;

import com.stc.domain.group.model.Group;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface GroupRepository {
    Group save(Group group);
    Optional<Group> findById(UUID id);
    List<Group> findAll();
    boolean existsById(UUID id);
    void delete(UUID id);
    Group update(Group group);
}
