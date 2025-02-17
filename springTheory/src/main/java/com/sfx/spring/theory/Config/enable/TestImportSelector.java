package com.sfx.spring.theory.Config.enable;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: sfx
 * @Date: 2023-03-10  16:07
 */
public class TestImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println(importingClassMetadata);
        //"com.sfx.Config.Animal",
        return new String[]{Animal.class.getName()};
    }
}
