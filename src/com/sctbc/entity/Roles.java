package com.sctbc.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Roles entity. @author MyEclipse Persistence Tools
 */

public class Roles implements java.io.Serializable {

	// Fields

	private Integer roleId;
	private String roleName;
	private String memo1;
	private String memo2;
	private Set rolesPrivileges = new HashSet(0);
	private Set users = new HashSet(0);

	// Constructors

	/** default constructor */
	public Roles() {
	}

	/** minimal constructor */
	public Roles(String roleName) {
		this.roleName = roleName;
	}

	/** full constructor */
	public Roles(String roleName, String memo1, String memo2,
			Set rolesPrivileges, Set users) {
		this.roleName = roleName;
		this.memo1 = memo1;
		this.memo2 = memo2;
		this.rolesPrivileges = rolesPrivileges;
		this.users = users;
	}

	// Property accessors

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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

	public Set getRolesPrivileges() {
		return this.rolesPrivileges;
	}

	public void setRolesPrivileges(Set rolesPrivileges) {
		this.rolesPrivileges = rolesPrivileges;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

}