package com.sctbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sctbc.entity.Deptinfo;

@Repository
public class DeptinfoDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	boolean result = true;

	/**
	 * 获取全部数据
	 *
	 * @return
	 */
	public List<Deptinfo> getDeptinfoAll() {
		String hql = "from Deptinfo";
		return hibernateTemplate.find(hql);
	}
	/**
	 * 插入数据
	 * 
	 * @param deptinfo
	 * @return
	 */
	public boolean insertDeptinfo(Deptinfo deptinfo) {
		try {
			hibernateTemplate.save(deptinfo);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
	/**
	 * 更新数据
	 *
	 * @param deptinfo
	 * @return
	 */
	public boolean updateDeptinfo(Deptinfo deptinfo) {
		try {
			hibernateTemplate.update(deptinfo);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
	/**
	 * 根据ID删除数据
	 * 
	 * @param deptinfoId
	 * @return
	 */
	public boolean delDeptinfo(int deptinfoId) {
		Deptinfo deptinfo = hibernateTemplate.get(Deptinfo.class, deptinfoId);
		try {
			hibernateTemplate.delete(deptinfo);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
	
	
	
	public Deptinfo getDeptinfo(int id)
	{
		return hibernateTemplate.get(Deptinfo.class, id);
	}
	
	
	public List<Deptinfo> getDeptinfoByDeptid(String deptId)
	{
		String hql="from Deptinfo where deptId=?";
		return hibernateTemplate.find(hql, deptId);
	}
}
