package com.study.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.model.User;
import com.study.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)  //添加springJunit支持
@SpringBootTest   //指定springboot工程的启动类
///由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration
public class UserCashServiceTest {

	@Resource
	private UserService userService;
	
	
	@Test
	public void  haveCash(){
		User u=userService.queryUserById("1");
		System.out.println(">>>>>>>>>>>"+u);
		User user=new User();
		user.setId("1");
		user.setName("hhhh");
		userService.getCashUser(user);
		System.out.println(">>>>>>>>>>>"+userService.queryUserById("1"));
	}
	
	@Test
	public void noCash(){
		User u=userService.queryUserById("1");
		System.out.println(">>>>>>>>>>>"+u);
	
		userService.deleteUser("1");
		System.out.println(">>>>>>>>>>>"+userService.queryUserById("1"));
		
		
	}
}
