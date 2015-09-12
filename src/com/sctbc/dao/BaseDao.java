package com.sctbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDao<T> extends UtilDao {
	@Autowired
	HibernateTemplate hibernateTemplate;

	public int getCount(String EntityName) {
		final String hql = "select count(*) from " + EntityName;
		Integer count = Integer.parseInt(hibernateTemplate.find(hql).get(0)
				.toString());
		return count.intValue();
	}
	public List<T> getListFoPage(String EntityName, Integer nowpage) {
		String hql = "from " + EntityName;
		return getListForPage(hql, nowpage * 6 - 6, 6);
	}
}
