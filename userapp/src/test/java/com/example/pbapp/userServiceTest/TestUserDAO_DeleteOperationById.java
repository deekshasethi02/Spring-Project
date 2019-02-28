package com.example.pbapp.userServiceTest;



import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.userapp.configuration.SpringRootConfig;
import com.example.userapp.service.UserService;
import com.example.userapp.domain.User;

public class TestUserDAO_DeleteOperationById {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class); //spring root config has data source bean 
		UserService userService =ctx.getBean(UserService.class);
		userService.delete(5);
		System.out.println("success! user deleted");
	}
}
