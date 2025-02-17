package com.sfx.javabase;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(value = SpringJUnit4ClassRunner.class)
class JavaBaseApplicationTests {

    @Test
    void contextLoads() {
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(JavaBaseApplication.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String bean:beanDefinitionNames){
            System.out.println(bean);
        }


    }

}
