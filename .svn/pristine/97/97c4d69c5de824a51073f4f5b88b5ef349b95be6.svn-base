package com.sctbc.servers_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sctbc.dao.LongperiodestimateDao;
import com.sctbc.dao.UserDao;
import com.sctbc.entity.Longperiodestimate;
import com.sctbc.entity.Traininfo;
import com.sctbc.entity.User;
import com.sctbc.server_i.ILongperiodestimate;

@Service
public class LongperiodestimateServer implements ILongperiodestimate {

	@Autowired
	LongperiodestimateDao longperiodestimateDao;
	@Autowired
	UserDao userDao;

	@Override
	public Longperiodestimate getById(int id) {
		// TODO Auto-generated method stub
		return longperiodestimateDao.getLongperiodestimateById(id);
	}

	@Override
	public List<Longperiodestimate> getList() {
		// TODO Auto-generated method stub
		return longperiodestimateDao.getLongperiodestimateAll();
	}

	@Override
	public boolean delById(int id) {
		// TODO Auto-generated method stub
		return longperiodestimateDao.delLongperiodestimate(id);
	}

	@Override
	public boolean upData(Longperiodestimate t) {
		// TODO Auto-generated method stub
		return longperiodestimateDao.update(t);
	}

	@Override
	public List<Longperiodestimate> getListFoPage(String EntityName,
			Integer nowpage, String searchname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCount(String EntityName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addLongperiodestimate(
Longperiodestimate longperiodestimate) {
		// TODO Auto-generated method stub
		return longperiodestimateDao
				.insertLongperiodestimate(longperiodestimate);
	}

	@Override
	public List<Longperiodestimate> getLongPeriodEstimateBytrainUserID(
			String userId) {
		// TODO Auto-generated method stub
		User user = userDao.getUserById(userId);
		return longperiodestimateDao.getLongPeriodEstimateBytrainUserID(user);
	}

	@Override
	public List<Longperiodestimate> getLongPeriodEstimateByUserAndProject(
			User user, Traininfo traininfo) {
		// TODO Auto-generated method stub
		return longperiodestimateDao.getLongPeriodEstimateByUserAndProject(
				user, traininfo);
	}

}
