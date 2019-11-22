package com.microservice.busi.lttsv8.control;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoConnectController 
{
	@GetMapping("lttsv8/{tranid}")
	public Map<String, Object> doConnect(@PathVariable String tranid, Map<String, Object> input) 
	{
		Map<String,Object> data = new LinkedHashMap<String, Object>();
		data.put("resoultcode", "AAAAAAAAAA");
		return data;
	}
}
