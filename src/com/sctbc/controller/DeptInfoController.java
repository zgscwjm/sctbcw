package com.sctbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sctbc.constant.Common_Base;
import com.sctbc.constant.Common_DeptInfo;
import com.sctbc.entity.Deptinfo;
import com.sctbc.entity.Teachstaffenlargeinfo;
import com.sctbc.server_i.IDeptInfo;

@Controller
@RequestMapping(Common_Base.COMMON_DEPTINFO_MODULE)
public class DeptInfoController {
	private static final String LISTPATH = "/sctbc/Page/deptInfo/list";
	private static final String ADDPATH = "/sctbc/Page/deptInfo/add";
	private static final String EDITPATH = "/sctbc/Page/deptInfo/edit";

	private static final String ENTITYNAME = "Deptinfo";
	private final boolean result = true;


	@Autowired
	IDeptInfo iDeptInfo;

	//getAll
	@RequestMapping(value = Common_DeptInfo.DEPTINFO_GETDEPTINFOALL)
	public String getDeptInfoAll(Model model, Integer page, String searchname) {
		int count = iDeptInfo.getCount(ENTITYNAME);
		if (page == null || page.SIZE < 1) {
			page = 1;
		} else if (page > count / 6) {
			page = count / 6 + 1;
		}
		List<Deptinfo> deptInfoList = iDeptInfo.getListFoPage(ENTITYNAME, page,
				searchname);
		model.addAttribute("nowpage", page);
		model.addAttribute("count", count);
		model.addAttribute("deptInfoList", deptInfoList);
		return LISTPATH;
	}

	//add
	@ResponseBody
	@RequestMapping(value = Common_DeptInfo.DEPTINFO_ADDDEPTINFO, method = RequestMethod.POST)
	public String addDeptInfo(Deptinfo deptInfo) {
		return iDeptInfo.addDeptInfo(deptInfo.getDepId(),
				deptInfo.getDepName(),
				deptInfo.getDepLeaderId())
				+ "";
	}

	// edit
	@ResponseBody
	@RequestMapping(value = Common_DeptInfo.DEPTINFO_EDITDEPTINFO)
	public String editDeptInfo(Deptinfo deptInfo) {

		return iDeptInfo.editDeptInfo(deptInfo.getId(), deptInfo.getDepId(),
				deptInfo.getDepName(),
				deptInfo.getDepLeaderId()) + "";
	}

	// del
	@ResponseBody
	@RequestMapping(value = Common_DeptInfo.DEPTINFO_DELDEPTINFO)
	public String delDeptInfo(Model model, int id) {

		return iDeptInfo.delById(id) + "";
	}

	@RequestMapping(value = Common_DeptInfo.DEPTINFO_ADDDEPTINFOINDEX)
	public String addDeptInfoIndex() {

		return ADDPATH;
	}

	@RequestMapping(value = Common_DeptInfo.DEPTINFO_EDITDEPTINFOINDEX)
	public String editDeptInfoIndex(Model model, int id) {
		Deptinfo deptinfo = iDeptInfo.getById(id);
		Teachstaffenlargeinfo teachStaffEnlargeInfolist = null;// 获取部门编号为id的教师
		model.addAttribute("deptinfo", deptinfo);
		model.addAttribute("teachStaffEnlargeInfolist",
				teachStaffEnlargeInfolist);
		return EDITPATH;
	}

}
