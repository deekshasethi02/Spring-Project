package com.example.pbapp.userServiceTest;



import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.userapp.configuration.SpringRootConfig;
import com.example.userapp.domain.User;
import com.example.userapp.service.UserService;

public class TestUserDAO_FindAllUserOperation {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class); //spring root config has data source bean 
		UserService userService =ctx.getBean(UserService.class);
		List<User> users = userService.findAll();
		for (User user : users) {
			System.out.println("name :" +user.getName());
		}
		
		System.out.println("success!");
		
	}
}
