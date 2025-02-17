package com.sfx.spring.theory.controller;


import com.sfx.spring.theory.service.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @author shifeixuan
 */
@RestController

public class InjectController {


    @Qualifier(value = "injectServiceImpl2")
    @Autowired
    InjectService injectService;


    @Value("${server.port}")
    @Resource
    InjectService injectServiceImpl;

    @RequestMapping("autowired")
    public String autowired() {
        return injectService.test();
    }
    @RequestMapping("resource")
    public String resource() {
        return injectServiceImpl.test();
    }

}
