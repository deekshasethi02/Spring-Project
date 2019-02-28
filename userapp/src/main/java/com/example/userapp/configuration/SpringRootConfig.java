package com.example.userapp.configuration;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * This is responsible for creating root beans like 
 * service,repository etc
 * @author deeksha.sethi
 *
 */
@Configuration
@ComponentScan(basePackages= {"com.example.userapp.daoimpl","com.example.userapp.serviceimpl"})

public class SpringRootConfig {
	
	//TODO: Service ,DAO, DataSource, Email Sender, SMS Sender,or some other beans related to business logic
	
	@Bean
	public DataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/userdb");
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
