package com.sfx.spring.theory.Config.imports.select;


import lombok.Data;
import lombok.SneakyThrows;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(SelectConfig.class)
@Data
@Configuration
public class SelectImport {

}
