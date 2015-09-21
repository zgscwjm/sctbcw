package com.sctbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sctbc.entity.Longperiodestimate;
import com.sctbc.entity.Traininfo;
import com.sctbc.entity.User;

@Repository
public class LongperiodestimateDao {
	@Autowired
	HibernateTemplate hibernateTemplate;

	boolean result = true;

	public List<Longperiodestimate> getLongperiodestimateAll() {
		String hql = "from Longperiodestimate";
		return hibernateTemplate.find(hql);
	}

	public List<Longperiodestimate> getLongPeriodEstimateBytrainUserID(User user) {
		String hql = "from Longperiodestimate where userByTrainUserId=?";
		return hibernateTemplate.find(hql, user);
	}

	public List<Longperiodestimate> getLongPeriodEstimateByUserAndProject(
			User user, Traininfo traininfo) {
		String hql="from Longperiodestimate where userByEvaluateUserId=? and traininfo=?";
		return hibernateTemplate.find(hql, user, traininfo);
	}
	public Longperiodestimate getLongperiodestimateById(int id) {
		Longperiodestimate longperiodestimate = hibernateTemplate.get(
				Longperiodestimate.class, id);
		return longperiodestimate;
	}
	public boolean insertLongperiodestimate(
			Longperiodestimate longperiodestimate) {
		try {
			hibernateTemplate.save(longperiodestimate);
		} catch (Exception e) {
			result = true;
		}
		return result;
	}
	public boolean update(Longperiodestimate longperiodestimate) {
		try {
			hibernateTemplate.update(longperiodestimate);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
	public boolean delLongperiodestimate(int longperiodestimateId){
		Longperiodestimate longperiodestimate = hibernateTemplate.get(
				Longperiodestimate.class, longperiodestimateId);
		try{
			hibernateTemplate.delete(longperiodestimate);
		}catch(Exception e){
			result = false;
		}
		return result;
	}
}
