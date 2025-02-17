package com.sfx.spring.theory.service.impl;

import com.sfx.spring.theory.service.InjectService;
import org.springframework.stereotype.Service;

@Service
public class InjectServiceImpl implements InjectService {

    @Override
    public String test() {
        return "testServiceImpl";
    }
}
