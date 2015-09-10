package com.sctbc.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Traintype entity. @author MyEclipse Persistence Tools
 */

public class Traintype implements java.io.Serializable {

	// Fields

	private Integer trainkindId;
	private Procedure procedure;
	private String kindName;
	private String memo1;
	private String memo2;
	private Set traininfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Traintype() {
	}

	/** minimal constructor */
	public Traintype(Procedure procedure, String kindName) {
		this.procedure = procedure;
		this.kindName = kindName;
	}

	/** full constructor */
	public Traintype(Procedure procedure, String kindName, String memo1,
			String memo2, Set traininfos) {
		this.procedure = procedure;
		this.kindName = kindName;
		this.memo1 = memo1;
		this.memo2 = memo2;
		this.traininfos = traininfos;
	}

	// Property accessors

	public Integer getTrainkindId() {
		return this.trainkindId;
	}

	public void setTrainkindId(Integer trainkindId) {
		this.trainkindId = trainkindId;
	}

	public Procedure getProcedure() {
		return this.procedure;
	}

	public void setProcedure(Procedure procedure) {
		this.procedure = procedure;
	}

	public String getKindName() {
		return this.kindName;
	}

	public void setKindName(String kindName) {
		this.kindName = kindName;
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

	public Set getTraininfos() {
		return this.traininfos;
	}

	public void setTraininfos(Set traininfos) {
		this.traininfos = traininfos;
	}

}