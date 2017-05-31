package com.study.test;

import java.util.List;

import org.junit.Test;

import com.study.model.User;
import com.study.service.UserService;
import com.study.util.SpringUtil;


public class UserTest {
	
 	
	@Test
   public void testOne(){   	   
	      UserService userService=SpringUtil.getBean("userService",UserService.class);
	      List<User> userList=userService.queryAllUser(new User());
	      System.out.println(">>>>>>>>>>"+userList.size());
   }

}
