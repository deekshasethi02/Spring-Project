package com.example.pbapp.userServiceTest;



import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Date;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.userapp.configuration.SpringRootConfig;
import com.example.userapp.dao.UserDAO;
import com.example.userapp.domain.User;
import com.example.userapp.service.UserService;


public class TestUserDAO_SaveOperation {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class); //spring root config has data source bean 
		UserService userService =ctx.getBean(UserService.class);
		User user = new User();
		user.setName("adarsh");
		
		userService.save(user);
		System.out.println("success! data inserted");
	}
}
