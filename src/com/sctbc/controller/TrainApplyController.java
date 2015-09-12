package com.sctbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sctbc.constant.Common_Base;
import com.sctbc.constant.Common_TrainApply;
import com.sctbc.entity.Deptinfo;
import com.sctbc.entity.Trainapply;
import com.sctbc.entity.Traininfo;
import com.sctbc.entity.Traintype;
import com.sctbc.entity.User;
import com.sctbc.server_i.IDeptInfo;
import com.sctbc.server_i.ITrainApply;
import com.sctbc.server_i.ITrainInfo;
import com.sctbc.server_i.ITrainType;
import com.sctbc.server_i.IUser;

@Controller
@RequestMapping(Common_Base.COMMON_TRAINAPPLY_MODULE)
public class TrainApplyController {
	private static final String LISTPATH = "/sctbc/Page/trainApply/list";
	private static final String ADDPATH = "/sctbc/Page/trainApply/add";
	private static final String EDITPATH = "sctbc/Page/trainApply/edit";

	private final boolean result = true;

	@Autowired
	ITrainType iTrainType;
	@Autowired
	IUser iUser;
	@Autowired
	ITrainInfo iTrainInfo;
	@Autowired
	IDeptInfo iDeptInfo;
	@Autowired
	ITrainApply iTrainApply;

	@RequestMapping(value = Common_TrainApply.TRAINAPPLY_GETTRAINAPPLY)
	public String getTrainApplyAll(Model model) {
		List<Trainapply> trainApplyList = iTrainApply.getList();
		model.addAttribute("trainInfoList", trainApplyList);
		return LISTPATH;
	}

	@ResponseBody
	@RequestMapping(value=Common_TrainApply.TRAINAPPLY_ADDTRAINAPPLY)
	public String addTrainApply(Model model, Trainapply trainApply,
			String userId, int projectId) {
		User user = iUser.getById(userId);
		Traininfo trainInfo = iTrainInfo.getTraininfoById(projectId);
		trainApply.setUser(user);
		trainApply.setTraininfo(trainInfo);
		boolean result = iTrainApply.addTrainApply(trainApply);
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
	public String addTrainApplyIndex(Model model, int type) {
		model.addAttribute("type", type);
		List<User> userList = iUser.getList();
		List<Traintype> trainTypeList = iTrainType.getTrainTypeList();
		List<Traininfo> trainInfoList = iTrainInfo.getTraininfoList();
		List<Deptinfo> deptInfoList = iDeptInfo.getList();

		model.addAttribute("deptInfoList", deptInfoList);
		model.addAttribute("trainInfoList", trainInfoList);
		model.addAttribute("trainTypeList", trainTypeList);
		model.addAttribute("userList", userList);
		return ADDPATH;
	}

	@RequestMapping(value = Common_TrainApply.TRAINAPPLY_EDITTRAINAPPLYINDEX)
	public String editTrainApplyIndex() {
		return EDITPATH;
	}
}
