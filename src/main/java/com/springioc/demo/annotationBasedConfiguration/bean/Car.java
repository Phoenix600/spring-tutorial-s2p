package com.springioc.demo.annotationBasedConfiguration.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Car")
@Primary
public class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Car is moving...");
    }
}
