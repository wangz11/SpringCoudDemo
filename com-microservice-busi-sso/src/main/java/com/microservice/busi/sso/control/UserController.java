package com.microservice.busi.sso.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.busi.sso.dao.UserRepository;
import com.microservice.busi.sso.entity.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description = "用户接口")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@ApiOperation(value = "查找用户信息", notes = "根据用户id查找用户对象")
	@ApiImplicitParam(name = "id", value = "Long", required = true, paramType = "path", dataType = "Long")
	@GetMapping("user/{id}")
	public User findById(@PathVariable("id") Long id) {
		
		logger.info("sso 查询用户信息开始");
		User user = new User();
		user.setId(id);
		Example<User> userExample = Example.of(user);
		return userRepository.findOne(userExample).orElse(null);
//        return this.userRepository.findOne(id);
	}
}
