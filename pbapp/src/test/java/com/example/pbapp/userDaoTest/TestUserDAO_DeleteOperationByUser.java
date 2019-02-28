package com.example.pbapp.userDaoTest;



import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.pbapp.configuration.SpringRootConfig;
import com.example.pbapp.dao.UserDAO;
import com.example.pbapp.domain.User;

public class TestUserDAO_DeleteOperationByUser {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class); //spring root config has data source bean 
		UserDAO userDAO =ctx.getBean(UserDAO.class);
		User user = new User();
		user.setId(4);
//		user.setName("deeksha sethi");
//		user.setPhone("34567");
//		user.setAddress("indore");
//		user.setEmail("d@s");
//		user.setStatus(2);
//		user.setRole(2);
//		user.setPassword("d123");
		
		userDAO.delete(user);
		System.out.println("success! user deleted");
	}
}
