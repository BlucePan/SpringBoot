package com.study;

import javax.servlet.http.HttpServletRequest;

import com.study.model.User;


public class BaseController {
	
	
	//判断是否登录
	public boolean isLoginUser(HttpServletRequest request) {
		return getLoginUser(request) != null;
	}
	//得到登录用户
	public User getLoginUser(HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("study_user_info");
		return user;
	}
	

}
