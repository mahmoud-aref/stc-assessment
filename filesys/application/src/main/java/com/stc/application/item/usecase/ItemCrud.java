package com.stc.application.item.usecase;

import com.stc.application.item.dto.ItemDto;

public interface ItemCrud {
    ItemDto create(ItemDto itemDto);
    ItemDto read(String id);
    ItemDto update(ItemDto itemDto);
    void delete(String id);
}
