package com.sctbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sctbc.constant.Common_Base;
import com.sctbc.constant.Common_TrainType;
import com.sctbc.entity.Procedure;
import com.sctbc.entity.Traintype;
import com.sctbc.server_i.ITrainType;

@Controller
@RequestMapping(Common_Base.COMMON_TRAINTYPE_MODULE)
public class TrainTypeController {
	@Autowired
	ITrainType iTrainType;

	private static final String LISTPATH = "/sctbc/Page/trainType/list";
	private static final String ADDPATH = "/sctbc/Page/trainType/add";
	private static final String EDITPATH = "/sctbc/Page/trainType/edit";

	private final boolean result = true;
	@RequestMapping(value = Common_TrainType.TRAINTYPE_GETTRAINTYPEALL)
	public String getTrainTypeAll(Model model) {
		List<Traintype> traintypeList = iTrainType.getTrainTypeList();
		model.addAttribute("traintypeList", traintypeList);
		return LISTPATH;
	}

	@ResponseBody
	@RequestMapping(value = Common_TrainType.TRAINTYPE_ADDTRAINTYPE)
	public String addTrainType() {
		return result + "";
	}

	@ResponseBody
	@RequestMapping(value = Common_TrainType.TRAINTYPE_EDITTRAINTYPE)
	public String editTrainType() {
		return result + "";
	}

	@ResponseBody
	@RequestMapping(value = Common_TrainType.TRAINTYPE_DELTRAINTYPE)
	public String delTrainType() {
		return result + "";
	}

	@RequestMapping(value = Common_TrainType.TRAINTYPE_ADDtRAINTYPEINDEX)
	public String addTrainTypeIndex(Model model) {
		List<Procedure> procedurelist = null;
		model.addAttribute("procedurelist", procedurelist);
		return ADDPATH;
	}

	@RequestMapping(value = Common_TrainType.TRAINTYPE_EDITTRAINTYPEINDEX)
	public String editTrainTypeIndex() {
		return EDITPATH;
	}

}
