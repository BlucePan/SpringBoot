package com.study.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.study.dao.UserDao;
import com.study.model.User;
import com.study.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao userDao;
	
	@Override
	public List<User> queryAllUser(User u) {
		return userDao.queryAll(u);
	}

}
