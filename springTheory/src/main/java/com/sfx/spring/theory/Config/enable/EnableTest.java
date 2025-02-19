package com.sfx.spring.theory.Config.enable;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Author: sfx
 * @Date: 2023-03-10  16:06
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(TestImportSelector.class)
public @interface EnableTest {

}
