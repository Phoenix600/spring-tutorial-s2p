package com.springioc.demo;

import com.springioc.demo.bean.Car;
import com.springioc.demo.bean.Traveler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.springioc.demo.config.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

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
