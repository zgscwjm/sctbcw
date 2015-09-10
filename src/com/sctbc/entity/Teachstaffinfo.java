package com.sctbc.entity;

/**
 * Teachstaffinfo entity. @author MyEclipse Persistence Tools
 */

public class Teachstaffinfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private User user;
	private String name;
	private String sex;
	private String ethnicity;
	private String memo1;
	private String memo2;

	// Constructors

	/** default constructor */
	public Teachstaffinfo() {
	}

	/** minimal constructor */
	public Teachstaffinfo(User user, String name, String sex, String ethnicity) {
		this.user = user;
		this.name = name;
		this.sex = sex;
		this.ethnicity = ethnicity;
	}

	/** full constructor */
	public Teachstaffinfo(User user, String name, String sex, String ethnicity,
			String memo1, String memo2) {
		this.user = user;
		this.name = name;
		this.sex = sex;
		this.ethnicity = ethnicity;
		this.memo1 = memo1;
		this.memo2 = memo2;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEthnicity() {
		return this.ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
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