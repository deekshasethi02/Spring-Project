package com.yash.pbapp.configuration;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.yash.pbapp.daoimpl","com.yash.pbapp.serviceimpl"})
public class SpringRootConfig {

	@Bean
	public DataSource getDataSource() {
		
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/pbdb");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		dataSource.setMaxTotal(2);
		dataSource.setInitialSize(1);
		dataSource.setTestOnBorrow(true);
		dataSource.setValidationQuery("SELECT 1");
		dataSource.setDefaultAutoCommit(true);
		return dataSource;
	}
}
