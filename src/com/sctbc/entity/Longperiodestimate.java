package com.sctbc.entity;

/**
 * Longperiodestimate entity. @author MyEclipse Persistence Tools
 */

public class Longperiodestimate implements java.io.Serializable {

	// Fields

	private Integer id;
	private User userByEvaluateUserId;
	private Traininfo traininfo;
	private User userByTrainUserId;
	private String viewChange;
	private String teachAbilityEnhance;
	private String eduAbilityEnhance;
	private String sciAbilityEnhance;
	private String manAbilityEnhance;
	private String speAbilityEnhance;
	private String ideaStyle;
	private String workAbilityEnhance;
	private String speBuildAbility;
	private String courseBuildAbility;
	private String trainSatisfy;
	private String memo1;
	private String memo2;

	// Constructors

	/** default constructor */
	public Longperiodestimate() {
	}

	/** minimal constructor */
	public Longperiodestimate(User userByEvaluateUserId, Traininfo traininfo,
			User userByTrainUserId, String viewChange,
			String teachAbilityEnhance, String eduAbilityEnhance,
			String sciAbilityEnhance, String manAbilityEnhance,
			String speAbilityEnhance, String ideaStyle,
			String workAbilityEnhance) {
		this.userByEvaluateUserId = userByEvaluateUserId;
		this.traininfo = traininfo;
		this.userByTrainUserId = userByTrainUserId;
		this.viewChange = viewChange;
		this.teachAbilityEnhance = teachAbilityEnhance;
		this.eduAbilityEnhance = eduAbilityEnhance;
		this.sciAbilityEnhance = sciAbilityEnhance;
		this.manAbilityEnhance = manAbilityEnhance;
		this.speAbilityEnhance = speAbilityEnhance;
		this.ideaStyle = ideaStyle;
		this.workAbilityEnhance = workAbilityEnhance;
	}

	/** full constructor */
	public Longperiodestimate(User userByEvaluateUserId, Traininfo traininfo,
			User userByTrainUserId, String viewChange,
			String teachAbilityEnhance, String eduAbilityEnhance,
			String sciAbilityEnhance, String manAbilityEnhance,
			String speAbilityEnhance, String ideaStyle,
			String workAbilityEnhance, String speBuildAbility,
			String courseBuildAbility, String trainSatisfy, String memo1,
			String memo2) {
		this.userByEvaluateUserId = userByEvaluateUserId;
		this.traininfo = traininfo;
		this.userByTrainUserId = userByTrainUserId;
		this.viewChange = viewChange;
		this.teachAbilityEnhance = teachAbilityEnhance;
		this.eduAbilityEnhance = eduAbilityEnhance;
		this.sciAbilityEnhance = sciAbilityEnhance;
		this.manAbilityEnhance = manAbilityEnhance;
		this.speAbilityEnhance = speAbilityEnhance;
		this.ideaStyle = ideaStyle;
		this.workAbilityEnhance = workAbilityEnhance;
		this.speBuildAbility = speBuildAbility;
		this.courseBuildAbility = courseBuildAbility;
		this.trainSatisfy = trainSatisfy;
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

	public String getViewChange() {
		return this.viewChange;
	}

	public void setViewChange(String viewChange) {
		this.viewChange = viewChange;
	}

	public String getTeachAbilityEnhance() {
		return this.teachAbilityEnhance;
	}

	public void setTeachAbilityEnhance(String teachAbilityEnhance) {
		this.teachAbilityEnhance = teachAbilityEnhance;
	}

	public String getEduAbilityEnhance() {
		return this.eduAbilityEnhance;
	}

	public void setEduAbilityEnhance(String eduAbilityEnhance) {
		this.eduAbilityEnhance = eduAbilityEnhance;
	}

	public String getSciAbilityEnhance() {
		return this.sciAbilityEnhance;
	}

	public void setSciAbilityEnhance(String sciAbilityEnhance) {
		this.sciAbilityEnhance = sciAbilityEnhance;
	}

	public String getManAbilityEnhance() {
		return this.manAbilityEnhance;
	}

	public void setManAbilityEnhance(String manAbilityEnhance) {
		this.manAbilityEnhance = manAbilityEnhance;
	}

	public String getSpeAbilityEnhance() {
		return this.speAbilityEnhance;
	}

	public void setSpeAbilityEnhance(String speAbilityEnhance) {
		this.speAbilityEnhance = speAbilityEnhance;
	}

	public String getIdeaStyle() {
		return this.ideaStyle;
	}

	public void setIdeaStyle(String ideaStyle) {
		this.ideaStyle = ideaStyle;
	}

	public String getWorkAbilityEnhance() {
		return this.workAbilityEnhance;
	}

	public void setWorkAbilityEnhance(String workAbilityEnhance) {
		this.workAbilityEnhance = workAbilityEnhance;
	}

	public String getSpeBuildAbility() {
		return this.speBuildAbility;
	}

	public void setSpeBuildAbility(String speBuildAbility) {
		this.speBuildAbility = speBuildAbility;
	}

	public String getCourseBuildAbility() {
		return this.courseBuildAbility;
	}

	public void setCourseBuildAbility(String courseBuildAbility) {
		this.courseBuildAbility = courseBuildAbility;
	}

	public String getTrainSatisfy() {
		return this.trainSatisfy;
	}

	public void setTrainSatisfy(String trainSatisfy) {
		this.trainSatisfy = trainSatisfy;
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