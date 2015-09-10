package com.sctbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sctbc.constant.Common_Base;
import com.sctbc.constant.Common_TeachStaffInfo;
import com.sctbc.entity.Teachstaffinfo;
import com.sctbc.server_i.ITeachStaffInfo;

@Controller
@RequestMapping(Common_Base.COMMON_TEACHSTAFFINFO_MODULE)
public class TeachStaffInfoController {
	private static final String LISTPATH = "/sctbc/Page/teachStaffInfo/list";
	private static final String ADDPATH = "/sctbc/Page/teachStaffInfo/add";
	private static final String EDITPATH = "/sctbc/Page/teachStaffInfo/edit";
	private final boolean result = true;

	@Autowired
	ITeachStaffInfo iTeachStaffInfo;
	@RequestMapping(value = Common_TeachStaffInfo.TEACHSTAFFINFO_GETTEACHSTAFFINFOALL)
	public String getTeachStaffInfoAll(Model model) {
		List<Teachstaffinfo> teachstaffInfo = iTeachStaffInfo
				.getAllTeachstaffinfo();
		model.addAttribute("teachStaffInfoList", teachstaffInfo);
		return LISTPATH;
	}

	@ResponseBody
	@RequestMapping(value = Common_TeachStaffInfo.TEACHSTAFFINFO_ADDTEACHSTAFFINFO)
	public String addTeachStaffInfoAll() {
		return result + "";
	}

	@ResponseBody
	@RequestMapping(value = Common_TeachStaffInfo.TEACHSTAFFINFO_EDITTEACHSTAFFINFO)
	public String editTeachStaffInfo() {
		return result + "";
	}

	@ResponseBody
	@RequestMapping(value = Common_TeachStaffInfo.TECHSTAFFINFO_DELTEACHSTAFFINFO)
	public String delTeachStaffInfo() {
		return result + "";
	}

	@RequestMapping(value = Common_TeachStaffInfo.TEACHSTAFFINFO_ADDTEACHSTAFFINFOINDEX)
	public String addTeachStaffInfoIndex(){
		return ADDPATH;
	}

	@RequestMapping(value = Common_TeachStaffInfo.TEACHSTAFFINFO_EDITTEACHSTAFFINFOINDEX)
	public String editTeachStaffInfoIndex(Model model, int id) {
		return EDITPATH;
	}

	public String getTeachStaffInfoByUserId(Model model) {
		List<Teachstaffinfo> teachstaffInfo = null;
		model.addAttribute("teachStaffInfoList", teachstaffInfo);
		return LISTPATH;
	}
}
