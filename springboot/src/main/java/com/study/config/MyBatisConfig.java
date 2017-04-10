package com.study.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

@Configuration
@EnableTransactionManagement  //加上这个注解，使得支持事务
public class MyBatisConfig implements TransactionManagementConfigurer {
	@Autowired
	private DataSource dataSource;
	
	public PlatformTransactionManager annotationDrivenTransactionManager() {		
		return new DataSourceTransactionManager(dataSource);
	}
	
	@Bean(name = "sqlSessionFactory") 
	public SqlSessionFactory sqlSessionFactoryBean(){
		SqlSessionFactoryBean bean =new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		try {
/*		   //对应到指定的xml
	        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
	        bean.setMapperLocations(resolver.getResources("classpath:com/study/mapping/*Mapping.xml"));
			*/
			return bean.getObject();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	@Bean
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory){		
		return new SqlSessionTemplate(sqlSessionFactory);
	}
	
}
