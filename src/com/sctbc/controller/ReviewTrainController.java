package com.sctbc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sctbc.constant.Common_Base;
import com.sctbc.constant.Common_ReviewTrain;
import com.sctbc.entity.User;
import com.sctbc.server_i.IDeptInfo;
import com.sctbc.server_i.IReviewTrain;

@Controller
@RequestMapping(Common_Base.COMMON_REVIEWTRAIN_MODULE)
public class ReviewTrainController {

	private static final String LISTPATH = "/sctbc/Page/Review/list";


	@Autowired
	IDeptInfo iDeptInfo;

	@Autowired
	IReviewTrain iReviewTrain;


	@RequestMapping(value=Common_ReviewTrain.REVIEWTRAIN_GETREVIEWTRAINALL)
	public String getReviewAll(HttpSession session,Model model) {

		User user=(User) session.getAttribute("USER");
		if(iDeptInfo.isLeader(user))
		{
			System.out.println("iReviewTrain.getNeedReviewByUser(user).size:"
					+ iReviewTrain.getNeedReviewByUser(user).size());
			model.addAttribute("reviewlist",iReviewTrain.getNeedReviewByUser(user));
		}

		return LISTPATH;
	}

	@ResponseBody
	@RequestMapping(value = Common_ReviewTrain.REVIEWTRAIN_SHREVIEWTRAIN)
	public String ShReview(Model model, int id, int val, String reason,
			int trainApplyId) {
		boolean result = iReviewTrain.upReviewTrain(id, val, reason,
				trainApplyId);
		return result + "";
	}
}
