package com.sctbc.servers_impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sctbc.dao.PrivilegeDao;
import com.sctbc.dao.RolesPrivilegeDao;
import com.sctbc.entity.Privilege;
import com.sctbc.entity.Roles;
import com.sctbc.entity.RolesPrivilege;

@Service
public class RolesPrivilegeServer {

	@Autowired
	RolesPrivilegeDao rolesPrivilegeDao;

	@Autowired
	PrivilegeDao privilegeDao;

	public boolean upRolesPrivilege(int[] privilegeID, Roles reoles) {
		boolean result =true;
		try {
			rolesPrivilegeDao.delRolesPrivilegeByRolesId(reoles);

			for (int i = 0; i < privilegeID.length; i++) {
				System.out.println(privilegeID[i]);
				RolesPrivilege rolesPrivilege = new RolesPrivilege();
				Privilege privilege = privilegeDao
						.getPrivilegeById(privilegeID[i]);
				rolesPrivilege.setRoles(reoles);
				rolesPrivilege.setPrivilege(privilege);
				rolesPrivilegeDao.insertRolesPrivilege(rolesPrivilege);
			}
		}catch(Exception e){
			result = false;
		}

		return result;
	}
}
