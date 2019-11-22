package com.microservice.busi.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SsoApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(SsoApp.class, args);
    }
}
