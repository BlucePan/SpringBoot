package com.study.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 定时任务
 * @author 1
 *
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {
	
	
	//@Scheduled(cron="0/10 * * * * ?")
	public void scheduler(){
	System.out.println("测试定时器每10秒执行一次----------");
		
		
	}
	
	

}
