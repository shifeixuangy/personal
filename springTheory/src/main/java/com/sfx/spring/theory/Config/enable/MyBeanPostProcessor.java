package com.sfx.spring.theory.Config.enable;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author: sfx
 * @Date: 2023-03-10  15:40
 */

public class MyBeanPostProcessor implements BeanPostProcessor {

    public MyBeanPostProcessor() {
        System.out.println("这是BeanPostProcessor实现类构造器！！");

    }

    @Override
    public Object postProcessBeforeInitialization(Object arg0, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor接口方法postProcessBeforeInitialization对属性进行更改！");
        System.out.println("postProcessBeforeInitialization:"+beanName);
        return arg0;
    }

    @Override
    public Object postProcessAfterInitialization(Object arg0, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor接口方法postProcessAfterInitialization对属性进行更改！");
        System.out.println("postProcessAfterInitialization:"+beanName);
        return arg0;
    }
}
