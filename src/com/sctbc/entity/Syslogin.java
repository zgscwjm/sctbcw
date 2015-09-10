package com.sctbc.entity;

import java.sql.Timestamp;

/**
 * Syslogin entity. @author MyEclipse Persistence Tools
 */

public class Syslogin implements java.io.Serializable {

	// Fields

	private Integer loginId;
	private String userId;
	private String loginIp;
	private Timestamp loginTime;
	private String memo1;
	private String memo2;

	// Constructors

	/** default constructor */
	public Syslogin() {
	}

	/** minimal constructor */
	public Syslogin(String userId, String loginIp, Timestamp loginTime) {
		this.userId = userId;
		this.loginIp = loginIp;
		this.loginTime = loginTime;
	}

	/** full constructor */
	public Syslogin(String userId, String loginIp, Timestamp loginTime,
			String memo1, String memo2) {
		this.userId = userId;
		this.loginIp = loginIp;
		this.loginTime = loginTime;
		this.memo1 = memo1;
		this.memo2 = memo2;
	}

	// Property accessors

	public Integer getLoginId() {
		return this.loginId;
	}

	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLoginIp() {
		return this.loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public Timestamp getLoginTime() {
		return this.loginTime;
	}

	public void setLoginTime(Timestamp loginTime) {
		this.loginTime = loginTime;
	}

	public String getMemo1() {
		return this.memo1;
	}

	public void setMemo1(String memo1) {
		this.memo1 = memo1;
	}

	public String getMemo2() {
		return this.memo2;
	}

	public void setMemo2(String memo2) {
		this.memo2 = memo2;
	}

}