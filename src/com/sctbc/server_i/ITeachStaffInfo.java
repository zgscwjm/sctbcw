package com.sctbc.server_i;

import java.util.List;

import com.sctbc.entity.Teachstaffinfo;
import com.sctbc.entity.User;

/**
 * teachStaffInfo教工基本信息表
 * 
 * @author zgscwjm
 * 
 */
public interface ITeachStaffInfo {

	/**
	 * 添加教工基本信息
	 * 
	 * @param memo1
	 *            备用,可以设置为null
	 * @param memo2
	 *            备用,可以设置为null
	 * @param userid
	 *            教工编号
	 * @param name
	 *            教工姓名
	 * @param sex
	 *            性别
	 * @param ethnicity
	 *            名族
	 * @return
	 */
	public Teachstaffinfo addTeachstaffinfo(String memo1,String memo2,User user,String name,String sex,String ethnicity);


	/**
	 * 跟新教工信息
	 * 
	 * @param memo1
	 * @param memo2
	 * @param userid
	 *            主键
	 * @param name
	 * @param sex
	 * @param ethnicity
	 * @return
	 */
	public boolean upTeachstaffinfo(String id,String memo1,String memo2,User user,String name,String sex,String ethnicity);
	public boolean updateTeachstaffinfo(Teachstaffinfo teachstaffinfo);

	/**
	 * 根据userid得到教工基本信息
	 * 
	 * @param userId
	 * @return
	 */
	public Teachstaffinfo getTeachstaffinfo(String userId);


	public Teachstaffinfo getTeachstaffinfoById(int id);
	/**
	 * 得到所有教工基本信息
	 * 
	 * @return
	 */
	public List<Teachstaffinfo> getAllTeachstaffinfo();
	public List<Teachstaffinfo> getTeachstaffinfoByDepId(int depid);
	public List<Teachstaffinfo> getTeachstaffinfoByUserId(String userId);

	public List<Teachstaffinfo> getListFoPageTeachstaffinfo(String EntityName,
			Integer page, String searchname);
	public Integer getCountTeachstaffinfo(String EntityName);
}
