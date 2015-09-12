package com.sctbc.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.sctbc.entity.User;
import com.sctbc.servers_impl.UserServer;

public class LoginSuccessHandler implements AuthenticationSuccessHandler {

	
	public String getDefaultTargetUrl() {
		return defaultTargetUrl;
	}

	public void setDefaultTargetUrl(String defaultTargetUrl) {
		this.defaultTargetUrl = defaultTargetUrl;
	}

	private String defaultTargetUrl=null;
	
	private RedirectStrategy redirectStrategy=new DefaultRedirectStrategy();
	
	
	@Autowired
	private UserServer userServer;
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest arg0,
			HttpServletResponse arg1, Authentication arg2) throws IOException,
			ServletException {
		// TODO Auto-generated method stub
		
		
		User user=userServer.getById(arg2.getName());
		arg0.getSession().setAttribute("USER", user);
		System.out.println("run loginsuccess");
		this.redirectStrategy.sendRedirect(arg0, arg1, this.defaultTargetUrl);
		
	}

}
