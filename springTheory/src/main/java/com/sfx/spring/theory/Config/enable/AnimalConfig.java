package com.sfx.spring.theory.Config.enable;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: sfx
 * @Date: 2023-03-08  17:19
 */
@Configuration
public class AnimalConfig {
//    @Bean
//    public MyBeanPostProcessor myBeanPostProcessor(){
//        return new MyBeanPostProcessor();
//    }

    @Bean("animal")
    public Animal Animal(){
        return new Animal("克罗地亚灰熊");
    }


}
