package com.stc.domain.file.service;

import com.stc.domain.file.model.File;

import java.util.List;
import java.util.UUID;

public interface FileService {
    File saveFile(File file);
    File getFileById(UUID id);
    List<File> getAllFiles();
    Boolean deleteFile(UUID id);
    File updateFile(File file);
}
