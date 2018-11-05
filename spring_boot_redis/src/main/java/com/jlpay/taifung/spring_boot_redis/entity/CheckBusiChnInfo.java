package com.jlpay.taifung.spring_boot_redis.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the T_CHECK_BUSI_CHN_INFO database table.
 *
 */
@Entity
@Table(name="T_CHECK_BUSI_CHN_INFO")
@NamedQuery(name="CheckBusiChnInfo.findAll", query="SELECT c FROM CheckBusiChnInfo c")
@IdClass(CheckBusiChnInfoPK.class)
public class CheckBusiChnInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BUSI_TYPE")
	private String busiType;

	@Id
	@Column(name="CHANNEL_CODE")
	private String channelCode;

	@Column(name="CHANNEL_NAME")
	private String channelName;
	@Id
	@Column(name="CHANNEL_TYPE")
	private String channelType;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_TIME")
	private Date createTime;

	private String remark;

	private String status;
	@Id
	@Column(name="TRANS_TYPE")
	private String transType;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TIME")
	private Date updateTime;

	public CheckBusiChnInfo() {
	}

	public String getBusiType() {
		return this.busiType;
	}

	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}

	public String getChannelCode() {
		return this.channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getChannelName() {
		return this.channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getChannelType() {
		return this.channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTransType() {
		return this.transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}