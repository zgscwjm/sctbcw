package com.sctbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sctbc.entity.Auditingopinion;

@Repository
public class AuditingopinionDao {
	@Autowired
	HibernateTemplate hibernateTemplate;
	boolean result=true;
	/**
	 * 获取全部数据
	 * 
	 * @return
	 */
	public List<Auditingopinion> getAuditingopinionAll() {
		String hql = "from Auditingopinion";
		return hibernateTemplate.find(hql);
	}

	/**
	 * 插入数据
	 *
	 * @param auditingopinion
	 *            ：实体
	 * @return
	 */
	public boolean insertAuditingopinion(Auditingopinion auditingopinion) {
		try {
			hibernateTemplate.save(auditingopinion);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}

	/**
	 * 更改数据
	 *
	 * @param auditingopinion
	 *            ：实体
	 * @return
	 */
	public boolean updateAuditingopinion(Auditingopinion auditingopinion) {
		try {
			hibernateTemplate.update(auditingopinion);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}

	/**
	 * 根据ID删除数据
	 * 
	 * @param auditingopinionid
	 *            ：ID
	 * @return
	 */
	public boolean delAuditingopinion(int auditingopinionId) {
		Auditingopinion auditingopinion = hibernateTemplate.get(
				Auditingopinion.class, auditingopinionId);
		try {
			hibernateTemplate.update(auditingopinion);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
}
