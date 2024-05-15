package com.stc.infrastructure.datasource.postgres.file.repository;

import com.stc.infrastructure.datasource.postgres.file.entity.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FileJpaRepository extends JpaRepository<FileEntity, UUID> {
}
