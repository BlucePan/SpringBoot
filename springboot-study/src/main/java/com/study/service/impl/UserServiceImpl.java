package com.study.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
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
	
	@Override
	@Cacheable(value="userCache",key = "#id") 
	public User queryUserById(String id) {
		return userDao.queryUserById(id);
	}

	@Override
	public void addUser(User user) {
		userDao.addEntity(user);
		
	}

	public void editUser(User user) {
		userDao.editEntity(user);
	}

	@Override
	@CacheEvict(value="userCache",key = "#id")
	public void deleteUser(String id) {
		userDao.deleteEntity(id);		
	}

	@Override
	@CachePut(value="userCache",key = "#result.id")
	public User getCashUser(User user) {
		editUser(user);
		return userDao.queryUserById(user.getId());
	}

}
