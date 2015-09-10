package com.sctbc.entity;

/**
 * Teachstaffenlargeinfo entity. @author MyEclipse Persistence Tools
 */

public class Teachstaffenlargeinfo implements java.io.Serializable {

	// Fields

	private String userId;
	private Deptinfo deptinfo;
	private User user;
	private String idnumber;
	private String presentWorkTime;
	private String startWorkTime;
	private String graduateTime;
	private String lastGraduateSchool;
	private String enterForm;
	private String enterSource;
	private String status;
	private String schoolSpecialty;
	private String workSpecialty;
	private String primaryPost;
	private String secondaryPost;
	private Double postSalary;
	private Double gradeSalary;
	private String marriage;
	private String political;
	private String highestEducation;
	private String highestGrade;
	private String specialtyRank;
	private String interests;
	private String userType;
	private String memo1;
	private String memo2;

	// Constructors

	/** default constructor */
	public Teachstaffenlargeinfo() {
	}

	/** minimal constructor */
	public Teachstaffenlargeinfo(String userId, Deptinfo deptinfo, User user,
			String idnumber, String presentWorkTime, String startWorkTime,
			String graduateTime, String lastGraduateSchool, String enterForm,
			String enterSource, String status, String schoolSpecialty,
			String workSpecialty, String primaryPost, String secondaryPost,
			Double postSalary, Double gradeSalary, String marriage,
			String political, String highestEducation, String highestGrade,
			String specialtyRank, String interests) {
		this.userId = userId;
		this.deptinfo = deptinfo;
		this.user = user;
		this.idnumber = idnumber;
		this.presentWorkTime = presentWorkTime;
		this.startWorkTime = startWorkTime;
		this.graduateTime = graduateTime;
		this.lastGraduateSchool = lastGraduateSchool;
		this.enterForm = enterForm;
		this.enterSource = enterSource;
		this.status = status;
		this.schoolSpecialty = schoolSpecialty;
		this.workSpecialty = workSpecialty;
		this.primaryPost = primaryPost;
		this.secondaryPost = secondaryPost;
		this.postSalary = postSalary;
		this.gradeSalary = gradeSalary;
		this.marriage = marriage;
		this.political = political;
		this.highestEducation = highestEducation;
		this.highestGrade = highestGrade;
		this.specialtyRank = specialtyRank;
		this.interests = interests;
	}

	/** full constructor */
	public Teachstaffenlargeinfo(String userId, Deptinfo deptinfo, User user,
			String idnumber, String presentWorkTime, String startWorkTime,
			String graduateTime, String lastGraduateSchool, String enterForm,
			String enterSource, String status, String schoolSpecialty,
			String workSpecialty, String primaryPost, String secondaryPost,
			Double postSalary, Double gradeSalary, String marriage,
			String political, String highestEducation, String highestGrade,
			String specialtyRank, String interests, String userType,
			String memo1, String memo2) {
		this.userId = userId;
		this.deptinfo = deptinfo;
		this.user = user;
		this.idnumber = idnumber;
		this.presentWorkTime = presentWorkTime;
		this.startWorkTime = startWorkTime;
		this.graduateTime = graduateTime;
		this.lastGraduateSchool = lastGraduateSchool;
		this.enterForm = enterForm;
		this.enterSource = enterSource;
		this.status = status;
		this.schoolSpecialty = schoolSpecialty;
		this.workSpecialty = workSpecialty;
		this.primaryPost = primaryPost;
		this.secondaryPost = secondaryPost;
		this.postSalary = postSalary;
		this.gradeSalary = gradeSalary;
		this.marriage = marriage;
		this.political = political;
		this.highestEducation = highestEducation;
		this.highestGrade = highestGrade;
		this.specialtyRank = specialtyRank;
		this.interests = interests;
		this.userType = userType;
		this.memo1 = memo1;
		this.memo2 = memo2;
	}

	// Property accessors

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Deptinfo getDeptinfo() {
		return this.deptinfo;
	}

	public void setDeptinfo(Deptinfo deptinfo) {
		this.deptinfo = deptinfo;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getIdnumber() {
		return this.idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}

	public String getPresentWorkTime() {
		return this.presentWorkTime;
	}

	public void setPresentWorkTime(String presentWorkTime) {
		this.presentWorkTime = presentWorkTime;
	}

	public String getStartWorkTime() {
		return this.startWorkTime;
	}

	public void setStartWorkTime(String startWorkTime) {
		this.startWorkTime = startWorkTime;
	}

	public String getGraduateTime() {
		return this.graduateTime;
	}

	public void setGraduateTime(String graduateTime) {
		this.graduateTime = graduateTime;
	}

	public String getLastGraduateSchool() {
		return this.lastGraduateSchool;
	}

	public void setLastGraduateSchool(String lastGraduateSchool) {
		this.lastGraduateSchool = lastGraduateSchool;
	}

	public String getEnterForm() {
		return this.enterForm;
	}

	public void setEnterForm(String enterForm) {
		this.enterForm = enterForm;
	}

	public String getEnterSource() {
		return this.enterSource;
	}

	public void setEnterSource(String enterSource) {
		this.enterSource = enterSource;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSchoolSpecialty() {
		return this.schoolSpecialty;
	}

	public void setSchoolSpecialty(String schoolSpecialty) {
		this.schoolSpecialty = schoolSpecialty;
	}

	public String getWorkSpecialty() {
		return this.workSpecialty;
	}

	public void setWorkSpecialty(String workSpecialty) {
		this.workSpecialty = workSpecialty;
	}

	public String getPrimaryPost() {
		return this.primaryPost;
	}

	public void setPrimaryPost(String primaryPost) {
		this.primaryPost = primaryPost;
	}

	public String getSecondaryPost() {
		return this.secondaryPost;
	}

	public void setSecondaryPost(String secondaryPost) {
		this.secondaryPost = secondaryPost;
	}

	public Double getPostSalary() {
		return this.postSalary;
	}

	public void setPostSalary(Double postSalary) {
		this.postSalary = postSalary;
	}

	public Double getGradeSalary() {
		return this.gradeSalary;
	}

	public void setGradeSalary(Double gradeSalary) {
		this.gradeSalary = gradeSalary;
	}

	public String getMarriage() {
		return this.marriage;
	}

	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}

	public String getPolitical() {
		return this.political;
	}

	public void setPolitical(String political) {
		this.political = political;
	}

	public String getHighestEducation() {
		return this.highestEducation;
	}

	public void setHighestEducation(String highestEducation) {
		this.highestEducation = highestEducation;
	}

	public String getHighestGrade() {
		return this.highestGrade;
	}

	public void setHighestGrade(String highestGrade) {
		this.highestGrade = highestGrade;
	}

	public String getSpecialtyRank() {
		return this.specialtyRank;
	}

	public void setSpecialtyRank(String specialtyRank) {
		this.specialtyRank = specialtyRank;
	}

	public String getInterests() {
		return this.interests;
	}

	public void setInterests(String interests) {
		this.interests = interests;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
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