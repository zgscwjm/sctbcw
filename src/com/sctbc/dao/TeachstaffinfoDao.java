package com.sctbc.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sctbc.entity.Deptinfo;
import com.sctbc.entity.Teachstaffenlargeinfo;
import com.sctbc.entity.Teachstaffinfo;
import com.sctbc.entity.User;

@Repository
public class TeachstaffinfoDao extends BaseDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	boolean result = false;
	public List<Teachstaffinfo> getTeachstaffinfoAll() {
		String hql = "from Teachstaffinfo";
		return hibernateTemplate.find(hql);
	}

	public Teachstaffinfo getTeachstaffinfo(String userId)
	{
		try {
			return hibernateTemplate.get(Teachstaffinfo.class, userId);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}

	}
	public Teachstaffinfo getTeachstaffinfoById(int id) {
		try {
			return hibernateTemplate.get(Teachstaffinfo.class, id);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}

	}
	public List<Teachstaffinfo> getTeachstaffinfoByUserId(String userId) {
		System.out.println("teachstainfo:userid->" + userId);
		User user = hibernateTemplate.get(User.class, userId);
		String hql = "from Teachstaffinfo  as t where t.user=?";
		return hibernateTemplate.find(hql, user);
	}

	public Teachstaffinfo insertTeachstaffinfo(Teachstaffinfo teachstaffinfo) {
		try {
			 hibernateTemplate.save(teachstaffinfo);
			return  teachstaffinfo;
		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
			}
	public boolean updateTeachstaffinfo(Teachstaffinfo teachstaffinfo) {
		try {
			hibernateTemplate.update(teachstaffinfo);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
	public boolean delTeachstaffinfo(int teachstaffinfoId) {
		Teachstaffinfo teachstaffinfo = hibernateTemplate.get(
				Teachstaffinfo.class, teachstaffinfoId);
		try {
			hibernateTemplate.delete(teachstaffinfo);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
	public List<Teachstaffinfo> getTeachstaffinfoByDepId( final Deptinfo deptinfo) {
	//	System.out.println(depid);
//
//		final String sql = "select * from teachstaffinfo where userID in (select userID from teachstaffenlargeinfo where depID="
//				+ depid + ")";
//		List<TeachInfoVo> TeachInfoVoList = new ArrayList<TeachInfoVo>();
//		List<Map<String, Object>> TeachstaffinfoList = hibernateTemplate
//				.executeFind(new HibernateCallback() {
//					@Override
//					public Object doInHibernate(Session session)
//							throws HibernateException, SQLException {
//						SQLQuery query = session.createSQLQuery(sql);
//						return query.list();
//					}
//				});
		/*
		 * for (Map<String, Object> map : TeachstaffinfoList) { TeachInfoVo
		 * teachInfoVo = new TeachInfoVo();
		 * teachInfoVo.setId(Integer.parseInt(map.get("ID").toString()));
		 * teachInfoVo.setUserId(map.get("userID").toString());
		 * teachInfoVo.setName(map.get("name").toString());
		 * teachInfoVo.setSex(map.get("sex").toString());
		 * teachInfoVo.setEthnicity(map.get("ethnicity").toString());
		 * TeachInfoVoList.add(teachInfoVo); }
		 */



//		String hql="from Teachstaffenlargeinfo as a where a.deptinfo=?";
//		List<Teachstaffenlargeinfo> list=hibernateTemplate.find(hql, deptinfo);
//		String hql2="from Teachstaffinfo as a where a.user=?";
//		ArrayList<Teachstaffinfo> mList=new ArrayList<Teachstaffinfo>();
//		for (Teachstaffenlargeinfo teachstaffenlargeinfo : list) {
//			Teachstaffinfo teachstaffinfo=(Teachstaffinfo) hibernateTemplate.find(hql2,teachstaffenlargeinfo.getUser()).get(0);
//			mList.add(teachstaffinfo);
//		}

		
		//String hql3="select * from  Teachstaffinfo as a, Teachstaffenlargeinfo as b where a.user=b.user and b.deptinfo=?";
		List<Teachstaffinfo> list=hibernateTemplate.executeFind(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				SQLQuery query = session.createSQLQuery("select a.ID,a.userID,a.name,a.sex,a.ethnicity,a.memo1,a.memo2 from teachstaffinfo as a,teachstaffenlargeinfo as b where  b.userID=a.userID and b.depID=?");    
			    query.setInteger(0, deptinfo.getId());  
			     
				query.addEntity(Teachstaffinfo.class);
			     return query.list();
				
			}
		});
		
		return list;
	}
}
