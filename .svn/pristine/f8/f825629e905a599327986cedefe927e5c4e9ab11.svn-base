package com.sctbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sctbc.entity.Dbback;

@Repository
public class DbbackDao {
	@Autowired
	HibernateTemplate hibernateTemplate;
	boolean result = true;

	/**
	 * 获取全部数据
	 * 
	 * @return
	 */
	public List<Dbback> getDbbackAll() {
		String hql = "from Dbback";
		return hibernateTemplate.find(hql);
	}

	/**
	 * 插入数据
	 *
	 * @param dbback
	 * @return
	 */
	public boolean insertDbback(Dbback dbback) {
		try {
			hibernateTemplate.save(dbback);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}

	/**
	 * 更新数据
	 * 
	 * @param dbback
	 * @return
	 */
	public boolean updateDbback(Dbback dbback) {
		try {
			hibernateTemplate.update(dbback);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
	/**
	 * 根据ID删除数据
	 *
	 * @param dbbackid
	 * @return
	 */
	public boolean delDbback(int dbbackId) {
		Dbback dbback = hibernateTemplate.get(Dbback.class, dbbackId);
		try {
			hibernateTemplate.delete(dbback);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
}
