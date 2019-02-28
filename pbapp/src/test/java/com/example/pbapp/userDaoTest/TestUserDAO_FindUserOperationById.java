package com.example.pbapp.userDaoTest;



import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.pbapp.configuration.SpringRootConfig;
import com.example.pbapp.dao.UserDAO;
import com.example.pbapp.domain.User;

public class TestUserDAO_FindUserOperationById {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class); //spring root config has data source bean 
		UserDAO userDAO =ctx.getBean(UserDAO.class);
		User  user = userDAO.findById(5);
		System.out.println("success! user found");
		System.out.println("name : "+user.getName());
	}
}
