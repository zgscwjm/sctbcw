package com.sctbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sctbc.constant.Common_Base;
import com.sctbc.constant.Common_Privilege;

@Controller
@RequestMapping(Common_Base.COMMON_PRIVILEGE_MODULE)
public class PrivilegeController {
	private static final String LISTPATH = "/sctbc/Page/privilege/list";
	private static final String ADDPATH = "/sctbc/Page/privilege/add";
	private static final String EDITPATH = "/sctbc/Page/privilege/edit";

	private final boolean result = true;

	@RequestMapping(value = Common_Privilege.PRIVILEGE_GETPRIVILEGEALL)
	public String getPrivilegeAll(Model model) {
		return LISTPATH;
	}

	@ResponseBody
	@RequestMapping(value = Common_Privilege.PRIVILEGE_ADDPRIVILEGE)
	public String addPrivilege() {
		return result + "";
	}

	@RequestMapping(value = Common_Privilege.PRIVILEGE_EDITPRIVILEGE)
	public String editPrivilege() {
		return result + "";
	}

	@ResponseBody
	@RequestMapping(value = Common_Privilege.PRIVILEGE_DELPRIVILEGE)
	public String delPrivilege() {
		return result + "";
	}

	@RequestMapping(value = Common_Privilege.PRIVILEGE_ADDPRIVILEGEINDEX)
	public String addPrivilegeIndex() {
		return ADDPATH;
	}

	@RequestMapping(value = Common_Privilege.PRIVILEGE_EDITPRIVILEGEINDEX)
	public String editPrivilegeIndex() {
		return EDITPATH;
	}

}
