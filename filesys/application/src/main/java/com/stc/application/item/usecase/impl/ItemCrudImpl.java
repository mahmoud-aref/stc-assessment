package com.stc.application.item.usecase.impl;

import com.stc.application.common.UseCase;
import com.stc.application.item.dto.ItemDto;
import com.stc.application.item.mapper.ItemMapper;
import com.stc.application.item.usecase.ItemCrud;
import com.stc.domain.item.service.ItemService;
import lombok.AllArgsConstructor;

import java.util.UUID;

@UseCase
@AllArgsConstructor
public class ItemCrudImpl implements ItemCrud {

    private final ItemService itemService;
    private final ItemMapper itemMapper;


    @Override
    public ItemDto create(ItemDto itemDto) {
        var item = itemMapper.toDomainItem(itemDto);
        var createdItem = itemService.saveItem(item);
        return itemMapper.toItemDto(createdItem);
    }

    @Override
    public ItemDto read(String id) {
        var item = itemService.getItemById(UUID.fromString(id));
        return itemMapper.toItemDto(item);
    }

    @Override
    public ItemDto update(ItemDto itemDto) {
        var item = itemMapper.toDomainItem(itemDto);
        var updatedItem = itemService.updateItem(item);
        return itemMapper.toItemDto(updatedItem);
    }

    @Override
    public void delete(String id) {
        itemService.deleteItem(UUID.fromString(id));
    }
}
