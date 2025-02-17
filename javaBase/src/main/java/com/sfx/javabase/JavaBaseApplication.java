package com.sfx.javabase;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class JavaBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaBaseApplication.class, args);
//
//        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(JavaBaseApplication.class);
//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        for (String bean:beanDefinitionNames){
//            System.out.println(bean);
//        }
    }



}
