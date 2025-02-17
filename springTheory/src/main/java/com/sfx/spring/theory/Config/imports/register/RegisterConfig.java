package com.sfx.spring.theory.Config.imports.register;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class RegisterConfig implements ImportBeanDefinitionRegistrar {


    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(Student.class);
        // 通过反射技术调用setter方法给name赋值，也可以在构造器赋值name，name需要调用beanDefinitionBuilder.addConstructorArgValue("战争与和平");
        beanDefinitionBuilder.addPropertyValue("name", "战争与和平");
        BeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
        beanDefinition.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        registry.registerBeanDefinition("student1", beanDefinition);
    }
}
