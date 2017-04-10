package com.study.config;


import org.apache.commons.dbcp.BasicDataSource;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
@Configuration
@PropertySource("classpath:jdbc.properties")  //这个注解是导入jdbc配置文件
public class DataSourceConfiguration {
	private static final Logger logger = Logger.getLogger(DataSourceConfiguration.class);
	/**
	 * 绑定资源属性
	 */
	@Value("${jdbc.driver}")
	private String driver;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String userName;
	@Value("${jdbc.password}")
	private String passWord;
	@Value("${jdbc.maxActive}")
    private int maxActive;
    @Value("${jdbc.maxIdel}")
    private int maxIdel;
    @Value("${jdbc.maxWait}")
    private long maxWait;
    
    @Bean
	public BasicDataSource dataSource(){
    	logger.info("DataSource");
    	BasicDataSource  dataSource=new BasicDataSource();
    	dataSource.setDriverClassName(driver);
    	dataSource.setUrl(url);
    	dataSource.setUsername(userName);
    	dataSource.setPassword(passWord);
	    dataSource.setMaxActive(maxActive);
		dataSource.setMaxIdle(maxIdel);
		dataSource.setMaxWait(maxWait);
		return dataSource;
	}
    
    
	

}
