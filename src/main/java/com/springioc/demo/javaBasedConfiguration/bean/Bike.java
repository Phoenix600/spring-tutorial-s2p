package com.springioc.demo.javaBasedConfiguration.bean;

public class Bike implements Vehicle{
    @Override
    public void move() {
        System.out.println("Bike is moving");
    }
}
