package com.design.pattern.factoryPattern.config;

import com.design.pattern.factoryPattern.factory.ShapeFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShapeFactoryConfig {

    @Bean
    public ShapeFactory shapeFactory() {
        return new ShapeFactory();
    }
}

