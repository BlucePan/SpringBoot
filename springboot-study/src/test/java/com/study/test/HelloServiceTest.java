package com.study.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.service.HelloService;

@RunWith(SpringJUnit4ClassRunner.class)  //添加springJunit支持
@SpringBootTest   //指定springboot工程的启动类
///由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration
public class HelloServiceTest {

	@Resource
	private HelloService helloService;
	
	
	@Test
	public void testDemoOne(){
		
		System.out.println(">>>>>>>"+helloService.getHello());
	}
	
}
