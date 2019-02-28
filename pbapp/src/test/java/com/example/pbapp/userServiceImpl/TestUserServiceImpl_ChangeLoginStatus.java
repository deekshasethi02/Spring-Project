package com.example.pbapp.userServiceImpl;



import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.pbapp.configuration.SpringRootConfig;
import com.example.pbapp.dao.UserDAO;
import com.example.pbapp.domain.User;
import com.example.pbapp.service.UserService;

public class TestUserServiceImpl_ChangeLoginStatus {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class); //spring root config has data source bean 
		UserService userService =ctx.getBean(UserService.class);
		userService.changeLoginStatus(5, 2);
		System.out.println("success!");
		
	}
}
