package com.stc.application.item.mapper;

import com.stc.application.item.dto.ItemDto;
import com.stc.domain.item.model.Item;
import com.stc.infrastructure.datasource.postgres.item.entity.ItemEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    ItemMapper INSTANCE = Mappers.getMapper(ItemMapper.class);

    Item toDomainItem(ItemDto itemDto);
    Item toDomainItem(ItemEntity itemEntity);

    ItemDto toItemDto(Item item);
    ItemDto toItemDto(ItemEntity itemEntity);

    ItemEntity toItemEntity(Item item);
    ItemEntity toItemEntity(ItemDto itemDto);

}
