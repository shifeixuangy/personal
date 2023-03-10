package com.sfx.Config;

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
        return new String[]{"com.sfx.Config.Animal"};
    }
}
