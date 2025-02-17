package com.sfx.spring.theory.Config.imports.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(LibrarianConfig.class)
public class ConfigImport {
}
