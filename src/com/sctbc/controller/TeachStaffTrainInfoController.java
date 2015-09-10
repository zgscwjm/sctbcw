package com.sctbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sctbc.constant.Common_Base;
import com.sctbc.constant.Common_TeachStaffTrainInfo;

@Controller
@RequestMapping(Common_Base.COMMON_TEACHSTAFFTRAININFO_MODULE)
public class TeachStaffTrainInfoController {
	private static final String LISTPATH = "/sctbc/Page/teachStaffTrainInfo/list";
	private static final String ADDPATH = "/sctbc/Page/teachStaffTrainInfo/add";
	private static final String EDITPATH = "/sctbc/Page/teachStaffTrainInfo/edit";

	private final boolean result = true;

	@RequestMapping(value = Common_TeachStaffTrainInfo.TeachStaffTrainInfo_GETTEACHSTAFFINFOTRAININFOALL)
	public String getTeachStaffTrainInfoAll() {
		return LISTPATH;
	}

	@ResponseBody
	@RequestMapping(value = Common_TeachStaffTrainInfo.TeachStaffTrainInfo_ADDTEACHSTAFFINFOTRAININFO)
	public String addTeachStaffTrainInfo() {
		return result + "";
	}

	@ResponseBody
	@RequestMapping(value = Common_TeachStaffTrainInfo.TeachStaffTrainInfo_EDITTEACHSTAFFINFOTRAININFO)
	public String editTeachStaffTrainInfo() {
		return result + "";
	}

	@ResponseBody
	@RequestMapping(value = Common_TeachStaffTrainInfo.TeachStaffTrainInfo_DELTEACHSTAFFINFOTRAININFO)
	public String delTeachStaffTrainInfo() {
		return result + "";
	}

	@RequestMapping(value = Common_TeachStaffTrainInfo.TeachStaffTrainInfo_ADDTEACHSTAFFINFOTRAININFOINDEX)
	public String addTeachStaffTrainInfoIndex() {
		return ADDPATH;
	}

	@RequestMapping(value = Common_TeachStaffTrainInfo.TeachStaffTrainInfo_EDITTEACHSTAFFINFOTRAININFOINDEX)
	public String editTeachStaffTrainInfoIndex() {
		return EDITPATH;
	}
}
