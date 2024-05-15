package com.stc.domain.item.service.impl;

import com.stc.domain.item.exception.ItemNotFoundException;
import com.stc.domain.item.model.Item;
import com.stc.domain.item.repository.ItemRepository;
import com.stc.domain.item.service.ItemService;

import java.util.List;
import java.util.UUID;

public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item getItemById(UUID id) {
        return itemRepository.findById(id)
                .orElseThrow(() -> new ItemNotFoundException(
                        String.format("Item with id %s not found", id)
                ));
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Boolean deleteItem(UUID id) {
        if (itemRepository.existsById(id)) {
            itemRepository.delete(id);
            return true;
        }
        return false;
    }

    @Override
    public Item updateItem(Item item) {
        if (itemRepository.existsById(item.getId())) {
            return itemRepository.update(item);
        }else {
            throw new ItemNotFoundException(
                    String.format("Item with id %s not found", item.getId())
            );
        }
    }
}
