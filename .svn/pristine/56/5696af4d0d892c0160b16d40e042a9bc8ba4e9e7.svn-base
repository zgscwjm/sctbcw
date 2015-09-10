package com.sctbc.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Privilege entity. @author MyEclipse Persistence Tools
 */

public class Privilege implements java.io.Serializable {

	// Fields

	private Integer privilegeId;
	private String privilegeName;
	private String description;
	private String demo1;
	private String demo2;
	private Set resources = new HashSet(0);
	private Set rolesPrivileges = new HashSet(0);

	// Constructors

	/** default constructor */
	public Privilege() {
	}

	/** minimal constructor */
	public Privilege(String privilegeName, String description) {
		this.privilegeName = privilegeName;
		this.description = description;
	}

	/** full constructor */
	public Privilege(String privilegeName, String description, String demo1,
			String demo2, Set resources, Set rolesPrivileges) {
		this.privilegeName = privilegeName;
		this.description = description;
		this.demo1 = demo1;
		this.demo2 = demo2;
		this.resources = resources;
		this.rolesPrivileges = rolesPrivileges;
	}

	// Property accessors

	public Integer getPrivilegeId() {
		return this.privilegeId;
	}

	public void setPrivilegeId(Integer privilegeId) {
		this.privilegeId = privilegeId;
	}

	public String getPrivilegeName() {
		return this.privilegeName;
	}

	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDemo1() {
		return this.demo1;
	}

	public void setDemo1(String demo1) {
		this.demo1 = demo1;
	}

	public String getDemo2() {
		return this.demo2;
	}

	public void setDemo2(String demo2) {
		this.demo2 = demo2;
	}

	public Set getResources() {
		return this.resources;
	}

	public void setResources(Set resources) {
		this.resources = resources;
	}

	public Set getRolesPrivileges() {
		return this.rolesPrivileges;
	}

	public void setRolesPrivileges(Set rolesPrivileges) {
		this.rolesPrivileges = rolesPrivileges;
	}

}