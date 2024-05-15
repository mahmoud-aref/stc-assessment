package com.stc.domain.file.repository;

import com.stc.domain.file.model.File;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface FileRepository {
    File save(File file);
    Optional<File> findById(UUID id);
    List<File> findAll();
    boolean existsById(UUID id);
    void delete(UUID id);
    File update(File file);
}
