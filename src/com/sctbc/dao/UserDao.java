package com.sctbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sctbc.entity.Teachstaffenlargeinfo;
import com.sctbc.entity.User;

@Repository
public class UserDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	boolean result = true;

	public List<User> getUserAll() {
		String hql = "from User";
		return hibernateTemplate.find(hql);
	}

	public User insertUser(User user) {
		try {
			hibernateTemplate.save(user);
			return user;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public boolean updateUser(User user) {
		try {
			hibernateTemplate.update(user);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}

	public boolean delUser(String userId) {
		User user = hibernateTemplate.get(User.class, userId);
		try {
			hibernateTemplate.delete(user);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}

	public User getUserById(String id) {
		return hibernateTemplate.get(User.class, id);
	}

	public List<User> getUserByNameAndPwd(String username, String password) {
		String hql = "from User where userId=? and password=?";
		System.out.println(password + ":" + username);
		String[] values = {username, password};
		return hibernateTemplate.find(hql, values);
	}

	public List<User> search(String key) {
		// TODO Auto-generated method stub
		String hql = "from User as q where q.userId like ?";
		return hibernateTemplate.find(hql, "%" + key + "%");
	}

	public List<User> getUserNoTeachstaffenlargeinfo() {
		String hql_1 = "from Teachstaffenlargeinfo";
		List<Teachstaffenlargeinfo> teachstaffenlargeinfo = hibernateTemplate
				.find(hql_1);
		String hql_2 = "from User";
		List<User> userBy = hibernateTemplate.find(hql_2);
		List<User> userList = null;
		for (User u : userBy) {
			if (teachstaffenlargeinfo != null
					&& teachstaffenlargeinfo.equals("[]")) {
				for (Teachstaffenlargeinfo t : teachstaffenlargeinfo) {
					if (u.getUserId() != t.getUserId()) {
						userList.add(u);
					}
				}
			}
 else {
				userList = userBy;
			}
		}
		return userList;
	}

}
