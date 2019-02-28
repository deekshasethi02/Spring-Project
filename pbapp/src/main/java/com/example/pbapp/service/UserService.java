package com.example.pbapp.service;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.List;

import com.example.pbapp.domain.User;
import com.example.pbapp.exception.BlockUserException;
import com.example.pbapp.exception.UserAlreadyExistsException;

/**
 * this service is responsible for all Business related requirements of user 
 * @author deeksha.sethi
 *
 */
public interface UserService {
	
	public static final Integer USER_STATUS_ACTIVE = 1;
	public static final Integer USER_STATUS_BLOCKED = 2;
	public static final Integer ROLE_ADMIN = 1;
	public static final Integer ROLE_USER = 2;
	
	
	/**
	 * This method will register the user based on user provided in the method.
	 * If login name already exists,this method should throw UserAlreadyExistsException
	 * @param user to be registered
	 * @throws UserAlreadyExistsException 
	 * @throws NoSuchProviderException 
	 * @throws NoSuchAlgorithmException 
	 */
	public void register(User user) throws UserAlreadyExistsException, NoSuchAlgorithmException, NoSuchProviderException;
	/**
	 * This method handles the login operation (authentication) using given login name and password.
	 * If user is successfully logged in, this method will return the logged in user object, otherwise it will return null.
	 * When user is blocked, an exception will be thrown by this method.
	 * @param loginname of user
	 * @param password of user
	 * @return User object in case of successful login otherwise null
	 * @throws BlockUserException will be generated if user account is blocked.
	 */
	public User login(String loginname,String password) throws BlockUserException;
	/**
	 * This method will return the list of registered users.
	 * @return List<User> of user
	 */
	public List<User> getUserList();
	/**
	 * This method changes the user login status for the details passed as argument.
	 * @param userId of user whose status will be changed
	 * @param loginStatus of user to be changed
	 */
	public void changeLoginStatus(Integer userId,Integer loginStatus);
 	
}
