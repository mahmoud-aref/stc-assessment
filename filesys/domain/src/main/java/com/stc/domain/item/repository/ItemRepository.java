package com.stc.domain.item.repository;

import com.stc.domain.item.model.Item;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ItemRepository {
    Item save(Item item);
    Optional<Item> findById(UUID id);
    List<Item> findAll();
    boolean existsById(UUID id);
    void delete(UUID id);
    Item update(Item item);
}
