package com.example.userapp.service;

import java.util.List;

import com.example.userapp.domain.User;

public interface UserService {
	
	public void save(User user) ;

	public void update(User user);

	public int delete(Integer id);


	public User findById(Integer userId);

	public List<User> findAll();

}
