package com.sctbc.server_i;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sctbc.entity.Auditingopinion;
import com.sctbc.entity.Trainapply;
import com.sctbc.entity.User;

public interface IReviewTrain {

	
	/**
	 * 通过申请培训记录的实体对象得到该培训条目的流程
	 * @param trainapply 申请培训条目的实体
	 * @return 流程list(map(string,string)) key=name,proId,value
	 * 
	 */
	public List<Map<String, String>> getProcedure(Trainapply trainapply);
	
	
	/**
	 * 通过申请培训记录的id检查该条记录是否通过
	 * @param id  该条申请培训的记录id
	 * @return  haspmap<> key=flag(0:未审核,-1:拒绝,1:通过),key=dep('部门名称')  
	 */
	public HashMap<String, String> check(int id);
	
	
	
	/**
	 * 通过user对象查询需要他审核的项目
	 * @param user 
	 * @return 所以所需数据,均可通过点击得出
	 */
	public List<Auditingopinion> getNeedReviewByUser(User user);
	
	
	/**
	 * 跟新审核记录
	 * @param id 审核条目id
	 * @param type 1:通过,-1:拒绝
	 * @param trainApplyId 申请条目的id
	 * @return
	 */
	public boolean upReviewTrain(int id,int type,String Reason,int trainApplyId);
	 
	
	
}
