package com.springioc.demo;

import com.springioc.demo.javaBasedConfiguration.bean.Car;
import com.springioc.demo.javaBasedConfiguration.bean.Traveler;
import com.springioc.demo.javaBasedConfiguration.bean.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

	}

}
