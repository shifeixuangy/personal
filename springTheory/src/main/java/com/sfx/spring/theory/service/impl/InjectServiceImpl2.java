package com.sfx.spring.theory.service.impl;


import com.sfx.spring.theory.service.InjectService;
import org.springframework.stereotype.Service;

/**
 * @author shifeixuan
 */
@Service
public class InjectServiceImpl2 implements InjectService {

    @Override
    public String test() {
        return "testServiceImpl2";
    }
}
