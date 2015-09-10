package com.sctbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sctbc.constant.Common_Base;
import com.sctbc.constant.Common_TrainApply;

@Controller
@RequestMapping(Common_Base.COMMON_TRAINAPPLY_MODULE)
public class TrainApplyController {
	private static final String LISTPATH = "/sctbc/Page/trainApply/list";
	private static final String ADDPATH = "/sctbc/Page/trainApply/add";
	private static final String EDITPATH = "sctbc/Page/trainApply/edit";

	private final boolean result = true;

	@RequestMapping(value = Common_TrainApply.TRAINAPPLY_GETTRAINAPPLY)
	public String getTrainApplyAll() {
		return LISTPATH;
	}

	@ResponseBody
	@RequestMapping(value=Common_TrainApply.TRAINAPPLY_ADDTRAINAPPLY)
	public String addTrainApply() {
		return result + "";
	}

	@ResponseBody
	@RequestMapping(value=Common_TrainApply.TRAINAPPLY_EDITTRAINAPPLY)
	public String editTrainApply(){
		return result+"";
	}

	@ResponseBody
	@RequestMapping(value=Common_TrainApply.TRAINAPPLY_DELTRAINAPPLY)
	public String delTrainApply(){
		return result+"";
	}

	@RequestMapping(value=Common_TrainApply.TRAINAPPLY_ADDTRAINAPPLYINDEX)
	public String addTrainApplyIndex(){

		return ADDPATH;
	}

	@RequestMapping(value = Common_TrainApply.TRAINAPPLY_EDITTRAINAPPLYINDEX)
	public String editTrainApplyIndex() {
		return EDITPATH;
	}
}
