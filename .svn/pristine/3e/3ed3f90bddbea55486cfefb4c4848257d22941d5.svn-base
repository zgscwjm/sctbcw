package com.sctbc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sctbc.constant.Common_Base;
import com.sctbc.constant.Common_SysLogin;
import com.sctbc.entity.Syslogin;

@Controller
@RequestMapping(Common_Base.COMMON_SYSLOGIN_MODULE)
public class SysLoginController {
	private static final String LISTPATH = "/sctbc/Page/sysLogin/list";
	public boolean result = true;

	@RequestMapping(value = Common_SysLogin.SYSLOGIN_GETSYSLOGINALL)
	public String getSysLoginAll(Model model) {
		List<Syslogin> sysLoginlist = null;
		model.addAttribute("sysLoginlist", sysLoginlist);
		return LISTPATH;
	}

	@ResponseBody
	@RequestMapping(value = Common_SysLogin.SYSLOGIN_DELSYSLOGIN)
	public String delSysLogin(Model model) {
		return result + "";
	}
}
