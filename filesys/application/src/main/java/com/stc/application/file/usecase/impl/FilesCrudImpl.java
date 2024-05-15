package com.stc.application.file.usecase.impl;

import com.stc.application.common.UseCase;
import com.stc.application.file.dto.FileDto;
import com.stc.application.file.mapper.FileMapper;
import com.stc.application.file.usecase.FilesCrud;
import com.stc.domain.file.service.FileService;
import lombok.AllArgsConstructor;

import java.util.UUID;

@UseCase
@AllArgsConstructor
public class FilesCrudImpl implements FilesCrud {

    private final FileService fileService;
    private final FileMapper fileMapper;

    @Override
    public FileDto create(FileDto fileDto) {
        var file = fileMapper.toDomainFile(fileDto);
        var createdFile = fileService.saveFile(file);
        return fileMapper.toDtoFile(createdFile);
    }

    @Override
    public FileDto read(String id) {
        var file = fileService.getFileById(UUID.fromString(id));
        return fileMapper.toDtoFile(file);
    }

    @Override
    public FileDto update(FileDto fileDto) {
        var file = fileMapper.toDomainFile(fileDto);
        var updatedFile = fileService.updateFile(file);
        return fileMapper.toDtoFile(updatedFile);
    }

    @Override
    public void delete(String id) {
        fileService.deleteFile(UUID.fromString(id));
    }
}
