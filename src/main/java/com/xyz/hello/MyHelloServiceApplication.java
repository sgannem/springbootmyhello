package com.xyz.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyHelloServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyHelloServiceApplication.class, args);
        System.out.println("Hello...");
    }
}
