package com.jlpay.taifung.spring_boot_redis.entity;

import java.io.Serializable;

import javax.persistence.Column;

import lombok.Data;


@Data
public class CheckBusiChnInfoPK implements Serializable {
	private static final long serialVersionUID = 1L;


	@Column(name="BUSI_TYPE")
	private String busiType;


	@Column(name="CHANNEL_CODE")
	private String channelCode;


	@Column(name="CHANNEL_TYPE")
	private String channelType;


	@Column(name="TRANS_TYPE")
	private String transType;


}