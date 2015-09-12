package com.sctbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sctbc.entity.Teachstaffenlargeinfo;

@Repository
public class TeachstaffenlargeinfoDao {
	@Autowired
	HibernateTemplate hibernateTemplate;

	boolean result = true;

	public List<Teachstaffenlargeinfo> getTeachstaffenlargeinfoAll() {
		String hql = "from Teachstaffenlargeinfo";
		return hibernateTemplate.find(hql);
	}
	public Teachstaffenlargeinfo insertTeachstaffenlargeinfo(
			Teachstaffenlargeinfo teachstaffenlargeinfo) {
		try {
		return	(Teachstaffenlargeinfo) hibernateTemplate.save(teachstaffenlargeinfo);
		} catch (Exception e) {
			return null;
		}

	}
	public boolean insertTeachstaffenlargeinfo1(
			Teachstaffenlargeinfo teachstaffenlargeinfo) {
		try {
			hibernateTemplate.save(teachstaffenlargeinfo);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
	public boolean updateTeachstaffenlargeinfo(
			Teachstaffenlargeinfo teachstaffenlargeinfo) {
		try {
			hibernateTemplate.update(teachstaffenlargeinfo);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
	public boolean delTeachstaffenlargeinfo(int teachstaffenlargeinfoId) {
		Teachstaffenlargeinfo teachstaffenlargeinfo = hibernateTemplate.get(
				Teachstaffenlargeinfo.class, teachstaffenlargeinfoId);
		try {
			hibernateTemplate.delete(teachstaffenlargeinfo);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}

	public Teachstaffenlargeinfo getTeachstaffenlargeinfoByUserId(String userId) {
		Teachstaffenlargeinfo teachstaffenlargeinfo = hibernateTemplate.get(
				Teachstaffenlargeinfo.class, userId);
		return teachstaffenlargeinfo;
	}
}
