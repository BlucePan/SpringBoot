package com.study.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.BaseController;
import com.study.model.User;
import com.study.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
	@Resource
	private UserService userService;

	//后台首页
	@RequestMapping("/index.html")
	public String index(Model model,HttpServletRequest request){
		User user = getLoginUser(request);
		if(user!=null){
			System.out.println("进入后台首页>>>>>>");
			return "background/commom/index";
		}
		System.out.println("进入后台首页>>>>>>");
		return "background/login";
		
		
	}
	
	//登录页面
	@RequestMapping("/login.html")
	public String login(Model model){
		
		return "background/commom/index";
		
	}
	
}
