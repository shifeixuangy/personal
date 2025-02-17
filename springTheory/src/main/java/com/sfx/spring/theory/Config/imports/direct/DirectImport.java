package com.sfx.spring.theory.Config.imports.direct;


import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import({Book.class})
public @interface DirectImport {
}
