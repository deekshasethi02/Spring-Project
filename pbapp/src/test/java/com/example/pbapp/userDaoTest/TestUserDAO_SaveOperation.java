package com.example.pbapp.userDaoTest;



import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Date;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.pbapp.configuration.SpringRootConfig;
import com.example.pbapp.dao.UserDAO;
import com.example.pbapp.domain.User;

public class TestUserDAO_SaveOperation {

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchProviderException {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class); //spring root config has data source bean 
		UserDAO userDAO =ctx.getBean(UserDAO.class);
		User user = new User();
		user.setName("ashwini");
		user.setEmail("a@m");
		user.setStatus(1);
		user.setRole(2);
		user.setLoginName("ashwini");
		user.setPassword("ashwini123");
		user.setCreated_at(new Date());
		user.setUpdated_at(new Date());
		userDAO.save(user);
		System.out.println("success! data inserted");
	}
}
