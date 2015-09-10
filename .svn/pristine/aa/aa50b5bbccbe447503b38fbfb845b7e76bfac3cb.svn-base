package com.sctbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sctbc.constant.Common_Base;
import com.sctbc.constant.Common_TeachStaffEnlargeInfo;
import com.sctbc.entity.Teachstaffenlargeinfo;
import com.sctbc.entity.User;
import com.sctbc.server_i.ITeachStaffEnlargeInfo;
import com.sctbc.server_i.IUser;

@Controller
@RequestMapping(Common_Base.COMMON_TEACHSTAFFENLARGEINFO_MODULE)
public class TeachStaffEnlargeInfoController {
	private static final String LISTPATH = "/sctbc/Page/teachStaffEnlargeInfo/list";
	private static final String ADDPATH = "/sctbc/Page/teachStaffEnlargeInfo/add";
	private static final String EDITPATH = "/sctbc/Page/teachStaffEnlargeInfo/edit";

	private final boolean result = true;

	@Autowired
	ITeachStaffEnlargeInfo iTeachStaffEnlargeInfo;
	@Autowired
	IUser iUser;

	@RequestMapping(value = Common_TeachStaffEnlargeInfo.TEACHSTAFFENLARGEINFO_GETTEACHSTAFFENLARGEINFOALL)
	public String getTeachStaffEnlargeInfoAll(Model model) {
		List<Teachstaffenlargeinfo> teachstaffenlargeinfoList = iTeachStaffEnlargeInfo
				.getTeachstaffenlargeinfoAll();
		model.addAttribute("teachstaffenlargeinfoList",
				teachstaffenlargeinfoList);
		return LISTPATH;
	}

	@ResponseBody
	@RequestMapping(value = Common_TeachStaffEnlargeInfo.TEACHSTAFFENLARGEINFO_EDITTEACHSTAFFENLARGEINFO)
	public String editTeachStaffEnlargeInfo() {
		return result + "";
	}

	@ResponseBody
	@RequestMapping(value = Common_TeachStaffEnlargeInfo.TEACHSTAFFENLARGEINFO_ADDTEACHSTAFFENLARGEINFO)
	public String addTeachStaffEnlargeInfo() {
		return result + "";
	}

	@ResponseBody
	@RequestMapping(value = Common_TeachStaffEnlargeInfo.TEACHSTAFFENLARGEINFO_DELTEACHSTAFFENLARGEINFO)
	public String delTeachStaffEnlargeInfo() {
		return result + "";
	}

	@RequestMapping(value = Common_TeachStaffEnlargeInfo.TEACHSTAFFENLARGEINFO_ADDTEACHSTAFFENLARGEINFOINDEX)
	public String addTeachStaffEnlargeInfoIndex(Model model) {
		List<User> userList = iUser.getUserByNoTeachstaffenlargeinfo();
		model.addAttribute("userList", userList);
		return ADDPATH;
	}

	@RequestMapping(value = Common_TeachStaffEnlargeInfo.TEACHSTAFFENLARGEINFO_EDITTEACHSTAFFENLARGEINFOINDEX)
	public String editTeachStaffEnlargeInfoIndex(Model model, String userId) {
		Teachstaffenlargeinfo teachStaffEnlargeInfo = iTeachStaffEnlargeInfo
				.getTeachstaffenlargeinfoByUserId(userId);
		model.addAttribute("teachStaffEnlargeInfo", teachStaffEnlargeInfo);
		return EDITPATH;
	}

	@RequestMapping(value = Common_TeachStaffEnlargeInfo.TEACHSTAFFENLARGEINFO_GETTEACHSTAFFENLARGEINFOByUserId)
	public String getTeachStaffEnlargeInfoByuserId(Model model, String userId) {
		List<Teachstaffenlargeinfo> teachstaffenlargeinfoList = (List<Teachstaffenlargeinfo>) iTeachStaffEnlargeInfo
				.getTeachstaffenlargeinfoByUserId(userId);
		System.out.println(teachstaffenlargeinfoList == null);
		model.addAttribute("teachstaffenlargeinfoList",
				teachstaffenlargeinfoList);
		return LISTPATH;
	}
}
