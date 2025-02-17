package com.sfx.spring.theory.Config.imports.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibrarianConfig {

    @Bean
    Librarian librarian (){
        return  new Librarian();
    }
}
