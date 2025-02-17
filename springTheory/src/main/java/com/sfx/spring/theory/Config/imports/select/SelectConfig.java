package com.sfx.spring.theory.Config.imports.select;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class SelectConfig implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        System.out.println(annotationMetadata);

        //Desk.class.getName
        return new String[]{"com.sfx.spring.theory.Config.imports.select.Desk"};
    }
}
