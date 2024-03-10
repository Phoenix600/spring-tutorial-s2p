package com.springioc.demo.javaBasedConfiguration;

import com.springioc.demo.DemoApplication;
import com.springioc.demo.javaBasedConfiguration.bean.Car;
import com.springioc.demo.javaBasedConfiguration.bean.Traveler;
import com.springioc.demo.javaBasedConfiguration.bean.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);


//
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Car car = applicationContext.getBean(Car.class);
        Traveler traveler = applicationContext.getBean(Traveler.class);
        car.move();
        traveler.startJourney();

    }
}
