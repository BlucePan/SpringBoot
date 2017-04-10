package com.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.study.dao")
public class Application {

	 // 程序启动入口
    // 启动嵌入式的Tomcat并初始化Spring环境及其各Spring组件
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
