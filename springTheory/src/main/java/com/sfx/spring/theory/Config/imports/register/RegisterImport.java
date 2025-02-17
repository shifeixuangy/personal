package com.sfx.spring.theory.Config.imports.register;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import(RegisterConfig.class)
public class RegisterImport {
}
