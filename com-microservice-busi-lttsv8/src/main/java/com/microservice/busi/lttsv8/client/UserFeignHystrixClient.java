package com.microservice.busi.lttsv8.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.busi.lttsv8.client.UserFeignHystrixClient.HystrixClientFallback;
import com.microservice.busi.lttsv8.entity.User;

@FeignClient(name = "sso" ,fallback = HystrixClientFallback.class)
public interface UserFeignHystrixClient 
{
	@GetMapping("user/{id}")
	public User findByIdFeign(@PathVariable("id") Long id);
	
	@Component
	static class HystrixClientFallback implements UserFeignHystrixClient 
	{
	    private static final Logger LOGGER = LoggerFactory.getLogger(HystrixClientFallback.class);
	   
	    public User findByIdFeign(Long id) {
	      HystrixClientFallback.LOGGER.info("异常发生，进入fallback方法，接收的参数：id = {}", id);
	      User user = new User();
	      user.setId(-1L);
	      user.setUsername("default username");
	      user.setAge(0);
	      return user;
	    }
	}
}