package com.sctbc.servers_impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sctbc.dao.ProcedureDao;
import com.sctbc.entity.Procedure;
import com.sctbc.server_i.IProcedure;
@Service
public class ProcedureServer implements IProcedure {

	@Autowired
	ProcedureDao procedureDao;
	@Override
	public Procedure getProcedureById(int id) {
		// TODO Auto-generated method stub
		return procedureDao.getProcedureById(id);
	}

}
