package com.stc.domain.file.service.impl;

import com.stc.domain.file.exception.FileNotFoundException;
import com.stc.domain.file.model.File;
import com.stc.domain.file.repository.FileRepository;
import com.stc.domain.file.service.FileService;

import java.util.List;
import java.util.UUID;

public class FileServiceImpl implements FileService {

    private final FileRepository fileRepository;

    public FileServiceImpl(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    @Override
    public File saveFile(File file) {
        return fileRepository.save(file);
    }

    @Override
    public File getFileById(UUID id) {
        return fileRepository.findById(id).orElseThrow(() -> new FileNotFoundException(
            String.format("File with id %s not found", id)
        ));
    }

    @Override
    public List<File> getAllFiles() {
        return fileRepository.findAll();
    }

    @Override
    public Boolean deleteFile(UUID id) {
        if (fileRepository.existsById(id)) {
            fileRepository.delete(id);
            return true;
        }
        return false;
    }

    @Override
    public File updateFile(File file) {
        if (fileRepository.existsById(file.getId())) {
            return fileRepository.update(file);
        } else {
            throw new FileNotFoundException(
                String.format("File with id %s not found", file.getId())
            );
        }
    }
}
