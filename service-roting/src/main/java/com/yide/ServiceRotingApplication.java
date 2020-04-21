package com.yide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ServiceRotingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRotingApplication.class, args);
    }

}
