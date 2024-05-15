package com.stc.application.group.mapper;

import com.stc.application.group.dto.GroupDto;
import com.stc.domain.group.model.Group;
import com.stc.infrastructure.datasource.postgres.group.entity.GroupEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface GroupMapper {

    GroupMapper INSTANCE = Mappers.getMapper(GroupMapper.class);

    Group toDomainGroup(GroupDto groupDto);
    Group toDomainGroup(GroupEntity groupEntity);

    GroupDto toDtoGroup(Group group);
    GroupDto toDtoGroup(GroupEntity groupEntity);

    GroupEntity toEntityGroup(Group group);
    GroupEntity toEntityGroup(GroupDto groupDto);

}
