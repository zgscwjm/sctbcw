package com.sctbc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sctbc.constant.Common_Base;
import com.sctbc.constant.Common_Util;
import com.sctbc.util.FileUploads;

@Controller
@RequestMapping(Common_Base.COMMON_UTIL_MODULE)
public class UtilController {
	@ResponseBody
	@RequestMapping(value = Common_Util.UTIL_UPLOADPXZL)
	public String upLoadPXZL(Model model, HttpServletRequest request,
			HttpServletResponse response) {
		String src = "";
		try {
			src = new FileUploads().insert(request, response, "Upload/PXZL/");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			src = "false";
		}
		return "Upload/PXZL/" + src;
	}

	@ResponseBody
	@RequestMapping(value = Common_Util.UTIL_UPLOADSQB)
	public String upLoadSQB(Model model, HttpServletRequest request,
			HttpServletResponse response) {
		String src = "";
		try {
			src = new FileUploads().insert(request, response, "Upload/SQB/");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			src = "false";
		}
		return "Upload/SQB/" + src;
	}

}
