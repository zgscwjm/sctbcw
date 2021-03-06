package com.sctbc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sctbc.constant.Common_Base;
import com.sctbc.constant.Common_SysLogin;
import com.sctbc.entity.Syslogin;
import com.sctbc.server_i.ISysLogServer;

@Controller
@RequestMapping(Common_Base.COMMON_SYSLOGIN_MODULE)
public class SysLoginController {
	private static final String LISTPATH = "/sctbc/Page/sysLogin/list";
	public boolean result = true;
	public String EntityName="Syslogin";

	@Autowired
	ISysLogServer sysLogServer;
	@RequestMapping(value = Common_SysLogin.SYSLOGIN_GETSYSLOGINALL)
	public String getSysLoginAll(Model model,HttpServletRequest request) {



		int count = sysLogServer.getCount(EntityName);
		Integer page=1;
		 try {

			page=Integer.parseInt(request.getParameter("page"));
			if (page == null || page.SIZE < 1) {
				page = 1;
			} else if (page > count / 6) {
				page = count / 6 + 1;
			}

		 } catch (Exception e) {
				// TODO: handle exception
			 page=1;
			}

		String searchname = "";

		List<Syslogin> sysLoginlist = sysLogServer.getListFoPage(EntityName, page, searchname);
		model.addAttribute("nowpage", page);
		model.addAttribute("count", count);

		model.addAttribute("sysLoginlist", sysLoginlist);
		return LISTPATH;
	}

	@ResponseBody
	@RequestMapping(value = Common_SysLogin.SYSLOGIN_DELSYSLOGIN)
	public String delSysLogin(Model model, int id) {
		result = sysLogServer.delById(id);
		return result + "";
	}
}
