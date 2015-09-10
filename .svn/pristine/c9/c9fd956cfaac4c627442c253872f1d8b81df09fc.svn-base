package com.sctbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sctbc.entity.Traintype;

@Repository
public class TraintypeDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	
	boolean result = true;

	
	public Traintype getTraintypeById(int id)
	{
		return hibernateTemplate.get(Traintype.class, id);
	}
	
	public List<Traintype> getTraintypeAll() {
		String hql = "from Traintype";
		return hibernateTemplate.find(hql);
	}

	public boolean insertTraintype(Traintype traintype) {
		try {
			hibernateTemplate.save(traintype);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
	public boolean updatetTraintype(Traintype traintype) {
		try {
			hibernateTemplate.update(traintype);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
	public boolean delTraintype(int traintypeId) {
		Traintype traintype = hibernateTemplate.get(Traintype.class,
				traintypeId);
		try {
			hibernateTemplate.delete(traintype);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
}
