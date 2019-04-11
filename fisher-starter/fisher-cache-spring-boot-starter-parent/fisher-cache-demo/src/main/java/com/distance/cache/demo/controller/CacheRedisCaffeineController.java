package com.distance.cache.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.distance.cache.demo.service.CacheRedisCaffeineService;
import com.distance.cache.demo.vo.ResultMap;
import com.distance.cache.demo.vo.UserVO;

import javax.annotation.Resource;

@RestController
@RequestMapping("user")
public class CacheRedisCaffeineController {

	@Resource
	private CacheRedisCaffeineService cacheRedisCaffeineService;
	
	@GetMapping("id/{id}")
	public ResultMap get(@PathVariable long id) {
		UserVO user = cacheRedisCaffeineService.get(id);
		return ResultMap.buildSuccess().put("user", user);
	}
	
	@GetMapping("name/{name}")
	public ResultMap get(@PathVariable String name) {
		UserVO user = cacheRedisCaffeineService.get(name);
		return ResultMap.buildSuccess().put("user", user);
	}
	
	@GetMapping("update/{id}")
	public ResultMap update(@PathVariable long id) {
		UserVO user = cacheRedisCaffeineService.get(id);
		cacheRedisCaffeineService.update(user);
		return ResultMap.buildSuccess().put("user", user);
	}
	
	@GetMapping("delete/{id}")
	public ResultMap delete(@PathVariable long id) {
		cacheRedisCaffeineService.delete(id);
		return ResultMap.buildSuccess();
	}
}
