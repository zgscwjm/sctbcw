package com.sctbc.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Trainapply entity. @author MyEclipse Persistence Tools
 */

public class Trainapply implements java.io.Serializable {

	// Fields

	private Integer id;
	private Traininfo traininfo;
	private User user;
	private String applyKind;
	private String depId;
	private Timestamp applyDate;
	private String applyReason;
	private String appDownload;
	private String memo1;
	private String memo2;
	private String finalCheck;
	private Set auditingopinions = new HashSet(0);

	// Constructors

	/** default constructor */
	public Trainapply() {
	}

	/** minimal constructor */
	public Trainapply(Traininfo traininfo, User user, String applyKind,
			String depId, Timestamp applyDate, String appDownload,
			String finalCheck) {
		this.traininfo = traininfo;
		this.user = user;
		this.applyKind = applyKind;
		this.depId = depId;
		this.applyDate = applyDate;
		this.appDownload = appDownload;
		this.finalCheck = finalCheck;
	}

	/** full constructor */
	public Trainapply(Traininfo traininfo, User user, String applyKind,
			String depId, Timestamp applyDate, String applyReason,
			String appDownload, String memo1, String memo2, String finalCheck,
			Set auditingopinions) {
		this.traininfo = traininfo;
		this.user = user;
		this.applyKind = applyKind;
		this.depId = depId;
		this.applyDate = applyDate;
		this.applyReason = applyReason;
		this.appDownload = appDownload;
		this.memo1 = memo1;
		this.memo2 = memo2;
		this.finalCheck = finalCheck;
		this.auditingopinions = auditingopinions;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Traininfo getTraininfo() {
		return this.traininfo;
	}

	public void setTraininfo(Traininfo traininfo) {
		this.traininfo = traininfo;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getApplyKind() {
		return this.applyKind;
	}

	public void setApplyKind(String applyKind) {
		this.applyKind = applyKind;
	}

	public String getDepId() {
		return this.depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}

	public Timestamp getApplyDate() {
		return this.applyDate;
	}

	public void setApplyDate(Timestamp applyDate) {
		this.applyDate = applyDate;
	}

	public String getApplyReason() {
		return this.applyReason;
	}

	public void setApplyReason(String applyReason) {
		this.applyReason = applyReason;
	}

	public String getAppDownload() {
		return this.appDownload;
	}

	public void setAppDownload(String appDownload) {
		this.appDownload = appDownload;
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

	public String getFinalCheck() {
		return this.finalCheck;
	}

	public void setFinalCheck(String finalCheck) {
		this.finalCheck = finalCheck;
	}

	public Set getAuditingopinions() {
		return this.auditingopinions;
	}

	public void setAuditingopinions(Set auditingopinions) {
		this.auditingopinions = auditingopinions;
	}

}