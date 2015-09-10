package com.sctbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sctbc.entity.Privilege;

@Repository
public class PrivilegeDao {
	@Autowired
	HibernateTemplate hibernateTemplate;

	boolean result = true;
	public List<Privilege> getPrivilegeAll() {
		String hql = "from Privilege";
		return hibernateTemplate.find(hql);
	}
	public boolean insertPrivilege(Privilege privilege) {
		try {
			hibernateTemplate.save(privilege);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
	public boolean updatePrivilege(Privilege privilege) {
		try {
			hibernateTemplate.update(privilege);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
	public boolean delPrivilege(int privilegeId) {
		Privilege privilege = hibernateTemplate.get(Privilege.class,
				privilegeId);
		try {
			hibernateTemplate.delete(privilege);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
}
