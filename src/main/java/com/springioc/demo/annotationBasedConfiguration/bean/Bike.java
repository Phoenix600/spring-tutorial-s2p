package com.springioc.demo.annotationBasedConfiguration.bean;

import org.springframework.stereotype.Component;

@Component("Bike")
public class Bike implements Vehicle {
    @Override
    public void move() {
        System.out.println("Bike is moving");
    }
}
