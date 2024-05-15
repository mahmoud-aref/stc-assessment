package com.stc.infrastructure.datasource.postgres.item.repository;

import com.stc.infrastructure.datasource.postgres.item.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ItemJpaRepository extends JpaRepository<ItemEntity, UUID> {
}
