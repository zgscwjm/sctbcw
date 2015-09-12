package com.sctbc.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UtilDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	/**
	 * 使用hql 语句进行操作
	 *
	 * @param hql
	 * @param offset
	 * @param length
	 * @return List
	 */
	public List getListForPage(final String hql, final int offset,
			final int length) {
		List list = hibernateTemplate.executeFind(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery(hql);
				query.setFirstResult(offset);
				query.setMaxResults(length);
				List list = query.list();
				return list;
			}
		});
		return list;
	}
	/**
	 * 使用criterion进行操作
	 *
	 * @param arg
	 * @param criterions
	 * @param offset
	 * @param length
	 * @return List
	 */
	protected List getListForPage(final Class arg,
			final Criterion[] criterions, final int offset, final int length) {
		List list = hibernateTemplate.executeFind(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Criteria criteria = session.createCriteria(arg);
				// 循环遍历添加约束条件
				for (int i = 0; i < criterions.length; i++) {
					criteria.add(criterions[i]);
				}
				criteria.setFirstResult(offset);
				criteria.setMaxResults(length);
				return criteria.list();
			}
		});
		return list;
	}

	/*
	 * // 获得集合的总数（聚合查询） public Integer getListCount(String entityname) { final
	 * String hql = "select count(*) from " + entityname; Integer count =
	 * (Integer) hibernateTemplate.find(hql).listIterator() .next(); return
	 * count.intValue(); }
	 */
}
