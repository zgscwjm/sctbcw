package com.sctbc.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Deptinfo entity. @author MyEclipse Persistence Tools
 */

public class Deptinfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String depId;
	private String depName;
	private String depLeaderId;
	private String memo1;
	private String memo2;
	private Set teachstaffenlargeinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Deptinfo() {
	}

	/** minimal constructor */
	public Deptinfo(String depId, String depName, String depLeaderId) {
		this.depId = depId;
		this.depName = depName;
		this.depLeaderId = depLeaderId;
	}

	/** full constructor */
	public Deptinfo(String depId, String depName, String depLeaderId,
			String memo1, String memo2, Set teachstaffenlargeinfos) {
		this.depId = depId;
		this.depName = depName;
		this.depLeaderId = depLeaderId;
		this.memo1 = memo1;
		this.memo2 = memo2;
		this.teachstaffenlargeinfos = teachstaffenlargeinfos;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepId() {
		return this.depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return this.depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getDepLeaderId() {
		return this.depLeaderId;
	}

	public void setDepLeaderId(String depLeaderId) {
		this.depLeaderId = depLeaderId;
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

	public Set getTeachstaffenlargeinfos() {
		return this.teachstaffenlargeinfos;
	}

	public void setTeachstaffenlargeinfos(Set teachstaffenlargeinfos) {
		this.teachstaffenlargeinfos = teachstaffenlargeinfos;
	}

}