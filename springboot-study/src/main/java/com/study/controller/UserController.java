package com.study.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.model.User;
import com.study.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping("/querAllUser")
	public String queryAllUser(){
		User u=new User();
		List<User> userList=userService.queryAllUser(u);
		
		return "我的第一个springboot小列子>>>>>>>"+userList.size();
	}
}
