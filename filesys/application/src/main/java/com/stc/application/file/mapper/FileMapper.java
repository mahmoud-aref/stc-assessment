package com.stc.application.file.mapper;

import com.stc.application.file.dto.FileDto;
import com.stc.domain.file.model.File;
import com.stc.infrastructure.datasource.postgres.file.entity.FileEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface FileMapper {

    FileMapper Instance = Mappers.getMapper(FileMapper.class);

    File toDomainFile(FileDto fileDto);
    File toDomainFile(FileEntity fileEntity);


    FileDto toDtoFile(File file);
    FileDto toDtoFile(FileEntity fileEntity);

    FileEntity toEntityFile(File file);
    FileEntity toEntityFile(FileDto fileDto);
}
