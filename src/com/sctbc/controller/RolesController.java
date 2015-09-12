package com.sctbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sctbc.constant.Common_Base;
import com.sctbc.constant.Common_Roles;
import com.sctbc.entity.Privilege;
import com.sctbc.entity.Roles;
import com.sctbc.server_i.IRole;

@Controller
@RequestMapping(Common_Base.COMMON_ROLES_MODULE)
public class RolesController {
	@Autowired
	IRole iRole;

	private static final String LISTPATH = "/sctbc/Page/roles/list";
	private static final String ADDPATH = "/sctbc/Page/roles/add";
	private static final String EDITPATH = "/sctbc/Page/roles/edit";

	private static final String ENTITYNAME = "Roles";

	private final boolean result = true;

	@RequestMapping(value = Common_Roles.ROLES_GETROLESALL)
	public String getRolesAll(Model model, Integer page) {
		int count = iRole.getCount(ENTITYNAME);
		if (page == null || page.SIZE < 1) {
			page = 1;
		} else if (page > count / 6) {
			page = count / 6 + 1;
		}
		List<Roles> rolesList = iRole.getListFoPage(ENTITYNAME, page);

		model.addAttribute("nowpage", page);
		model.addAttribute("count", count);
		model.addAttribute("rolelist", rolesList);
		return LISTPATH;
	}

	@ResponseBody
	@RequestMapping(value = Common_Roles.ROLES_ADDROLES)
	public String addRoles(Model model) {

		return result + "";
	}

	@ResponseBody
	@RequestMapping(value = Common_Roles.ROLES_EDITROLES)
	public String editRoles(Model model) {
		return result + "";
	}
	@ResponseBody
	@RequestMapping(value = Common_Roles.ROLEWS_DELROLES)
	public String delRoles(Model model) {
		return result + "";
	}

	@RequestMapping(value = Common_Roles.ROLES_ADDROLESINDEX)
	public String addRolesIndex(Model model) {
		List<Privilege> privilegeList = null;
		model.addAttribute("privilegelist", privilegeList);
		return ADDPATH;
	}

	@RequestMapping(value = Common_Roles.ROLES_EDITROLESINDEX)
	public String editRolesIndex(Model model, int roleId) {
		Roles roles = iRole.getById(roleId);
		model.addAttribute("roles", roles);
		return EDITPATH;
	}
}
