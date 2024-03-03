package com.springioc.demo.bean;

import java.beans.VetoableChangeListener;

public class Traveler {
    private final Vehicle vehicle;

    public Traveler(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void startJourney(){
        vehicle.move();
    }
}
