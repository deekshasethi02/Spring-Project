package com.example.pbapp.dao;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.List;

import com.example.pbapp.domain.User;

/**
 * This UserDAO is used to perform CRUD operations related to user
 * 
 * @author deeksha.sethi
 *
 */
public interface UserDAO {
	public static final Integer USER_STATUS_ACTIVE = 1;
	public static final Integer USER_STATUS_BLOCKED = 2;
	public static final Integer ROLE_ADMIN = 1;
	public static final Integer ROLE_USER = 2;

	public void save(User user) throws NoSuchAlgorithmException, NoSuchProviderException;

	public void update(User user);

	public void delete(Integer userId);

	public void delete(User user);

	public User findById(Integer userId);

	public List<User> findAll();

	public List<User> findByProperty(String propertyName, Object propertyValue);
}
