package com.jlpay.taifung.spring_boot_redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EnableCaching
public class SampleRedisApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SampleRedisApplication.class, args);

	}

}

