package com.sctbc.servers_impl;

import java.io.UnsupportedEncodingException;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sctbc.dao.DeptinfoDao;
import com.sctbc.dao.TeachstafftraininfoDao;
import com.sctbc.dao.TrainapplyDao;
import com.sctbc.dao.TraininfoDao;
import com.sctbc.dao.TraintypeDao;
import com.sctbc.entity.RolesPrivilege;
import com.sctbc.entity.Teachstafftraininfo;
import com.sctbc.entity.Trainapply;
import com.sctbc.entity.Traininfo;
import com.sctbc.entity.Traintype;
import com.sctbc.entity.User;
import com.sctbc.server_i.IReviewTrain;
import com.sctbc.server_i.ITrainApply;
import com.sctbc.server_i.ITrainInfo;
import com.sctbc.server_i.ITrainType;

@Service
public class TrainServer implements ITrainApply,ITrainType,ITrainInfo{

	@Autowired
	TrainapplyDao trainapplyDao;

	@Autowired
	TraintypeDao traintypeDao;

	@Autowired
	DeptinfoDao deptInfoDao;

	@Autowired
	TraininfoDao traininfoDao;


	@Autowired
	IReviewTrain reviewTrain;

	@Autowired
	TeachstafftraininfoDao teachstafftraininfoDao;

	@Override
	public Trainapply getById(int id) {
		// TODO Auto-generated method stub
		return trainapplyDao.getTrainapplyById(id);
	}

	@Override
	public List<Trainapply> getList() {
		// TODO Auto-generated method stub
		return trainapplyDao.getTrainapplyAll();
	}

	@Override
	public boolean delById(int id) {
		// TODO Auto-generated method stub

		return trainapplyDao.delTrainapply(id);
	}

	@Override
	public boolean upData(Trainapply t) {
		// TODO Auto-generated method stub
		return trainapplyDao.updateTrainapply(t);
	}

	@Override
	public boolean addTrainApply(Trainapply trainapply) {
		// TODO Auto-generated method stub

		 trainapplyDao.insertTrainapply(trainapply);

		 reviewTrain.check(trainapply.getId());
		 return true;
	}

	@Override
	public List<Traintype> getTrainTypeList() {
		// TODO Auto-generated method stub
		return traintypeDao.getTraintypeAll();
	}

	@Override
	public Traintype getTraintypeById(int id) {
		// TODO Auto-generated method stub
		return traintypeDao.getTraintypeById(id);
	}

	@Override
	public boolean addTraintype(Traintype traintype) {
		// TODO Auto-generated method stub
		 return 	 traintypeDao.insertTraintype(traintype);

	}

	@Override
	public boolean delTraintypeById(int id) {
		// TODO Auto-generated method stub
		return traintypeDao.delTraintype(id);
	}

	@Override
	public boolean upTraintypeById(Traintype traintype) {
		// TODO Auto-generated method stub
		return traintypeDao.updatetTraintype(traintype);
	}

	@Override
	public Traininfo getTraininfoById(int id) {
		// TODO Auto-generated method stub
		return traininfoDao.getTraininfoById(id);
	}

	@Override
	public List<Traininfo> getTraininfoList() {
		// TODO Auto-generated method stub
		return traininfoDao.getTraininfoAll();
	}

	@Override
	public boolean addTraininfo(Traininfo trainInfo) {
		// TODO Auto-generated method stub
		return traininfoDao.insertTraininfo(trainInfo);
	}

	@Override
	public boolean delTraininfo(Traininfo traininfo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Trainapply> getListFoPage(String EntityName, Integer nowpage,
			String searchname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCount(String EntityName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Traininfo> getTraininfoByUserTrue(String userId) {
		// TODO Auto-generated method stub
		return traininfoDao.getTraininfoByUserTrue(userId);
	}

	@Override
	public List<Trainapply> getTrainapplyByCheck(String userId) {
		// TODO Auto-generated method stub

		return trainapplyDao.getTrainapplyByCheck();
	}

	@Override
	public List<Trainapply> getTrainListByUser(User user) {
		// TODO Auto-generated method stub


		Set<RolesPrivilege> mySet=	 user.getRoles().getRolesPrivileges();

		for (RolesPrivilege rolesPrivilege : mySet) {
			if(rolesPrivilege.getPrivilege().getPrivilegeId()==9)
			{
				return	this.getList();
			}
		}

		return trainapplyDao.getSelfTrainapply(user);
	}

	@Override
	public List<Trainapply> getTrainapplyBytraininfoAndUser(
			Traininfo traininfo, User user) {
		// TODO Auto-generated method stub
		return trainapplyDao.getTrainapplyBytraininfoAndUser(traininfo, user);
	}

	@Override
	public List<Traintype> getListFoPageTraintype(String EntityName,
			Integer page, String searchname) {
		// TODO Auto-generated method stub
		if (page == null || page <= 1) {
			page = 0;
		}
		if (searchname == null) {
			searchname = "";
		} else {
			try {
				searchname = new String(searchname.getBytes("ISO-8859-1"),
						"utf-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String where = " where kindName like " + "'%" + searchname + "%'";
		return traintypeDao.getListFoPage(EntityName, page, where);
	}

	@Override
	public Integer getCountTraintype(String EntityName) {
		// TODO Auto-generated method stub
		return traintypeDao.getCount(EntityName);
	}

	@Override
	public List<Traininfo> getListFoPageTraininfo(String EntityName,
			Integer page, String searchname) {
		// TODO Auto-generated method stub
		if (page == null || page <= 1) {
			page = 0;
		}
		if (searchname == null) {
			searchname = "";
		} else {
			try {
				searchname = new String(searchname.getBytes("ISO-8859-1"),
						"utf-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		String where = " where projectName like " + "'%" + searchname
				+ "%' order by projectId desc ";
		return traininfoDao.getListFoPage(EntityName, page, where);
	}

	@Override
	public Integer getCountTraininfo(String EntityName) {
		// TODO Auto-generated method stub
		return traininfoDao.getCount(EntityName);
	}

	@Override
	public List<Trainapply> getListFoPageTrainapply(String EntityName,
			Integer page, String searchname,User user) {
		// TODO Auto-generated method stub
		/*
		 * if (page == null || page <= 1) { page = 0; } if (searchname == null)
		 * { searchname = ""; } else { try { searchname = new
		 * String(searchname.getBytes("ISO-8859-1"), "utf-8"); } catch
		 * (UnsupportedEncodingException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } } String where = "";
		 *
		 * Set<RolesPrivilege> mySet= user.getRoles().getRolesPrivileges();
		 *
		 * for (RolesPrivilege rolesPrivilege : mySet) {
		 * if(rolesPrivilege.getPrivilege().getPrivilegeId()==9) { where =
		 * " where id like " + "'%" + searchname + "%'"; return
		 * trainapplyDao.getListFoPage(EntityName, page, where); } }
		 *
		 *
		 * where = " where  user=";
		 */
		/* return trainapplyDao.getListFoPage(EntityName, page, user); */
		return null;
	}

	@Override
	public Integer getCountTrainapply(String EntityName) {
		// TODO Auto-generated method stub
		return trainapplyDao.getCount(EntityName);
	}

	@Override
	public List<Traininfo> getListFoPageTraininfo_TJ(String EntityName,
			Integer page, String where) {
		// TODO Auto-generated method stub
		if (page == null || page <= 1) {
			page = 0;
		}
		if (where == null) {
			where = "";
		} else {
			try {
				where = new String(where.getBytes("ISO-8859-1"),
						"utf-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		where = where + " order by projectId desc ";
		return traininfoDao.getListFoPage(EntityName, page, where);
	}
	@Override
	public Integer getCountTraininfo_TJ(String where) {
		return 1;
	}

	@Override
	public List<Trainapply> getListFoPageTrainapply_TJ(String EntityName,
			Integer page, String where) {
		// TODO Auto-generated method stub
		if (page == null || page <= 1) {
			page = 0;
		}
		if (where == null) {
			where = "";
		} else {
			try {
				where = new String(where.getBytes("ISO-8859-1"), "utf-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		where = where + " order by id desc ";
		return trainapplyDao.getListFoPage(EntityName, page, where);
	}

	@Override
	public Integer getCountTrainapply_TJ(String EntityName) {
		// TODO Auto-generated method stub
		return trainapplyDao.getCount(EntityName);
	}

	@Override
	public List<Trainapply> getLIstByDepId(String depid) {
		// TODO Auto-generated method stub
		return trainapplyDao.findTrainapplyListByDepId(depid);
	}
	public List<Trainapply> getLIstByProjectId(int projectId) {
		Traininfo traininfo = traininfoDao.getTraininfoById(projectId);
		return trainapplyDao.getTrainapplyByProjectId(traininfo);
	}

	@Override
	public List<Trainapply> getLIstByTime(String time) {
		// TODO Auto-generated method stub
		List<Trainapply> mlist=new ArrayList<Trainapply>();
		 List<Teachstafftraininfo> list=teachstafftraininfoDao.geTeachstafftraininfosByTime(time);
		 for (Teachstafftraininfo teachstafftraininfo : list) {
		 mlist.add(trainapplyDao.getTrainapplyBytraininfoAndUser(teachstafftraininfo.getTraininfo(), teachstafftraininfo.getUser()).get(0));

		}
		return mlist;
	}

	@Override
	public boolean checkTrainInfoByTime(int projectId) {
		// TODO Auto-generated method stub
		Traininfo traininfo=traininfoDao.getTraininfoById(projectId);
		java.sql.Timestamp timestamp=traininfo.getTrainStartTime();
		Date date=new Date(timestamp.getTime());
//		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
//		String startTimeString=simpleDateFormat.format(date);
		Date date2=new Date();
		if (date.getTime()<date2.getTime()) {
			return true;
		}
		return false;
	}

}
