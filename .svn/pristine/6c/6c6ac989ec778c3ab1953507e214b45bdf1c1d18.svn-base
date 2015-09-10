package com.sctbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sctbc.constant.Common_Base;
import com.sctbc.constant.Common_LongPeriodEstimate;

@Controller
@RequestMapping(Common_Base.COMMON_LONGPERIODESTIMATE)
public class LongPeriodEstimateController {
	public static final String LISTPATH = "/sctbc/Page/longPeriodEstimate/list";
	public static final String ADDPATH = "/sctbc/Page/longPeriodEstimate/add";
	public static final String EDITPATH = "/sctbc/Page/longPeriodEstimate/edit";

	private final boolean result = true;

	@RequestMapping(value = Common_LongPeriodEstimate.LONGPERIODESTIMATE_GETLONGPERIODESTIMATEALL)
	public String getLongPeriodEstimateAll() {
		return LISTPATH;
	}
	@ResponseBody
	@RequestMapping(value = Common_LongPeriodEstimate.LONGPERIODESTIMATE_ADDLONGPERIODESTIMATE)
	public String addLongPeriodEstimate() {
		return result + "";
	}
	@ResponseBody
	@RequestMapping(value = Common_LongPeriodEstimate.LONGPERIODESTIMATE_EDITLONGPERIODESTIMATE)
	public String editLongPeriodEstimate() {
		return result + "";
	}
	@ResponseBody
	@RequestMapping(value = Common_LongPeriodEstimate.LONGPERIODESTIMATE_DELLONGPERIODESTIMATE)
	public String delLongPeriodEstimate() {
		return result + "";
	}
	@RequestMapping(value = Common_LongPeriodEstimate.LONGPERIODESTIMATE_ADDLONGPERIODESTIMATEINDEX)
	public String addLongPeriodEstimateIndex() {
		return ADDPATH;
	}
	@RequestMapping(value = Common_LongPeriodEstimate.LONGPERIODESTIMATE_EDITLONGPERIODESTIMATEINDEX)
	public String editLongPeriodEstimateIndex() {
		return EDITPATH;
	}
}
