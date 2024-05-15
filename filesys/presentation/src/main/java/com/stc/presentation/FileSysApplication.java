package com.stc.presentation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {
                "com.stc.application",
                "com.stc.infrastructure",
                "com.stc.presentation"
        })
public class FileSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileSysApplication.class, args);
    }

}
