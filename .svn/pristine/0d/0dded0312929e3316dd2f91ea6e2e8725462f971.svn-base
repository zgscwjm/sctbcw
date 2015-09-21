package com.sctbc.server_i;

import java.util.List;

import com.sctbc.entity.Shortperiodestimate;
import com.sctbc.entity.Traininfo;
import com.sctbc.entity.User;

public interface IShortPeriodEstimate extends IBaseServer<Shortperiodestimate> {
	public boolean addShortPeriodEstimate(
			Shortperiodestimate shortPeriodEstimate);
	public List<Shortperiodestimate> getShortperiodestimateBytrainUserID(
			String userid);

	public List<Shortperiodestimate> getDepShortperiodestimateAllIHas(
			User Euser, User Tuser, Traininfo traininfo);
}
