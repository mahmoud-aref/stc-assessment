package com.stc.application.group.repository;

import com.stc.application.group.mapper.GroupMapper;
import com.stc.domain.group.model.Group;
import com.stc.domain.group.repository.GroupRepository;
import com.stc.infrastructure.datasource.postgres.group.repository.GroupJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@AllArgsConstructor
public class GroupDao implements GroupRepository {

    private final GroupJpaRepository groupJpaRepository;
    private final GroupMapper groupMapper;


    @Override
    public Group save(Group group) {
        var groupEntity = groupMapper.toEntityGroup(group);
        return groupJpaRepository.save(groupEntity);
    }

    @Override
    public Optional<Group> findById(UUID id) {
        return groupJpaRepository.findById(id)
                .map(groupMapper::toDomainGroup);
    }

    @Override
    public List<Group> findAll() {
        return groupJpaRepository
                .findAll()
                .stream()
                .map(groupMapper::toDomainGroup)
                .toList();
    }

    @Override
    public boolean existsById(UUID id) {
        return groupJpaRepository.existsById(id);
    }

    @Override
    public void delete(UUID id) {
        groupJpaRepository.deleteById(id);
    }

    @Override
    public Group update(Group group) {
        var groupEntity = groupMapper.toEntityGroup(group);
        return groupJpaRepository.save(groupEntity);
    }
}
