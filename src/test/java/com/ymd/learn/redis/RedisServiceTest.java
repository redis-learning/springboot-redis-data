package com.ymd.learn.redis;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ymd.learn.redis.service.redis.RedisService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisServiceTest {
	@Resource
	private RedisService redisService;
	
	@Test
	public void testSetValue() {
		redisService.setString("name", "michael");
	}
	
	@Test
	public void testGetValue() {
		Assert.assertEquals("michael", redisService.getString("name"));
	}
	
	
}
