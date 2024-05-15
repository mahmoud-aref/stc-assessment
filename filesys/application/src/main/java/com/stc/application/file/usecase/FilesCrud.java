package com.stc.application.file.usecase;

import com.stc.application.file.dto.FileDto;

public interface FilesCrud {
    FileDto create(FileDto fileDto);
    FileDto read(String id);
    FileDto update(FileDto fileDto);
    void delete(String id);
}
