package com.lov.component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class LoginHandlerInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		 	Object user = request.getSession().getAttribute("loginUser");
	        if(user == null){
	            //未登陆，返回登陆页面
	            request.setAttribute("msg","没有权限请先登陆");
	            request.getRequestDispatcher("/index.html").forward(request,response);
	            return false;
	        }else{
	            //已登陆，放行请求
	            return true;
	        }
	}

	
	
}
