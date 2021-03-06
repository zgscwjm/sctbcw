package com.sctbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sctbc.entity.Roles;
import com.sctbc.entity.RolesPrivilege;

@Repository
public class RolesPrivilegeDao {
	@Autowired
	HibernateTemplate hibernateTemplate;

	boolean result = true;
	public List<RolesPrivilege> getRolesPrivilegeAll() {
		String hql = "from RolesPrivilege";
		return hibernateTemplate.find(hql);
	}
	public boolean insertRolesPrivilege(RolesPrivilege rolesPrivilege) {
		System.out.println(rolesPrivilege.getPrivilege().getPrivilegeId());
		try {
			hibernateTemplate.save(rolesPrivilege);
		} catch (Exception e) {
			System.out.println(e);
			result = false;
		}
		return result;
	}
	public boolean updateRolesPrivilege(RolesPrivilege rolesPrivilege) {
		try {
			hibernateTemplate.update(rolesPrivilege);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
	public boolean delRolesPrivilege(int rolesPrivilegeId) {
		RolesPrivilege rolesPrivilege = hibernateTemplate.get(
				RolesPrivilege.class, rolesPrivilegeId);
		try {
			hibernateTemplate.delete(rolesPrivilege);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
	public boolean delRolesPrivilegeByRolesId(Roles roles) {
		String hql = "delete RolesPrivilege where roles=? ";
		try{
		hibernateTemplate.bulkUpdate(hql, roles);
		} catch (Exception e) {
			System.out.println(e);
		}

		return true;
	}
}
