package com.study.service.impl;

import org.springframework.stereotype.Service;

import com.study.service.HelloService;
@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String getHello() {
		
		return "Hello World";
	}

}
