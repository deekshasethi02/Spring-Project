package com.example.pbapp.userServiceImpl;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.pbapp.configuration.SpringRootConfig;
import com.example.pbapp.domain.User;
import com.example.pbapp.exception.BlockUserException;
import com.example.pbapp.service.UserService;

public class TestUserServiceImpl_LoginOperation {

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchProviderException {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		UserService userService = ctx.getBean(UserService.class);
		User user;
		try {
			user = userService.login("arju", "arju123");
			if (user == null) {
				System.out.println("error in login and password");
			} else {
				System.out.println("Successfull! login for: " + user.getName());
			}
		} catch (BlockUserException e) {
			System.out.println(e.getMessage());
		}
	}
}