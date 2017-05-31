package com.study.service;

import java.util.List;

import com.study.model.User;

public interface UserService {
	List<User> queryAllUser(User u);
	 User queryUserById(String id);
	 void addUser(User user);
	 void editUser(User user);
	 void deleteUser(String id);
	 User getCashUser(User user);

}
