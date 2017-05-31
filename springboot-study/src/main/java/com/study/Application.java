package com.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Import;

import com.study.util.SpringUtil;

@SpringBootApplication
//@ServletComponentScan //这个就是扫描相应的Servlet包
@MapperScan("com.study.dao")    //对应Mapper dao层不用每个都加@Mapper注解
@Import(value={SpringUtil.class})
public class Application {

	// 程序启动入口
    // 启动嵌入式的Tomcat并初始化Spring环境及其各Spring组件
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
