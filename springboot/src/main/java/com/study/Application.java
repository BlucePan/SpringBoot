package com.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.study.dao")
public class Application {

	 // �����������
    // ����Ƕ��ʽ��Tomcat����ʼ��Spring���������Spring���
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
