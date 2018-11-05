package com.jlpay.taifung.spring_boot_redis.repository;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.jlpay.taifung.spring_boot_redis.entity.CheckBusiChnInfo;
import com.jlpay.taifung.spring_boot_redis.entity.CheckBusiChnInfoPK;



public interface CheckBusiChnInfoRepository extends JpaRepository<CheckBusiChnInfo,CheckBusiChnInfoPK> , JpaSpecificationExecutor<CheckBusiChnInfo>
{


	 @Cacheable(value = "findAll", key = "'test'")
	 List<CheckBusiChnInfo> findAll();

}
