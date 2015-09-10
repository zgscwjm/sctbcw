package com.sctbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sctbc.entity.Syslogin;

@Repository
public class SysloginDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	boolean result = true;

	public List<Syslogin> getSysloginAll() {
		String hql = "from Syslogin";
		return hibernateTemplate.find(hql);
	}
	public boolean insertSyslogin(Syslogin syslogin) {
		try {
			hibernateTemplate.save(syslogin);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}

	public boolean updateSyslogin(Syslogin syslogin) {
		try {
			hibernateTemplate.update(syslogin);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
	public boolean delSyslogin(int sysloginId) {
		Syslogin syslogin = hibernateTemplate.get(Syslogin.class, sysloginId);
		try {
			hibernateTemplate.delete(syslogin);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
}
