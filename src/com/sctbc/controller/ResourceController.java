package com.sctbc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sctbc.constant.Common_Base;
import com.sctbc.constant.Common_Resource;
import com.sctbc.entity.Privilege;
import com.sctbc.entity.Resource;

@Controller
@RequestMapping(Common_Base.COMMON_RESOURCE_MODULE)
public class ResourceController {
	private static final String LISTPATH = "/sctbc/Page/resource/list";
	private static final String ADDPATH = "/sctbc/Page/resource/add";
	private static final String EDITPATH = "/sctbc/Page/resource/edit";

	public boolean result = true;

	@RequestMapping(value = Common_Resource.RESOURCE_GETRESOURCEALL)
	public String getResourceAll(Model model) {
		List<Resource> resourceList = null;
		model.addAttribute("resourcelist", resourceList);
		return LISTPATH;
	}

	@ResponseBody
	@RequestMapping(value = Common_Resource.RESOURCE_ADDRESOURCE)
	public String addResource() {
		return result + "";
	}

	@ResponseBody
	@RequestMapping(value = Common_Resource.RESOURCE_EDITRESOURCE)
	public String editResource() {
		return result + "";
	}

	@ResponseBody
	@RequestMapping(value = Common_Resource.RESOURCE_DELRESOURCE)
	public String delResource() {
		return result + "";
	}

	@RequestMapping(value = Common_Resource.RESOURCE_ADDRESOURCEINDEX)
	public String addResourceIndex(Model model) {
		List<Privilege> privilegeList = null;
		model.addAttribute("privilegelist", privilegeList);
		return ADDPATH;
	}

	@RequestMapping(value = Common_Resource.RESOURCE_EDITRESOURCEINDEX)
	public String editResourceIndex(Model model, int resourceId) {
		Resource resource = null;
		List<Privilege> privilegeList = null;
		model.addAttribute("privilegelist", privilegeList);
		model.addAttribute("resource", resource);
		return EDITPATH;
	}
}
