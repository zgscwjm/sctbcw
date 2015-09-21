package com.sctbc.servers_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sctbc.dao.PrivilegeDao;
import com.sctbc.entity.Privilege;
import com.sctbc.server_i.IBaseServer;

@Service
public class PrivilegeServer implements IBaseServer<Privilege> {

	@Autowired
	public PrivilegeDao privilegeDao;

	public List<Privilege> getAllPrivilge()
	{
		return privilegeDao.getPrivilegeAll();
	}

	@Override
	public Privilege getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Privilege> getList() {
		// TODO Auto-generated method stub
		return privilegeDao.getPrivilegeAll();
	}

	@Override
	public boolean delById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean upData(Privilege t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Privilege> getListFoPage(String EntityName, Integer nowpage,
			String searchname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCount(String EntityName) {
		// TODO Auto-generated method stub
		return null;
	}

}
