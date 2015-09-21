package com.sctbc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sctbc.constant.Common_Base;
import com.sctbc.constant.Common_TrainApply;
import com.sctbc.entity.Deptinfo;
import com.sctbc.entity.Teachstaffenlargeinfo;
import com.sctbc.entity.Teachstaffinfo;
import com.sctbc.entity.Trainapply;
import com.sctbc.entity.Traininfo;
import com.sctbc.entity.User;
import com.sctbc.server_i.IDeptInfo;
import com.sctbc.server_i.ITeachStaffEnlargeInfo;
import com.sctbc.server_i.ITeachStaffInfo;
import com.sctbc.server_i.ITrainApply;
import com.sctbc.server_i.ITrainInfo;
import com.sctbc.server_i.ITrainType;
import com.sctbc.server_i.IUser;

@Controller
@RequestMapping(Common_Base.COMMON_TRAINAPPLY_MODULE)
public class TrainApplyController {
	private static final String LISTPATH = "/sctbc/Page/trainApply/list";
	private static final String ADDPATH = "/sctbc/Page/trainApply/add";
	private static final String EDITPATH = "/sctbc/Page/trainApply/edit";

	public boolean result = true;

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
	@Autowired
	ITeachStaffInfo iTeachStaffInfo;
	@Autowired
	ITeachStaffEnlargeInfo iTeachStaffEnlargeInfo;

	@RequestMapping(value = Common_TrainApply.TRAINAPPLY_GETTRAINAPPLY)
	public String getTrainApplyAll(Model model, HttpSession session) {

		User user = (User) session.getAttribute("USER");
		List<Trainapply> trainApplyList = iTrainApply.getTrainListByUser(user);
		model.addAttribute("trainInfoList", trainApplyList);
		return LISTPATH;
	}

	@ResponseBody
	@RequestMapping(value = Common_TrainApply.TRAINAPPLY_ADDTRAINAPPLY)
	public String addTrainApply(Model model, Trainapply trainApply,
			String userId, int projectId) {
		User user = iUser.getById(userId);
		Traininfo trainInfo = iTrainInfo.getTraininfoById(projectId);
		
		
		if (iTrainInfo.checkTrainInfoByTime(projectId)) {
			return "timeout";
		}
		if (iTrainApply.getTrainapplyBytraininfoAndUser(trainInfo, user).size() > 0) {
			result = false;
			System.out.println("result:" + result);
		} else {
			trainApply.setUser(user);
			trainApply.setTraininfo(trainInfo);
			result = iTrainApply.addTrainApply(trainApply);

		}
		return result + "";
	}

	@ResponseBody
	@RequestMapping(value = Common_TrainApply.TRAINAPPLY_EDITTRAINAPPLY)
	public String editTrainApply() {
		return result + "";
	}

	@ResponseBody
	@RequestMapping(value = Common_TrainApply.TRAINAPPLY_DELTRAINAPPLY)
	public String delTrainApply() {
		return result + "";
	}

	@RequestMapping(value = Common_TrainApply.TRAINAPPLY_ADDTRAINAPPLYINDEX)
	public String addTrainApplyIndex(Model model, HttpSession session,
			int type, int projectid) {

		User loginuser = (User) session.getAttribute("USER");
		System.out.println(loginuser.getUserId());
		List<Deptinfo> deptInfoList = iDeptInfo.getDeptinfoByLeader(loginuser
				.getUserId());
		List<Teachstaffinfo> TeachstaffinfoList = null;
		Teachstaffenlargeinfo TeachSEI = iTeachStaffEnlargeInfo
				.getTeachstaffenlargeinfoByUserId(loginuser.getUserId());
		if (deptInfoList.size() == 0) {
			TeachstaffinfoList = iTeachStaffInfo
					.getTeachstaffinfoByUserId(loginuser.getUserId());
		} else {
			TeachstaffinfoList = iTeachStaffInfo
					.getTeachstaffinfoByDepId(TeachSEI.getDeptinfo().getId());
		}
		model.addAttribute("projectid", projectid);
		List<Traininfo> trainInfoList = iTrainInfo.getTraininfoList();
		model.addAttribute("TeachstaffinfoList", TeachstaffinfoList);
		model.addAttribute("trainInfoList", trainInfoList);
		// model.addAttribute("trainTypeList", trainTypeList);
		// model.addAttribute("userList", userList);

		model.addAttribute("type", type);
		return ADDPATH;
	}

	@RequestMapping(value = Common_TrainApply.TRAINAPPLY_ADDTRAINAPPLYINDEX2)
	public String addTrainApplyIndex(Model model, HttpSession session,
			@PathVariable int type) {
		User loginuser = (User) session.getAttribute("USER");
		
		if (type==0) {
			List<Deptinfo> deptInfoList = iDeptInfo.getDeptinfoByLeader(loginuser
					.getUserId());
			List<Teachstaffinfo> TeachstaffinfoList = null;
			Teachstaffenlargeinfo TeachSEI = iTeachStaffEnlargeInfo
					.getTeachstaffenlargeinfoByUserId(loginuser.getUserId());
			
			
			if (deptInfoList.size() == 0) {
				TeachstaffinfoList = iTeachStaffInfo
						.getTeachstaffinfoByUserId(loginuser.getUserId());
			} else {
				TeachstaffinfoList = iTeachStaffInfo
						.getTeachstaffinfoByDepId(TeachSEI.getDeptinfo().getId());
			}
			model.addAttribute("TeachstaffinfoList", TeachstaffinfoList);

		}
				
		List<Traininfo> trainInfoList = iTrainInfo.getTraininfoList();
		System.out.println("size" +trainInfoList.size());
		
		model.addAttribute("trainInfoList", trainInfoList);
		model.addAttribute("type", type);
		return ADDPATH;
	}

	@RequestMapping(value = Common_TrainApply.TRAINAPPLY_EDITTRAINAPPLYINDEX)
	public String editTrainApplyIndex() {
		return EDITPATH;
	}
}
