package com.ymd.learn.redis.service.redis;

import javax.annotation.Resource;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {
	
	@Resource
	private StringRedisTemplate stringRedisTemplate;
	
	public void setString(String name, String value) {
		this.stringRedisTemplate.opsForValue().set(name, value);
	}
	
	public String getString(String name) {
		return this.stringRedisTemplate.opsForValue().get(name);
	}
	
}
