package com.study.dao;

import java.util.List;

import com.study.model.User;

public interface UserDao {
	public List<User> queryAll(User u);

}
