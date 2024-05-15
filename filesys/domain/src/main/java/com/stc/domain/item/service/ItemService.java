package com.stc.domain.item.service;

import com.stc.domain.item.model.Item;

import java.util.List;
import java.util.UUID;

public interface ItemService {
    Item saveItem(Item item);
    Item getItemById(UUID id);
    List<Item> getAllItems();
    Boolean deleteItem(UUID id);
    Item updateItem(Item item);
}
