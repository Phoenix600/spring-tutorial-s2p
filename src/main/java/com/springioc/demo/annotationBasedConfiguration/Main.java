package com.springioc.demo.annotationBasedConfiguration;

import com.springioc.demo.annotationBasedConfiguration.bean.Car;
import com.springioc.demo.annotationBasedConfiguration.bean.Traveler;
import com.springioc.demo.annotationBasedConfiguration.config.AppConfig;
import com.springioc.demo.annotationBasedConfiguration.controller.DemoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car c = context.getBean(Car.class);
        c.move();
        Traveler traveler = context.getBean(Traveler.class);



//        Spring Stereotypes
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        DemoController demoController =  ctx.getBean(DemoController.class);
        System.out.println(demoController.hello());


    }
}
