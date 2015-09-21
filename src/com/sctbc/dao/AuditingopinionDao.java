package com.sctbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sctbc.entity.Auditingopinion;
import com.sctbc.entity.Trainapply;
import com.sctbc.entity.User;

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
	
	
	
	/**
	 * 得到验证条目
	 */
	public List<Auditingopinion> getAuditItem(Trainapply trainapply)
	{
		String hqlString="from Auditingopinion where trainapply=? ";
		return hibernateTemplate.find(hqlString,trainapply);
	}

	
	/**
	 * 得到需要user对象审核的条目
	 * @param user
	 * @return
	 */
	public List<Auditingopinion> findNeedReviewByUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("-----------------");
		String hqlString="from Auditingopinion where user=?  and auditingOpinion= '待审核'  or auditingOpinion= '拒绝'  ";
		return hibernateTemplate.find(hqlString,user);
	}
	
	
	
	public Auditingopinion getAuditingopinionById(int id)
	{
		return	hibernateTemplate.get(Auditingopinion.class, id);
	}
	

}
