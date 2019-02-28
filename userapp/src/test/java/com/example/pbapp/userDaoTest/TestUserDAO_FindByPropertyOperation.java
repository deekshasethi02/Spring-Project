package com.example.pbapp.userDaoTest;



import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.userapp.configuration.SpringRootConfig;
import com.example.userapp.dao.UserDAO;
import com.example.userapp.domain.User;

public class TestUserDAO_FindByPropertyOperation {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class); //spring root config has data source bean 
		UserDAO userDAO =ctx.getBean(UserDAO.class);

		
		List<User> users = userDAO.findByProperty("name","ashish");
		for (User user : users) {
			System.out.println("name :" +user.getName());
			System.out.println("id : "+user.getId() );
		}
		
		System.out.println("success!");
		
	}
}
