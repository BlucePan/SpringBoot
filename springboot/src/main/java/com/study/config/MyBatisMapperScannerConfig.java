package com.study.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter(MyBatisConfig.class) // ��Ϊ��������ɨ�裬��Ҫ��MyBatisConfig�ĺ���ע�룬���Լ��������ע��
public class MyBatisMapperScannerConfig {
	
	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer(){
		MapperScannerConfigurer mapperScannerConfigurer=new MapperScannerConfigurer();
		  //��ȡ֮ǰע���beanNameΪsqlSessionFactory�Ķ���
		mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
		 //ָ��xml�����ļ���·��
        mapperScannerConfigurer.setBasePackage("com.study.dao");
        return mapperScannerConfigurer;
		
	}
	
	

}
