package com.study.dao;

import java.util.List;

import com.study.BaseDao;
import com.study.model.User;

public interface UserDao extends BaseDao{
	public List<User> queryAll(User u);
	     User queryUserById(String id);
	     
	

}
