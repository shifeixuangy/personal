package com.sfx.spring.theory.Config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @Author: sfx
 * @Date: 2023-03-08  17:19
 */
@Getter
@Setter
public class Animal implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {
    private String name;

    private String sex;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("【BeanFactoryAware接口】调用BeanFactoryAware.setBeanFactory()");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("【BeanNameAware接口】BeanNameAware.setBeanName()+  "+name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("【DisposableBean接口】DisposableBean.destroy()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.sex="公";
        System.out.println("【InitializingBean接口】InitializingBean.afterPropertiesSet()");
    }
}
