package com.sctbc.server_i;

import java.util.List;

import com.sctbc.entity.Deptinfo;
import com.sctbc.entity.User;

public interface IDeptInfo extends IBaseServer<Deptinfo>{

	/**
	 * 添加部门信息
	 *
	 * @param depName
	 *            部门名称
	 * @param depLeaderId
	 *            领导教工教工号
	 * @return true成功 ,false 失败
	 */
	public boolean addDeptInfo(String deptId,String depName,String depLeaderId);

	/**
	 * 修改部门信息表
	 *
	 * @param id
	 *            部门id
	 * @param depName
	 *            部门名称
	 * @param depLeaderId
	 *            部门领导教工号
	 * @return true成功 ,false 失败
	 */
	public boolean editDeptInfo(int id, String depID, String depName,
			String depLeaderId);

	public boolean checkDeptId(String deptId);
	
	/**
	 * 用领导id得到得到部门实体
	 * @param userId 领导id
	 * @return
	 */
	public List<Deptinfo> getDeptinfoByLeader(String userId);
	
	/**
	 * 检查user是否为部门领导
	 * @param user
	 * @return
	 */
	public boolean isLeader(User user);

}
