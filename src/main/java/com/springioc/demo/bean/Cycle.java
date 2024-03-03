package com.springioc.demo.bean;

public class Cycle implements  Vehicle{
    @Override
    public void move() {
        System.out.println("Cycle is moving");
    }
}
