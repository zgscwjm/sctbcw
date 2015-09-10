package com.sctbc.entity;

/**
 * RolesPrivilege entity. @author MyEclipse Persistence Tools
 */

public class RolesPrivilege implements java.io.Serializable {

	// Fields

	private Integer id;
	private Privilege privilege;
	private Roles roles;
	private String demo1;
	private String demo2;

	// Constructors

	/** default constructor */
	public RolesPrivilege() {
	}

	/** minimal constructor */
	public RolesPrivilege(Privilege privilege, Roles roles, String demo1) {
		this.privilege = privilege;
		this.roles = roles;
		this.demo1 = demo1;
	}

	/** full constructor */
	public RolesPrivilege(Privilege privilege, Roles roles, String demo1,
			String demo2) {
		this.privilege = privilege;
		this.roles = roles;
		this.demo1 = demo1;
		this.demo2 = demo2;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Privilege getPrivilege() {
		return this.privilege;
	}

	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
	}

	public Roles getRoles() {
		return this.roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
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

}