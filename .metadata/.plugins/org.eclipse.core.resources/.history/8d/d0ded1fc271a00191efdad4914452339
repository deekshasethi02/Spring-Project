package com.example.pbapp.userDaoTest;



import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.userapp.configuration.SpringRootConfig;
import com.example.userapp.dao.UserDAO;
import com.example.userapp.domain.User;

public class TestUserDAO_DeleteOperationById {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class); //spring root config has data source bean 
		UserDAO userDAO =ctx.getBean(UserDAO.class);
		userDAO.delete(1);
		System.out.println("success! user deleted");
	}
}
