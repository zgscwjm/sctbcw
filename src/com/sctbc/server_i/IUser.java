package com.sctbc.server_i;

import java.util.List;

import com.sctbc.entity.Teachstaffenlargeinfo;
import com.sctbc.entity.Teachstaffinfo;
import com.sctbc.entity.Teachstafftraininfo;
import com.sctbc.entity.Trainapply;
import com.sctbc.entity.User;

public interface IUser extends IBaseServer<User>{
	/**
	 * 用户登录
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public User userLogin(String username,String password);
	/**
	 * 用户注册
	 * 
	 * @param User
	 * @param Password
	 * @param getRolesId
	 * @param teachstaffinfo
	 * @param teachstafftraininfo
	 * @param trainapply
	 * @param memo1
	 * @param memo2
	 * @return
	 */
	public User register(String UserId,String Password,int getRolesId,Teachstaffinfo teachstaffinfo,Teachstafftraininfo teachstafftraininfo,Trainapply trainapply,String memo1,String memo2);


	/**
	 * 检测用户名是否可用
	 * 
	 * @param userId
	 *            用户名
	 * @return ture可以用,flase不可用
	 */
	public boolean checkUserId(String username);

	/**
	 * 跟新用户
	 */
	public boolean upUser(String UserId,String Password,int RolesId,Teachstaffinfo teachstaffinfo,Teachstafftraininfo teachstafftraininfo,Trainapply trainapply,String memo1,String memo2);

	public boolean upUser(User user);

	public User register(User user,Teachstaffinfo teachstaffinfo,Teachstaffenlargeinfo teachstaffenlargeinfo);


	public User getById(String id);

	/**
	 * 修改密码
	 * 
	 * @param userid
	 * @param psw
	 * @return
	 */
	public boolean changPsw(String userid,String psw);

	/**
	 * 搜索用户
	 * 
	 * @param key
	 * @return
	 */
	public List<User> searchUser(String key);

	/**
	 * 删除用户
	 */
	public boolean delUser(String id);
	public List<User> getUserByNoTeachstaffenlargeinfo();

}
