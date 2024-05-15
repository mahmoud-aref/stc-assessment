package com.stc.application.item.config;

import com.stc.application.item.repository.ItemDao;
import com.stc.domain.item.service.ItemService;
import com.stc.domain.item.service.impl.ItemServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class ItemConfiguration {

    private final ItemDao itemDao;

    @Bean
    public ItemService itemService(){
        return new ItemServiceImpl(itemDao);
    }

}
