package com.study.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 服务器启动加载数据
 * @author 1
 *
 */
@Component
public class MyStartupRunner implements CommandLineRunner {

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println(">>>>>>>>>>>>>>服务器启动执行，执行加载类！！！！！！");

	}

}
