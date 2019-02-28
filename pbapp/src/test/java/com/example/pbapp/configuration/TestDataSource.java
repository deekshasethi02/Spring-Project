package com.example.pbapp.configuration;



import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.pbapp.configuration.SpringRootConfig;

public class TestDataSource {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class); //spring root config has data source bean 
		DataSource dataSource = ctx.getBean(DataSource.class);
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "INSERT INTO users(name,email,loginname,password) VALUES(?,?,?,?)";
		Object[] params = new Object[] {"deeksha sethi","deeksha@yash.com","deeksha","deeksha123"};
		jdbcTemplate.update(sql,params);
		System.out.println("success! data inserted");
	}
}
