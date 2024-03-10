package com.springioc.demo.annotationBasedConfiguration.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Traveler")
public class Traveler {
    private final Vehicle vehicle;


    /**
     * Automatically Car dependency will be injected, since it posses the higher preference
     * @param vehicle
     */
    @Autowired
    public Traveler(@Qualifier("Car") Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Autowired
//    public Traveler(@Qualifier("Car") Vehicle vehicle){this.vehicle = vehicle;}

    public void startJourney(){
        System.out.println("Running the AnnotationBased Configuration");
        vehicle.move();
    }
}
