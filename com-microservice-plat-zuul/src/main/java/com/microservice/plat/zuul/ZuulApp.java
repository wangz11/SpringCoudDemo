package com.microservice.plat.zuul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@RestController
public class ZuulApp 
{
	Logger logger = LoggerFactory.getLogger(ZuulApp.class);
	
    public static void main( String[] args )
    {
        SpringApplication.run(ZuulApp.class, args);
    }
    
    @GetMapping("/hello")
    public String hello() {
    	logger.info("日志收集测试111111");
    	return "日志测试";
    }
}
