package com.microservice.busi.lttsv8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker	//注解开启断路器功能

public class Lttsv8App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(Lttsv8App.class, args);
    }
}
