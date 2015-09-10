package com.sctbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sctbc.constant.Common_Base;
import com.sctbc.constant.Common_ShortPeriodEstimate;

@Controller
@RequestMapping(Common_Base.COMMON_SHORTPERIODESTIMATE)
public class ShortPeriodEstimateController {
	private static final String LISTPATH = "/sctbc/Page/shortPeriodEstimate/list";
	private static final String ADDPATH = "/sctbc/Page/shortPeriodEstimate/add";
	private static final String EDITPATH = "/sctbc/Page/shortPeriodEstimate/edit";

	private final boolean result = true;

	@RequestMapping(value = Common_ShortPeriodEstimate.SHORTPERIODESTIMATE_GETSHORTPERIODESTIMATEALL)
	public String getShortPeriodEstimateAll() {
		return LISTPATH;
	}
	@ResponseBody
	@RequestMapping(value = Common_ShortPeriodEstimate.SHORTPERIODESTIMATE_ADDSHORTPERIODESTIMATE)
	public String addShortPeriodEstimate() {
		return result + "";
	}
	@ResponseBody
	@RequestMapping(value = Common_ShortPeriodEstimate.SHORTPERIODESTIMATE_EDITSHORTPERIODESTIMATE)
	public String editShortPeriodEstimate() {
		return result + "";
	}
	@ResponseBody
	@RequestMapping(value = Common_ShortPeriodEstimate.SHORTPERIODESTIMATE_DELSHORTPERIODESTIMATE)
	public String delShortPeriodEstimate() {
		return result + "";
	}

	@RequestMapping(value = Common_ShortPeriodEstimate.SHORTPERIODESTIMATE_ADDSHORTPERIODESTIMATEINDEX)
	public String addShortPeriodEstimateIndex() {
		return ADDPATH;
	}
	@RequestMapping(value = Common_ShortPeriodEstimate.SHORTPERIODESTIMATE_EDITSHORTPERIODESTIMATEINDEX)
	public String editShortPeriodEstimateIndex() {
		return EDITPATH;
	}
}
