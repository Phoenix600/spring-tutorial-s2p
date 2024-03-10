package com.springioc.demo.annotationBasedConfiguration.config;

import com.springioc.demo.annotationBasedConfiguration.bean.Traveler;
import com.springioc.demo.annotationBasedConfiguration.bean.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;

/**
 * This annotation is used to specify the base package to scan for spring
 * beans/components
 */
//@ComponentScan(basePackages = "com.springioc.demo.annotationBasedConfiguration.beans")
@ComponentScan(basePackages = "com.springioc.demo.annotationBasedConfiguration")
public class AppConfig {

}
