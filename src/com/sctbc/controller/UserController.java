package com.sctbc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sctbc.constant.Common_Base;
import com.sctbc.constant.Common_User;
import com.sctbc.entity.Deptinfo;
import com.sctbc.entity.Roles;
import com.sctbc.entity.Teachstaffenlargeinfo;
import com.sctbc.entity.Teachstaffinfo;
import com.sctbc.entity.User;
import com.sctbc.server_i.IRole;
import com.sctbc.server_i.ITeachStaffInfo;
import com.sctbc.server_i.IUser;

@Controller
@RequestMapping(Common_Base.COMMON_USER_MODULE)
public class UserController {

	@Autowired
	IUser iUser;
	@Autowired
	IRole iRole;
	@Autowired
	ITeachStaffInfo iTeachStaffInfo;

	private static final String LISTPATH = "/sctbc/Page/user/list";
	private static final String ADDPATH = "/sctbc/Page/user/add";
	private static final String EDITPATH = "/sctbc/Page/user/edit";
	private static final String NOLOGIN = "/sctbc/login";
	private static final String OKLOGIN = "/sctbc/Page/index";

	public boolean result = true;


	@RequestMapping(value=Common_User.USER_LOGIN,method=RequestMethod.GET)
	public String userLogin(Model model) {
		return NOLOGIN;
	}

	@RequestMapping(value=Common_User.USER_LOGIN,method=RequestMethod.POST)
	public String userLogin(Model model,HttpSession session,String username,String password) {
		User user=iUser.userLogin(username, password);
		if (user!=null) {
			Teachstaffinfo teachstaffinfo = iTeachStaffInfo.getTeachstaffinfo(user
					.getUserId());
			session.setAttribute("USER", user);
			session.setAttribute("USERINFO", teachstaffinfo);
			return OKLOGIN;
		}else {
			return NOLOGIN;
		}

	}


	@RequestMapping(value = Common_User.USER_GETUSERALL)
	public String getUserAll(Model model) {
		List<User> userList = iUser.getList();// 获取用户表（User）的数据
		model.addAttribute("userlist", userList);
		return LISTPATH;
	}

	@ResponseBody
	@RequestMapping(value = Common_User.USER_ADDUSER)
	public String addUser(Model model, User user, int roleId,
			Teachstaffinfo teachStaffInfo) {// user:管理员添加的用户表（User）的数据
		// 向User表新增数据（user）
		Teachstaffenlargeinfo teachStaffEnlargeInfo = null;
		user.setRoles(iRole.getById(roleId));
		User user_login = iUser.register(user, teachStaffInfo,
				teachStaffEnlargeInfo);
		if (user_login == null) {
			result = false;
		}
		return result + ""; // 向页面 返回值为true或者非true得字符串数据；来判定成功或者错误信息
	}

	@ResponseBody
	@RequestMapping(value = Common_User.USER_EDITUSER)
	public String editUser(Model model, User user, Integer roleId) {
		// 修改user的数据/
		System.out.println("roleId:" + roleId);
		user.setRoles(iRole.getById(roleId));
		return true + "";// iUser.upUser(user) + "";// 向页面
							// 返回值为true或者非true得字符串数据；来判定成功或者错误信息
	}

	@RequestMapping(value = Common_User.USER_SEARCHUSER)
	public String searchUser(Model model, String data) {
		List<User> userList = iUser.searchUser(data);// 获取用户表（User）的数据
		model.addAttribute("userlist", userList);
		return LISTPATH;
	}

	@ResponseBody
	@RequestMapping(value = Common_User.USER_DELUSER)
	public String delUser(Model model, String userID) {
		// 对User表进行删除操作，删除主键userID为 获取的userID的数据
		return iUser.delUser(userID) + "";// 向页面
											// 返回值为true或者非true得字符串数据；来判定成功或者错误信息
	}

	@RequestMapping(value = Common_User.USER_ADDUSERINDEX)
	public String addUserIndex(Model model) {
		List<Roles> rolesList = iRole.getList();
		List<Deptinfo> deptInfoList = null;// 获取部门的数据（包括部门编号和部门名称 两个字段值）
		model.addAttribute("rolesList", rolesList);
		model.addAttribute("deptInfoList", deptInfoList);
		return ADDPATH;
	}

	@RequestMapping(value = Common_User.USER_EDITUSERINDEX)
	public String editUserIndex(Model model, String userId) {
		User user = iUser.getById(userId);// 根据主键userId查询到的当用户的数据；
		List<Roles> rolesList = iRole.getList();
		model.addAttribute("rolesList", rolesList);
		model.addAttribute("user", user);

		return EDITPATH;
	}

}
