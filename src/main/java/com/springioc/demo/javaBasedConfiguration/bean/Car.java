package com.springioc.demo.javaBasedConfiguration.bean;

public class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Car is moving...");
    }
}
