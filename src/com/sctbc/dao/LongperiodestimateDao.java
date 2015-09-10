package com.sctbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sctbc.entity.Longperiodestimate;

@Repository
public class LongperiodestimateDao {
	@Autowired
	HibernateTemplate hibernateTemplate;

	boolean result = true;

	public List<Longperiodestimate> getLongperiodestimateAll() {
		String hql = "from Longperiodestimate";
		return hibernateTemplate.find(hql);
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
