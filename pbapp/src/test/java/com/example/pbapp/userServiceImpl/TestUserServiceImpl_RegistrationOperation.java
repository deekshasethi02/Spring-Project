package com.example.pbapp.userServiceImpl;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.pbapp.configuration.SpringRootConfig;
import com.example.pbapp.domain.User;
import com.example.pbapp.exception.UserAlreadyExistsException;
import com.example.pbapp.service.UserService;

public class TestUserServiceImpl_RegistrationOperation {
	
	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchProviderException, UserAlreadyExistsException {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		UserService userService = ctx.getBean(UserService.class);
		// user information will be received by user registration form
		User user = new User();
		user.setName("deeksha");
		user.setEmail("deeksha@yash");
		user.setStatus(userService.USER_STATUS_ACTIVE); 
		user.setRole(userService.ROLE_USER); 
		user.setLoginName("deeksha");
		user.setPassword("deeksha1");
		//SimpleDateFormat sdf =  new SimpleDateFormat("dd-mm-yyyy");
		Date date =  new Date();
		user.setCreated_at(date);
		user.setUpdated_at(date);
		userService.register(user);

		System.out.println("Success! User Registered");
}
}