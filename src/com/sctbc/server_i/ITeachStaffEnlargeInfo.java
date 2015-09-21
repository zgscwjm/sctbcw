package com.sctbc.server_i;

import java.util.List;

import com.sctbc.entity.Deptinfo;
import com.sctbc.entity.Teachstaffenlargeinfo;
import com.sctbc.entity.User;


/**
 * 教职工扩展信息表
 * 
 * @author zgscwjm
 * 
 */
public interface ITeachStaffEnlargeInfo {

	/**
	 *
	 * @param userId
	 *            教工编号,不能为空
	 * @param deptinfo
	 *            部门实例
	 * @param idnumber
	 *            身份证号,不能为空
	 * @param userType
	 *            教工类型,后面的参数都可以为空
	 * @param enterForm
	 * @param enterSource
	 * @param gradeSalary
	 * @param graduateTime
	 * @param highestEducation
	 * @param highestGrade
	 * @param interests
	 * @param lastGraduateSchool
	 * @param marriage
	 * @param political
	 * @param presentWorkTime
	 * @param primaryPost
	 * @param schoolSpecialty
	 * @param secondaryPost
	 * @param startWorkTime
	 * @param status
	 * @param workSpecialty
	 * @return
	 */
	public Teachstaffenlargeinfo addTeachstaffenlargeinfo(User user,
			Deptinfo deptinfo,String idnumber,String userType, String enterForm,
			String enterSource, Double gradeSalary, String graduateTime,
			String highestEducation, String highestGrade,
			String interests, String lastGraduateSchool, String marriage,
			String political, String presentWorkTime, String primaryPost,
			String schoolSpecialty, String secondaryPost,
			String startWorkTime, String status, String workSpecialty);


	public boolean upTeachstaffenlargeinfo(User user,
			String depId,String idnumber,String userType, String enterForm,
			String enterSource, Double gradeSalary, String graduateTime,
			String highestEducation, String highestGrade,
			String interests, String lastGraduateSchool, String marriage,
			String political, String presentWorkTime, String primaryPost,
			String schoolSpecialty, String secondaryPost,
			String startWorkTime, String status, String workSpecialty);


	public Teachstaffenlargeinfo addTeachstaffenlargeinfo(User user,Teachstaffenlargeinfo teachstaffenlargeinfo);
	public boolean addTeachstaffenlargeinfo(
			Teachstaffenlargeinfo teachstaffenlargeinfo);

	public boolean upTeachstaffenlargeinfo(Teachstaffenlargeinfo teachstaffenlargeinfo);

	public Teachstaffenlargeinfo getTeachstaffenlargeinfoByUserId(String userId);
	public List<Teachstaffenlargeinfo> getTeachstaffenlargeinfoByDeptinfoId(
			int deptinfo);
	public List<Teachstaffenlargeinfo> getTeachstaffenlargeinfoAll();

	public List<Teachstaffenlargeinfo> getListFoPageTeachstaffenlargeinfo(
			String EntityName, Integer page, String searchname);
	public Integer getCountTeachstaffenlargeinfo(String EntityName);

}
