package com.sctbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sctbc.constant.Common_AuditingOpinion;
import com.sctbc.constant.Common_Base;

@Controller
@RequestMapping(value = Common_Base.COMMON_AUDITINGOPINION_MODULE)
public class AuditingOpinionController {
	private static final String LISTPATH = "/sctbc/Page/auditingOpinion/list";
	private static final String ADDPATH = "/sctbc/Page/auditingOpinion/add";
	private static final String EDITPATH = "/sctbc/Page/auditingOpinion/edit";

	private final boolean result = true;

	@RequestMapping(value=Common_AuditingOpinion.AUDITINGOPINION_GETAUDITINGOPINIONALL)
	public String getAuditingOpinionAll() {
		return LISTPATH;
	}

	@ResponseBody
	@RequestMapping(value = Common_AuditingOpinion.AUDITINGOPINION_ADDAUDITINGOPINION)
	public String addAuditingOpinion() {
		return result + "";
	}

	@ResponseBody
	@RequestMapping(value = Common_AuditingOpinion.AUDITINGOPINION_EDITAUDITINGOPINION)
	public String editAuditingOpinion() {
		return result + "";
	}

	@ResponseBody
	@RequestMapping(value = Common_AuditingOpinion.AUDITINGOPINION_DELAUDITINGOPINION)
	public String delAuditingOpinion() {
		return result + "";
	}

	@RequestMapping(value = Common_AuditingOpinion.AUDITINGOPINION_ADDAUDITINGOPINIONINDEX)
	public String addAuditingOpinionIndex() {
		return ADDPATH;
	}

	@RequestMapping(value = Common_AuditingOpinion.AUDITINGOPINION_EDITAUDITINGOPINIONINDEX)
	public String editAuditingOpinionIndex() {
		return EDITPATH;
	}

}
