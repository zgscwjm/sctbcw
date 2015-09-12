package com.sctbc.servers_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sctbc.dao.DeptinfoDao;
import com.sctbc.entity.Deptinfo;
import com.sctbc.server_i.IDeptInfo;

@Service
public class DeptInfoServer implements IDeptInfo {

	@Autowired
	DeptinfoDao deptinfoDao;

	@Override
	public Deptinfo getById(int id) {
		// TODO Auto-generated method stub
		return deptinfoDao.getDeptinfo(id);
	}

	@Override
	public List<Deptinfo> getListFoPage(String EntityName, Integer page) {
		// TODO Auto-generated method stub
		if (page == null || page <= 1) {
			page = 0;
		}
		return deptinfoDao.getListFoPage(EntityName, page);
	}

	@Override
	public boolean delById(int id) {
		// TODO Auto-generated method stub
		return deptinfoDao.delDeptinfo(id);
	}

	@Override
	public boolean upData(Deptinfo t) {
		// TODO Auto-generated method stub
		return deptinfoDao.updateDeptinfo(t);
	}

	@Override
	public boolean addDeptInfo(String deptid, String depName, String depLeaderId) {
		// TODO Auto-generated method stub
		Deptinfo deptinfo = new Deptinfo();
		deptinfo.setDepId(deptid);
		deptinfo.setDepName(depName);
		deptinfo.setDepLeaderId(depLeaderId);
		return deptinfoDao.insertDeptinfo(deptinfo);
	}

	@Override
	public boolean editDeptInfo(int id, String depID, String depName,
			String depLeaderId) {
		// TODO Auto-generated method stub
		Deptinfo deptinfo = this.getById(Integer.valueOf(id));
		deptinfo.setDepId(depID);
		deptinfo.setDepName(depName);
		deptinfo.setDepLeaderId(depLeaderId);
		return this.upData(deptinfo);
	}

	@Override
	public boolean checkDeptId(String deptId) {
		// TODO Auto-generated method stub
		if (deptinfoDao.getDeptinfoByDeptid(deptId).size() > 0)
			return true;
		else
			return false;
	}

	@Override
	public List<Deptinfo> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCount(String EntityName) {
		// TODO Auto-generated method stub
		return deptinfoDao.getCount(EntityName);
	}

}
