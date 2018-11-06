package com.jlpay.taifung.spring_boot_redis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.jlpay.taifung.spring_boot_redis.entity.CheckBusiChnInfo;
import com.jlpay.taifung.spring_boot_redis.response.MerchSettleResponse;
import com.jlpay.taifung.spring_boot_redis.service.impl.CheckBusiChnInfoService;

import lombok.Data;
import lombok.extern.apachecommons.CommonsLog;

/**
 * @author: lishaofeng
 **/
@RestController
@RequestMapping()
@Data
@CommonsLog
public class TestController {

	@Autowired
	private RedisTemplate redisTemplate;
	@Autowired
	private CheckBusiChnInfoService checkBusiChnInfoService;

	@RequestMapping("/testCache")
	public MerchSettleResponse testCache() {
		MerchSettleResponse merchSettleResponse =new MerchSettleResponse();

		List<CheckBusiChnInfo>  list = checkBusiChnInfoService.findAll();

		  list = checkBusiChnInfoService.findAll("1");
		  list = checkBusiChnInfoService.findAll("2","3");
		log.info(" list : " + JSON.toJSONString(list));
		return merchSettleResponse;
	}
	@RequestMapping("/testRedis")
	public String  testRedis() {
		String key ="1234key";
		String value ="23423value";

		redisTemplate.opsForList().leftPush(key, value);
		String ret = redisTemplate.opsForList().leftPop(key).toString();

		return ret;
	}
}
