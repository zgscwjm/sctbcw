package com.sctbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sctbc.entity.Procedure;

@Repository
public class ProcedureDao {
	@Autowired
	HibernateTemplate hibernateTemplate;
	public Procedure getProcedureById(int id) {
		String hql = "from Procedure where id=?";
		return (Procedure) hibernateTemplate.find(hql, id).get(0);
	}
}
