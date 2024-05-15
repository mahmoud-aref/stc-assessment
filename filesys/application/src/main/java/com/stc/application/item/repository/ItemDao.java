package com.stc.application.item.repository;

import com.stc.application.item.mapper.ItemMapper;
import com.stc.domain.item.model.Item;
import com.stc.domain.item.repository.ItemRepository;
import com.stc.infrastructure.datasource.postgres.item.repository.ItemJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@AllArgsConstructor
public class ItemDao implements ItemRepository {

    private final ItemJpaRepository itemJpaRepository;
    private final ItemMapper itemMapper;

    @Override
    public Item save(Item item) {
        var itemEntity = itemMapper.toItemEntity(item);
        return itemMapper.toDomainItem(itemJpaRepository.save(itemEntity));
    }

    @Override
    public Optional<Item> findById(UUID id) {
        return itemJpaRepository.findById(id).map(itemMapper::toDomainItem);
    }

    @Override
    public List<Item> findAll() {
        return itemJpaRepository
                .findAll()
                .stream()
                .map(itemMapper::toDomainItem)
                .toList();
    }

    @Override
    public boolean existsById(UUID id) {
        return itemJpaRepository.existsById(id);
    }

    @Override
    public void delete(UUID id) {
        itemJpaRepository.deleteById(id);
    }

    @Override
    public Item update(Item item) {
        var itemEntity = itemMapper.toItemEntity(item);
        return itemMapper.toDomainItem(itemJpaRepository.save(itemEntity));
    }
}
