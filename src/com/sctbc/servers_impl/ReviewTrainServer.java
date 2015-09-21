package com.sctbc.servers_impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.inject.New;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sctbc.dao.AuditingopinionDao;
import com.sctbc.dao.DeptinfoDao;
import com.sctbc.dao.TeachstafftraininfoDao;
import com.sctbc.dao.TrainapplyDao;
import com.sctbc.dao.UserDao;
import com.sctbc.entity.Auditingopinion;
import com.sctbc.entity.Deptinfo;
import com.sctbc.entity.Teachstafftraininfo;
import com.sctbc.entity.Trainapply;
import com.sctbc.entity.User;
import com.sctbc.server_i.IReviewTrain;


@Service
public class ReviewTrainServer implements IReviewTrain {

	@Autowired
	TrainapplyDao trainapplyDao;

	@Autowired
	ProcedureServer procedureServer;

	@Autowired
	AuditingopinionDao auditingopinionDao;

	@Autowired
	UserDao userDao;

	@Autowired
	DeptinfoDao deptinfoDao;
	
	@Autowired
	TeachstafftraininfoDao teachstafftraininfoDao;

	public List<Map<String, String>> getProcedure(Trainapply trainapply) {

		int procedureId = trainapply.getTraininfo().getTraintype()
				.getProcedure().getId();

		System.out.println("流程id"+procedureId);
		
		return procedureServer.getProcedItemByFirstId(procedureId);
	}

	public List<Auditingopinion> getAuditingopinionList(Trainapply trainapply) {

		return auditingopinionDao.getAuditItem(trainapply);
	}

	public void initItem(Trainapply trainapply, User user, String depName) {
		Auditingopinion auditingopinion = new Auditingopinion();
		auditingopinion.setTrainapply(trainapply);
		auditingopinion.setUser(user);
		auditingopinion.setAuditingOpinion("待审核");
		auditingopinion.setDenyReason("无");
		auditingopinion.setAuditingDepartment(depName);
		auditingopinionDao.insertAuditingopinion(auditingopinion);
	}

	public HashMap<String, String> check(int id) {

		System.out.println("chekc"+id);
		HashMap<String, String> hashMap = new HashMap<String, String>();

		int flag;
		Trainapply trainapply = trainapplyDao.getTrainapplyById(id);
		List<Map<String, String>> proceduceList = this.getProcedure(trainapply);
		List<Auditingopinion> auditingopinions = this
				.getAuditingopinionList(trainapply);

		for (int i = 1; i < proceduceList.size() - 1; i++) {
			System.out.println("chekc ----ing");
			try {
				Auditingopinion auditingopinion = auditingopinions.get(i - 1);
				String type = auditingopinion.getAuditingOpinion();
				if (type.equals("待审核")) {
					System.out.println("chekc ----待审核");
					flag = 0;
					hashMap.put("flag", flag + "");
					hashMap.put("dep", auditingopinion.getAuditingDepartment());
					return hashMap;
				} else if (type.equals("拒绝")) {
					System.out.println("chekc ----拒绝");
					flag = -1;
					hashMap.put("flag", flag + "");
					hashMap.put("dep", auditingopinion.getAuditingDepartment());
					trainapply.setFinalCheck("拒绝");
					trainapplyDao.updateTrainapply(trainapply);
					
					return hashMap;
				}

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("chekc ----初始化");
				
				flag = 0;
				String depId = proceduceList.get(i).get("value");
				Deptinfo deptinfo = deptinfoDao.getDeptinfo(Integer
						.parseInt(depId));
				initItem(trainapply,
						userDao.getUserById(deptinfo.getDepLeaderId()),
						deptinfo.getDepName());
				hashMap.put("flag", flag + "");
				hashMap.put("dep", deptinfo.getDepName());
				return hashMap;

			}
		}
		System.out.println("chekc ----成功");
		flag = 1;
		hashMap.put("flag", flag + "");
		hashMap.put("dep", "成功");
		trainapply.setFinalCheck("通过");
		trainapplyDao.updateTrainapply(trainapply);
		
		Teachstafftraininfo teachstafftraininfo=new Teachstafftraininfo();
		teachstafftraininfo.setProjectStatus("成功");
		teachstafftraininfo.setServeTime(new  SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		teachstafftraininfo.setUser(trainapply.getUser());
		teachstafftraininfo.setTraininfo(trainapply.getTraininfo());
		teachstafftraininfo.setEvaluateMark(0.0);
		teachstafftraininfoDao.insertTeachstafftraininfo(teachstafftraininfo);
		return hashMap;

	}

	public List<Auditingopinion> getNeedReviewByUser(User user) {
		return auditingopinionDao.findNeedReviewByUser(user);

	}

	@Override
	public boolean upReviewTrain(int id, int type,String Reason,int trainApplyId) {
		// TODO Auto-generated method stub
	Auditingopinion mAuditingopinion=auditingopinionDao.getAuditingopinionById(id);
		
		if(mAuditingopinion!=null){
			
			if (type==1) {
				mAuditingopinion.setAuditingOpinion("通过");
				mAuditingopinion.setDenyReason(Reason);
				
				
			}else {
				mAuditingopinion.setAuditingOpinion("拒绝");
				mAuditingopinion.setDenyReason(Reason);
			}
		 	auditingopinionDao.updateAuditingopinion(mAuditingopinion);
			check(trainApplyId);//此处id为申请条目id;
			return	true;
		}
		return false;
	}
}
