package com.sctbc.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Newstype entity. @author MyEclipse Persistence Tools
 */

public class Newstype implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String memo1;
	private String memo2;
	private Set newses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Newstype() {
	}

	/** full constructor */
	public Newstype(String name, String memo1, String memo2, Set newses) {
		this.name = name;
		this.memo1 = memo1;
		this.memo2 = memo2;
		this.newses = newses;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Set getNewses() {
		return this.newses;
	}

	public void setNewses(Set newses) {
		this.newses = newses;
	}

}