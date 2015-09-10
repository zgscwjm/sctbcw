package com.sctbc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sctbc.constant.Common_Base;
import com.sctbc.constant.Common_TrainInfo;
import com.sctbc.entity.Deptinfo;
import com.sctbc.entity.Traintype;

@Controller
@RequestMapping(Common_Base.COMMON_TRAININFO_MODULE)
public class TrainInfoController {
	private static final String LISTPATH = "/sctbc/Page/trainInfo/list";
	private static final String ADDPATH = "/sctbc/Page/trainInfo/add";
	private static final String EDITPATH = "/sctbc/Page/trainInfo/edit";

	private final boolean result = true;

	@RequestMapping(value = Common_TrainInfo.TRAININFO_GETTRAININFOALL)
	public String getTrainInfoAll() {
		return LISTPATH;
	}

	@ResponseBody
	@RequestMapping(value = Common_TrainInfo.TRAININFO_ADDTEAININFO)
	public String addTrainInfo(){
		return result + "";
	}

	@ResponseBody
	@RequestMapping(value = Common_TrainInfo.TRAININFO_EDITTRAININFO)
	public String editTrainInfo() {
		return result + "";
	}

	@ResponseBody
	@RequestMapping(value = Common_TrainInfo.TRAININFO_DELTRAININFO)
	public String delTrainInfo() {
		return result + "";
	}

	@RequestMapping(value = Common_TrainInfo.TRAININFO_ADDTRAININFOINDEX)
	public String addTrainInfoIndex(Model model) {
		List<Deptinfo> deptInfoList = null;
		List<Traintype> trainTypeList = null;

		model.addAttribute("deptInfolist", deptInfoList);
		model.addAttribute("trainTypelist", trainTypeList);

		return ADDPATH;
	}

	@RequestMapping(value = Common_TrainInfo.TRAININFO_EDITTRAININFOINDEX)
	public String editTrainInfoIndex() {
		return EDITPATH;
	}

}
