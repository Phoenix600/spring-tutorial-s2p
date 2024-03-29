package com.springioc.demo.javaBasedConfiguration.bean.config;

import com.springioc.demo.javaBasedConfiguration.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class AppConfig {

    @Bean
    public Vehicle car(){
        return new Car();
    }

    @Bean
    public Vehicle bike(){
        return new Bike();
    }

    @Bean
    public Vehicle cycle(){
        return new Cycle();
    }


    @Bean
    public Traveler traveler(){
        return new Traveler(new Bike()); // DI
    }

}
