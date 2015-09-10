package com.sctbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sctbc.entity.Teachstaffinfo;

@Repository
public class TeachstaffinfoDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	boolean result = false;
	public List<Teachstaffinfo> getTeachstaffinfoAll() {
		String hql = "from Teachstaffinfo";
		return hibernateTemplate.find(hql);
	}
	
	public Teachstaffinfo getTeachstaffinfo(String userId)
	{
		try {
			return hibernateTemplate.get(Teachstaffinfo.class, userId);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}
	
	public Teachstaffinfo insertTeachstaffinfo(Teachstaffinfo teachstaffinfo) {
		try {
			 hibernateTemplate.save(teachstaffinfo);
			return  teachstaffinfo;
		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
			}
	public boolean updateTeachstaffinfo(Teachstaffinfo teachstaffinfo) {
		try {
			hibernateTemplate.update(teachstaffinfo);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
	public boolean delTeachstaffinfo(int teachstaffinfoId) {
		Teachstaffinfo teachstaffinfo = hibernateTemplate.get(
				Teachstaffinfo.class, teachstaffinfoId);
		try {
			hibernateTemplate.delete(teachstaffinfo);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
}
