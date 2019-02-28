package com.yash.pbapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.pbapp.dao.BaseDAO;
import com.yash.pbapp.dao.UserDAO;
import com.yash.pbapp.domain.User;

@Service
public class UserServiceImpl extends BaseDAO{

	@Autowired
	private UserDAO userDAO;
	
	public void save() {
		userDAO.save(new User());
	}

	
}
