package com.stc.application.file.repository;

import com.stc.application.file.mapper.FileMapper;
import com.stc.domain.file.model.File;
import com.stc.domain.file.repository.FileRepository;
import com.stc.infrastructure.datasource.postgres.file.repository.FileJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@AllArgsConstructor
public class FileDao implements FileRepository {

    private final FileJpaRepository fileJpaRepository;
    private final FileMapper fileMapper;

    @Override
    public File save(File file) {
        var fileEntity = fileMapper.toEntityFile(file);
        var savedFileEntity = fileJpaRepository.save(fileEntity);
        return fileMapper.toDomainFile(savedFileEntity);
    }

    @Override
    public Optional<File> findById(UUID id) {
        return fileJpaRepository.findById(id).map(fileMapper::toDomainFile);
    }

    @Override
    public List<File> findAll() {
        return fileJpaRepository
                .findAll()
                .stream()
                .map(fileMapper::toDomainFile)
                .toList();
    }

    @Override
    public boolean existsById(UUID id) {
        return fileJpaRepository.existsById(id);
    }

    @Override
    public void delete(UUID id) {
        fileJpaRepository.deleteById(id);
    }

    @Override
    public File update(File file) {
        var fileEntity = fileMapper.toEntityFile(file);
        var updatedFileEntity = fileJpaRepository.save(fileEntity);
        return fileMapper.toDomainFile(updatedFileEntity);
    }
}
