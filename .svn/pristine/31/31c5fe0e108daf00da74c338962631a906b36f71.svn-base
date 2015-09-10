package com.sctbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sctbc.entity.Shortperiodestimate;

@Repository
public class ShortperiodestimateDao {
	@Autowired
	HibernateTemplate hibernateTemplate;

	boolean result = true;

	public List<Shortperiodestimate> getShortperiodestimateAll() {
		String hql = "from Shortperiodestimate";
		return hibernateTemplate.find(hql);
	}
	public boolean insertShortperiodestimate(Shortperiodestimate shortperiodestimate){
		try{
			hibernateTemplate.save(shortperiodestimate);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
	public boolean updateShortperiodestimate(
			Shortperiodestimate shortperiodestimate) {
		try {
			hibernateTemplate.update(shortperiodestimate);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
	public boolean delShortperiodestimate(int shortperiodestimateId) {
		Shortperiodestimate shortperiodestimate = hibernateTemplate.get(
				Shortperiodestimate.class, shortperiodestimateId);
		try {
			hibernateTemplate.delete(shortperiodestimate);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
}
