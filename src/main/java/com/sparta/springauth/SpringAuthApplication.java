package com.sparta.springauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = org.springframework.boot.security.autoconfigure.SecurityAutoConfiguration.class)
public class SpringAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAuthApplication.class, args);
    }

}