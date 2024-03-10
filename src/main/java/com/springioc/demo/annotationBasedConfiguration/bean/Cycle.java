package com.springioc.demo.annotationBasedConfiguration.bean;

import org.springframework.stereotype.Component;

@Component("Cycle")
public class Cycle implements Vehicle {
    @Override
    public void move() {
        System.out.println("Cycle is moving");
    }
}
