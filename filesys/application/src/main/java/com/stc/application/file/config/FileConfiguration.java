package com.stc.application.file.config;

import com.stc.application.file.repository.FileDao;
import com.stc.domain.file.service.FileService;
import com.stc.domain.file.service.impl.FileServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class FileConfiguration {

    private final FileDao fileDao;

    @Bean
    public FileService fileService() {
        return new FileServiceImpl(fileDao);
    }

}
