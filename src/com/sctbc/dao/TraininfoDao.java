package com.sctbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sctbc.entity.Traininfo;

@Repository
public class TraininfoDao extends BaseDao {
	@Autowired
	HibernateTemplate hibernateTemplate;

	boolean result = true;

	public List<Traininfo> getTraininfoAll() {
		String hql = "from Traininfo";
		return hibernateTemplate.find(hql);
	}

	public List<Traininfo> getTraininfoByUserTrue(String userId) {
		String hql = "from Traininfo where Traininfo.trainapplies.finalCheck='通过' and Traininfo.trainapplies.user.userId="
				+ userId
				+ " and Traininfo.shortperiodestimates.userByTrainUserId.userId!="
				+ userId
				+ "and Traininfo.shortperiodestimates.traininfo.projectId!=Traininfo.projectId";
		return hibernateTemplate.find(hql);
	}

	public Traininfo getTraininfoById(int id)
	{
		try {
		return	hibernateTemplate.get(Traininfo.class, id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

	}

	public boolean insertTraininfo(Traininfo traininfo){
		try{
			hibernateTemplate.save(traininfo);
		} catch (Exception e) {
			e.printStackTrace();
			result = false;
		}
		return result;
	}

	public boolean updateTraininfo(Traininfo traininfo) {
		try {
			hibernateTemplate.update(traininfo);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}

	public boolean delTraininfo(int traininfoId) {
		Traininfo traininfo = hibernateTemplate.get(Traininfo.class,
				traininfoId);
		try {
			hibernateTemplate.save(traininfo);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}

}
