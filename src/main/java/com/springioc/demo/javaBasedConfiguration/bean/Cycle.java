package com.springioc.demo.javaBasedConfiguration.bean;

public class Cycle implements  Vehicle{
    @Override
    public void move() {
        System.out.println("Cycle is moving");
    }
}
