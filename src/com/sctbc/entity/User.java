package com.sctbc.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private String userId;
	private Roles roles;
	private String password;
	private String memo1;
	private String memo2;
	private Set trainapplies = new HashSet(0);
	private Set auditingopinions = new HashSet(0);
	private Set longperiodestimatesForTrainUserId = new HashSet(0);
	private Set shortperiodestimatesForTrainUserId = new HashSet(0);
	private Teachstaffenlargeinfo teachstaffenlargeinfo;
	private Set shortperiodestimatesForEvaluateUserId = new HashSet(0);
	private Set longperiodestimatesForEvaluateUserId = new HashSet(0);
	private Set teachstafftraininfos = new HashSet(0);
	private Set teachstaffinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String userId, Roles roles, String password) {
		this.userId = userId;
		this.roles = roles;
		this.password = password;
	}

	/** full constructor */
	public User(String userId, Roles roles, String password, String memo1,
			String memo2, Set trainapplies, Set auditingopinions,
			Set longperiodestimatesForTrainUserId,
			Set shortperiodestimatesForTrainUserId,
			Teachstaffenlargeinfo teachstaffenlargeinfo,
			Set shortperiodestimatesForEvaluateUserId,
			Set longperiodestimatesForEvaluateUserId, Set teachstafftraininfos,
			Set teachstaffinfos) {
		this.userId = userId;
		this.roles = roles;
		this.password = password;
		this.memo1 = memo1;
		this.memo2 = memo2;
		this.trainapplies = trainapplies;
		this.auditingopinions = auditingopinions;
		this.longperiodestimatesForTrainUserId = longperiodestimatesForTrainUserId;
		this.shortperiodestimatesForTrainUserId = shortperiodestimatesForTrainUserId;
		this.teachstaffenlargeinfo = teachstaffenlargeinfo;
		this.shortperiodestimatesForEvaluateUserId = shortperiodestimatesForEvaluateUserId;
		this.longperiodestimatesForEvaluateUserId = longperiodestimatesForEvaluateUserId;
		this.teachstafftraininfos = teachstafftraininfos;
		this.teachstaffinfos = teachstaffinfos;
	}

	// Property accessors

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Roles getRoles() {
		return this.roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public Set getTrainapplies() {
		return this.trainapplies;
	}

	public void setTrainapplies(Set trainapplies) {
		this.trainapplies = trainapplies;
	}

	public Set getAuditingopinions() {
		return this.auditingopinions;
	}

	public void setAuditingopinions(Set auditingopinions) {
		this.auditingopinions = auditingopinions;
	}

	public Set getLongperiodestimatesForTrainUserId() {
		return this.longperiodestimatesForTrainUserId;
	}

	public void setLongperiodestimatesForTrainUserId(
			Set longperiodestimatesForTrainUserId) {
		this.longperiodestimatesForTrainUserId = longperiodestimatesForTrainUserId;
	}

	public Set getShortperiodestimatesForTrainUserId() {
		return this.shortperiodestimatesForTrainUserId;
	}

	public void setShortperiodestimatesForTrainUserId(
			Set shortperiodestimatesForTrainUserId) {
		this.shortperiodestimatesForTrainUserId = shortperiodestimatesForTrainUserId;
	}

	public Teachstaffenlargeinfo getTeachstaffenlargeinfo() {
		return this.teachstaffenlargeinfo;
	}

	public void setTeachstaffenlargeinfo(
			Teachstaffenlargeinfo teachstaffenlargeinfo) {
		this.teachstaffenlargeinfo = teachstaffenlargeinfo;
	}

	public Set getShortperiodestimatesForEvaluateUserId() {
		return this.shortperiodestimatesForEvaluateUserId;
	}

	public void setShortperiodestimatesForEvaluateUserId(
			Set shortperiodestimatesForEvaluateUserId) {
		this.shortperiodestimatesForEvaluateUserId = shortperiodestimatesForEvaluateUserId;
	}

	public Set getLongperiodestimatesForEvaluateUserId() {
		return this.longperiodestimatesForEvaluateUserId;
	}

	public void setLongperiodestimatesForEvaluateUserId(
			Set longperiodestimatesForEvaluateUserId) {
		this.longperiodestimatesForEvaluateUserId = longperiodestimatesForEvaluateUserId;
	}

	public Set getTeachstafftraininfos() {
		return this.teachstafftraininfos;
	}

	public void setTeachstafftraininfos(Set teachstafftraininfos) {
		this.teachstafftraininfos = teachstafftraininfos;
	}

	public Set getTeachstaffinfos() {
		return this.teachstaffinfos;
	}

	public void setTeachstaffinfos(Set teachstaffinfos) {
		this.teachstaffinfos = teachstaffinfos;
	}

}