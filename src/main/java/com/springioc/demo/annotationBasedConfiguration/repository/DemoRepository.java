package com.springioc.demo.annotationBasedConfiguration.repository;


import org.springframework.stereotype.Repository;

@Repository
public class DemoRepository {
    public String hello(){
        return "Hello Repository";
    }
}
