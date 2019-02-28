package com.yash.pbapp.dao;

import com.yash.pbapp.domain.User;

public interface UserDAO {

	public void save(User user);
	
	public void delete(int id);
}
