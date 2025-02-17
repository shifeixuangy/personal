package com.sfx.spring.theory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;


@Order
public class InitTest implements EnvironmentPostProcessor {

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        Map<String, Object> map = new HashMap<>();
        map.put("spring.cloud.nacos.config.shared-configs[99].dataId", "ty_common.yaml");
        map.put("spring.cloud.nacos.config.shared-configs[99].TY_BIZ_GROUP", "TY_BIZ_GROUP");
        environment.getPropertySources().addLast(new MapPropertySource("SHARE",map));

    }
}
