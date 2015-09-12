package com.sctbc.servers_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sctbc.dao.TrainapplyDao;
import com.sctbc.dao.TraininfoDao;
import com.sctbc.dao.TraintypeDao;
import com.sctbc.entity.Trainapply;
import com.sctbc.entity.Traininfo;
import com.sctbc.entity.Traintype;
import com.sctbc.server_i.ITrainApply;
import com.sctbc.server_i.ITrainInfo;
import com.sctbc.server_i.ITrainType;

@Service
public class TrainServer implements ITrainApply,ITrainType,ITrainInfo{

	@Autowired
	TrainapplyDao trainapplyDao;

	@Autowired
	TraintypeDao traintypeDao;


	@Autowired
	TraininfoDao traininfoDao;
	@Override
	public Trainapply getById(int id) {
		// TODO Auto-generated method stub
		return trainapplyDao.getTrainapplyById(id);
	}

	@Override
	public List<Trainapply> getList() {
		// TODO Auto-generated method stub
		return trainapplyDao.getTrainapplyAll();
	}

	@Override
	public boolean delById(int id) {
		// TODO Auto-generated method stub

		return trainapplyDao.delTrainapply(id);
	}

	@Override
	public boolean upData(Trainapply t) {
		// TODO Auto-generated method stub
		return trainapplyDao.updateTrainapply(t);
	}

	@Override
	public boolean addTrainApply(Trainapply trainapply) {
		// TODO Auto-generated method stub

		return trainapplyDao.insertTrainapply(trainapply);
	}

	@Override
	public List<Traintype> getTrainTypeList() {
		// TODO Auto-generated method stub
		return traintypeDao.getTraintypeAll();
	}

	@Override
	public Traintype getTraintypeById(int id) {
		// TODO Auto-generated method stub
		return traintypeDao.getTraintypeById(id);
	}

	@Override
	public boolean addTraintype(Traintype traintype) {
		// TODO Auto-generated method stub
		return traintypeDao.insertTraintype(traintype);
	}

	@Override
	public boolean delTraintypeById(int id) {
		// TODO Auto-generated method stub
		return traintypeDao.delTraintype(id);
	}

	@Override
	public boolean upTraintypeById(Traintype traintype) {
		// TODO Auto-generated method stub
		return traintypeDao.updatetTraintype(traintype);
	}

	@Override
	public Traininfo getTraininfoById(int id) {
		// TODO Auto-generated method stub
		return traininfoDao.getTraininfoById(id);
	}

	@Override
	public List<Traininfo> getTraininfoList() {
		// TODO Auto-generated method stub
		return traininfoDao.getTraininfoAll();
	}

	@Override
	public boolean addTraininfo(Traininfo trainInfo) {
		// TODO Auto-generated method stub
		return traininfoDao.insertTraininfo(trainInfo);
	}

	@Override
	public boolean delTraininfo(Traininfo traininfo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Trainapply> getListFoPage(String EntityName, Integer nowpage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCount(String EntityName) {
		// TODO Auto-generated method stub
		return null;
	}

}
