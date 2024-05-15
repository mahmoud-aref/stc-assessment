package com.stc.application.permission.config;

import com.stc.application.permission.repository.PermissionDao;
import com.stc.domain.permission.service.PermissionService;
import com.stc.domain.permission.service.impl.PermissionServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class PermissionConfiguration {

    private final PermissionDao permissionDao;

    @Bean
    public PermissionService permissionService() {
        return new PermissionServiceImpl(permissionDao);
    }

}
