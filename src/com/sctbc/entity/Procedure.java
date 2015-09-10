package com.sctbc.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Procedure entity. @author MyEclipse Persistence Tools
 */

public class Procedure implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer parentId;
	private String name;
	private Integer isend;
	private Integer memo1;
	private Integer memo2;
	private String memo3;
	private String memo4;
	private Set traintypes = new HashSet(0);

	// Constructors

	/** default constructor */
	public Procedure() {
	}

	/** minimal constructor */
	public Procedure(Integer parentId, String name, Integer isend) {
		this.parentId = parentId;
		this.name = name;
		this.isend = isend;
	}

	/** full constructor */
	public Procedure(Integer parentId, String name, Integer isend,
			Integer memo1, Integer memo2, String memo3, String memo4,
			Set traintypes) {
		this.parentId = parentId;
		this.name = name;
		this.isend = isend;
		this.memo1 = memo1;
		this.memo2 = memo2;
		this.memo3 = memo3;
		this.memo4 = memo4;
		this.traintypes = traintypes;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIsend() {
		return this.isend;
	}

	public void setIsend(Integer isend) {
		this.isend = isend;
	}

	public Integer getMemo1() {
		return this.memo1;
	}

	public void setMemo1(Integer memo1) {
		this.memo1 = memo1;
	}

	public Integer getMemo2() {
		return this.memo2;
	}

	public void setMemo2(Integer memo2) {
		this.memo2 = memo2;
	}

	public String getMemo3() {
		return this.memo3;
	}

	public void setMemo3(String memo3) {
		this.memo3 = memo3;
	}

	public String getMemo4() {
		return this.memo4;
	}

	public void setMemo4(String memo4) {
		this.memo4 = memo4;
	}

	public Set getTraintypes() {
		return this.traintypes;
	}

	public void setTraintypes(Set traintypes) {
		this.traintypes = traintypes;
	}

}