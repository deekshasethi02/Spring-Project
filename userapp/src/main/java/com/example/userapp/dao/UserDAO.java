package com.example.userapp.dao;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.List;

import com.example.userapp.domain.User;

public interface UserDAO {
	
	public void save(User user) ;

	public void update(User user);

	public int delete(Integer userId);



	public User findById(Integer userId);

	public List<User> findAll();

	List<User> findByProperty(String propertyName, Object propertyValue);


}
