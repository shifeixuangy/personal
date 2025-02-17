package com.sfx.spring.theory;

import com.sfx.spring.theory.Config.enable.EnableTest;
import com.sfx.spring.theory.Config.imports.config.Librarian;
import com.sfx.spring.theory.Config.imports.direct.Book;
import com.sfx.spring.theory.Config.imports.register.Student;
import com.sfx.spring.theory.Config.imports.select.Desk;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableTest
public class SpringTheoryApplication {
    private static final Logger log = LoggerFactory.getLogger(SpringTheoryApplication.class);

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringTheoryApplication.class, args);


        System.out.println(context.getBean("com.sfx.spring.theory.Config.imports.direct.Book"));
        System.out.println(context.getBean(Book.class));
        System.out.println(context.getBean("animal"));

        System.out.println(context.getBean(Librarian.class));

        System.out.println(context.getBean(Desk.class));
        System.out.println(context.getBean(Student.class));

        Object object1 = System.getProperties();
        Object object2 = System.getenv();
        Object object3 = System.getSecurityManager();

        System.out.println("Hello world!");
    }

}
