package com.yide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class ProviderService2Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderService2Application.class, args);
    }

}
