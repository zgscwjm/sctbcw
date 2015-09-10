package com.sctbc.server_i;

import com.sctbc.entity.Roles;
import com.sctbc.entity.RolesPrivilege;

public interface IRole extends IBaseServer<Roles>{
	
	/**
	 * 添加角色
	 * @param memo1
	 * @param memo2
	 * @param roleName
	 * @param rolesPrivileges
	 * @return
	 */
	public boolean addRole(String memo1,String memo2,String roleName,RolesPrivilege rolesPrivileges);

	/**
	 * 修改角色
	 * @param memo1
	 * @param memo2
	 * @param roleName
	 * @param rolesPrivileges
	 * @return
	 */
	public boolean editRole(String memo1,String memo2,String roleName,RolesPrivilege rolesPrivileges,int roleID);
	
	
	
	public boolean setRolesprivilege(String demo1,String demo2);
	public boolean upRolesprivilege();
}
