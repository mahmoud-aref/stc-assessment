package com.stc.application.group.config;

import com.stc.application.group.repository.GroupDao;
import com.stc.domain.group.service.GroupService;
import com.stc.domain.group.service.impl.GroupServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class GroupConfiguration {

    private final GroupDao groupDao;

    @Bean
    public GroupService groupService() {
        return new GroupServiceImpl(groupDao);
    }

}
