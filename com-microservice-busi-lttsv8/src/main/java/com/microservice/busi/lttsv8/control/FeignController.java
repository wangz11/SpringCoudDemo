package com.microservice.busi.lttsv8.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.busi.lttsv8.client.UserFeignHystrixClient;
import com.microservice.busi.lttsv8.entity.User;

@RestController
public class FeignController 
{
	Logger logger = LoggerFactory.getLogger(FeignController.class);
	
	@Autowired
	private UserFeignHystrixClient userFeignClient;

	@GetMapping("feign/{id}")
	public User findByIdFeign(@PathVariable Long id) 
	{
		logger.info("lttsv8 查询用户信息开始。。。。");
		User user = this.userFeignClient.findByIdFeign(id);
		return user;
	}
}
