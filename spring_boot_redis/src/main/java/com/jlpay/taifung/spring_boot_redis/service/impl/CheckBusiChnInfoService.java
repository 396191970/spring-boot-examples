package com.jlpay.taifung.spring_boot_redis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.jlpay.taifung.spring_boot_redis.entity.CheckBusiChnInfo;
import com.jlpay.taifung.spring_boot_redis.repository.CheckBusiChnInfoRepository;
@Service
@CacheConfig(cacheNames = "CheckBusiChnInfoService")  //类上配置cacheNames  方法上可覆盖
public class CheckBusiChnInfoService
{
	@Autowired CheckBusiChnInfoRepository  checkBusiChnInfoRepository;

	@Cacheable //没有设置key属性  key更加函数参数自动生成
	public List<CheckBusiChnInfo> findAll()
	{
		return checkBusiChnInfoRepository.findAll();
	}
	@Cacheable
	public List<CheckBusiChnInfo> findAll(String str)
	{
		return checkBusiChnInfoRepository.findAll();
	}
	@Cacheable
	public List<CheckBusiChnInfo> findAll(String str,String str1 )
	{
		return checkBusiChnInfoRepository.findAll();
	}
}
