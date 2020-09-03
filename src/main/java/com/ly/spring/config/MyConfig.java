package com.ly.spring.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebFilter(filterName = "myConfig",urlPatterns = "/admin/**")
public class MyConfig implements Filter{

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		 HttpServletResponse response = (HttpServletResponse)servletResponse; 
		  HttpServletRequest request = (HttpServletRequest)servletRequest;
		  request.setCharacterEncoding("utf-8");
          response.setCharacterEncoding("utf-8");
          response.setContentType("text/html; charset=UTF-8");  
          
          HttpSession session=request.getSession();
  		//获取登录后的用户名
  		String name = (String) session.getAttribute("name");
  		// 判断如果没有取到用户信息,就跳转到登陆页面
  		if (name == null || "".equals(name)) {
  		   // 跳转到登陆页面
  			response.sendRedirect("/QAQ/login");
  		} else {
  		   // 已经登陆,继续此次请求
  			chain.doFilter(request, response);
  		}
          
		  chain.doFilter(servletRequest, servletResponse);
	}

}
