package com.springioc.demo.javaBasedConfiguration.bean;

public class Traveler {
    private final Vehicle vehicle;

    public Traveler(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void startJourney(){
        vehicle.move();
    }
}
