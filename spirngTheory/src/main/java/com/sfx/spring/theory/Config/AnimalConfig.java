package com.sfx.spring.theory.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: sfx
 * @Date: 2023-03-08  17:19
 */
@Configuration
public class AnimalConfig {
    @Bean
    public MyBeanPostProcessor myBeanPostProcessor(){
        return new MyBeanPostProcessor();
    }

    @Bean
    public Animal Animal(){
        return new Animal("克罗地亚灰熊");
    }


}
