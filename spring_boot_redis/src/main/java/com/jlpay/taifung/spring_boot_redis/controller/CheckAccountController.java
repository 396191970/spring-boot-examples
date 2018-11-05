package com.jlpay.taifung.spring_boot_redis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.jlpay.taifung.spring_boot_redis.entity.CheckBusiChnInfo;
import com.jlpay.taifung.spring_boot_redis.repository.CheckBusiChnInfoRepository;
import com.jlpay.taifung.spring_boot_redis.request.TestRequest;
import com.jlpay.taifung.spring_boot_redis.response.MerchSettleResponse;

import lombok.Data;
import lombok.extern.apachecommons.CommonsLog;

/**
 * @author: lishaofeng
 **/
@RestController
@RequestMapping("/test")
@Data
@CommonsLog
public class CheckAccountController {

	@Autowired
	private RedisTemplate redisTemplate;
	@Autowired
	private CheckBusiChnInfoRepository checkBusiChnInfoRepository;

	@RequestMapping()
	public MerchSettleResponse hello(@RequestBody TestRequest merchSettleRequest) {
		MerchSettleResponse merchSettleResponse =new MerchSettleResponse();
		String ret = "TestRequest:"+JSON.toJSONString(merchSettleRequest);
		log.info(ret);

		List<CheckBusiChnInfo>  list = checkBusiChnInfoRepository.findAll();
		log.info(" list : " + JSON.toJSONString(list));


		return merchSettleResponse;
	}

}
