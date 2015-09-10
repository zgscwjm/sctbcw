package com.sctbc.entity;

/**
 * Shortperiodestimate entity. @author MyEclipse Persistence Tools
 */

public class Shortperiodestimate implements java.io.Serializable {

	// Fields

	private Integer id;
	private User userByEvaluateUserId;
	private Traininfo traininfo;
	private User userByTrainUserId;
	private String necessity;
	private String satisfaction;
	private String costRationality;
	private String gainsDegree;
	private String evaluate;
	private String memo1;
	private String memo2;

	// Constructors

	/** default constructor */
	public Shortperiodestimate() {
	}

	/** minimal constructor */
	public Shortperiodestimate(User userByEvaluateUserId, Traininfo traininfo,
			User userByTrainUserId, String necessity, String satisfaction) {
		this.userByEvaluateUserId = userByEvaluateUserId;
		this.traininfo = traininfo;
		this.userByTrainUserId = userByTrainUserId;
		this.necessity = necessity;
		this.satisfaction = satisfaction;
	}

	/** full constructor */
	public Shortperiodestimate(User userByEvaluateUserId, Traininfo traininfo,
			User userByTrainUserId, String necessity, String satisfaction,
			String costRationality, String gainsDegree, String evaluate,
			String memo1, String memo2) {
		this.userByEvaluateUserId = userByEvaluateUserId;
		this.traininfo = traininfo;
		this.userByTrainUserId = userByTrainUserId;
		this.necessity = necessity;
		this.satisfaction = satisfaction;
		this.costRationality = costRationality;
		this.gainsDegree = gainsDegree;
		this.evaluate = evaluate;
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

	public User getUserByEvaluateUserId() {
		return this.userByEvaluateUserId;
	}

	public void setUserByEvaluateUserId(User userByEvaluateUserId) {
		this.userByEvaluateUserId = userByEvaluateUserId;
	}

	public Traininfo getTraininfo() {
		return this.traininfo;
	}

	public void setTraininfo(Traininfo traininfo) {
		this.traininfo = traininfo;
	}

	public User getUserByTrainUserId() {
		return this.userByTrainUserId;
	}

	public void setUserByTrainUserId(User userByTrainUserId) {
		this.userByTrainUserId = userByTrainUserId;
	}

	public String getNecessity() {
		return this.necessity;
	}

	public void setNecessity(String necessity) {
		this.necessity = necessity;
	}

	public String getSatisfaction() {
		return this.satisfaction;
	}

	public void setSatisfaction(String satisfaction) {
		this.satisfaction = satisfaction;
	}

	public String getCostRationality() {
		return this.costRationality;
	}

	public void setCostRationality(String costRationality) {
		this.costRationality = costRationality;
	}

	public String getGainsDegree() {
		return this.gainsDegree;
	}

	public void setGainsDegree(String gainsDegree) {
		this.gainsDegree = gainsDegree;
	}

	public String getEvaluate() {
		return this.evaluate;
	}

	public void setEvaluate(String evaluate) {
		this.evaluate = evaluate;
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