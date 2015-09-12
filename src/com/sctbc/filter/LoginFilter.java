package com.sctbc.filter;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//@WebFilter("/*")
public class LoginFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		if (!request.getRequestURL().toString().contains("login")
				&& !request.getRequestURL().toString().contains(".js")
				&& !request.getRequestURL().toString().contains(".css")) {
			HttpSession session = request.getSession();

			System.out.println(request.getRequestURI());
			if (session.getAttribute("USER") == null
					|| "".equals(session.getAttribute("USER"))) {
				response.sendRedirect("/sctbcw/sctbc/login.jsp");
			} else {
				arg2.doFilter(arg0, arg1);
			}
		} else {
			arg2.doFilter(arg0, arg1);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
