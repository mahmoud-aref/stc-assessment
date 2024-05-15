package com.stc.infrastructure.datasource.postgres.group.repository;

import com.stc.infrastructure.datasource.postgres.group.entity.GroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GroupJpaRepository extends JpaRepository<GroupEntity, UUID> {
}
