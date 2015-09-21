package com.sctbc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sctbc.constant.Common_Base;
import com.sctbc.constant.Common_Procedure;
import com.sctbc.entity.Deptinfo;
import com.sctbc.entity.Procedure;
import com.sctbc.server_i.IDeptInfo;
import com.sctbc.server_i.IProcedure;

@Controller
@RequestMapping(Common_Base.COMMON_PROCEDURE_MODULE)
public class ProcedureController {
	public static final String LISTPATH = "/sctbc/Page/procedure/list";
	public static final String ADDPATH = "/sctbc/Page/procedure/add";
	public static final String SEEPATH = "/sctbc/Page/procedure/one";
	private static final String ENTITYNAME = "Procedure";

	@Autowired
	IDeptInfo iDeptInfo;

	@Autowired
	IProcedure iProcedure;

	@RequestMapping(value = Common_Procedure.PROCEDURE_GETPROCEDUREALL)
	public String getProcedureAll(Model model, Integer page, String searchname) {

		int count = iProcedure.getCountProcedure(ENTITYNAME);
		if (page == null || page.SIZE < 1) {
			page = 1;
		} else if (page > count / 6) {
			page = count / 6 + 1;
		}
		List<Procedure> procedureList = iProcedure.getListFoPageProcedure(
				ENTITYNAME, page, searchname);
		model.addAttribute("nowpage", page);
		model.addAttribute("count", count);

		model.addAttribute("procedureList", procedureList);
		return LISTPATH;
	}
	@RequestMapping(value = Common_Procedure.PROCEDURE_ADDPROCEDUREINDEX)
	public String addProcedureIndex(Model model) {
		List<Deptinfo> deptInfoList = iDeptInfo.getList();
		model.addAttribute("deptInfoList", deptInfoList);
		return ADDPATH;
	}

	@ResponseBody
	@RequestMapping(value = Common_Procedure.PROCEDURE_ADDPROCEDURE)
	public String addProcedure(
			@RequestParam(value = "depIdArray[]") String[] depIdArray,
			Model model,
			@RequestParam(value = "depNameArray[]") String[] depNameArray,
			String procedureName) {
		Map<String, String> map =null;
		ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();



		for (int i = 0; i < depIdArray.length; i++) {
			map= new HashMap<String, String>();
			map.put("value", depIdArray[i].toString());
			map.put("name", depNameArray[i].toString());
			list.add(map);
		}
		boolean result = iProcedure.addProced(list, procedureName);
		return result + "";
	}


	@RequestMapping(value = Common_Procedure.PROCEDURE_SEEPROCEDUREBYONE)
	public String SeeProcedureByOne(Model model, int id) {
		  ArrayList<Map<String, String>> procedureList = iProcedure.getProcedItemByFirstId(id);
		procedureList.remove(procedureList.size() - 1);
		model.addAttribute("Oneprocedure", procedureList);
		return SEEPATH;
	}
}
