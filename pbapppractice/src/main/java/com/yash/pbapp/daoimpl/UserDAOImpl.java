package com.yash.pbapp.daoimpl;

import org.springframework.stereotype.Repository;

import com.yash.pbapp.dao.BaseDAO;
import com.yash.pbapp.dao.UserDAO;
import com.yash.pbapp.domain.User;

@Repository
public class UserDAOImpl extends BaseDAO  implements UserDAO{

	public void save(User user) {
		
		System.out.println("TODO:: DATA to be inserted here");
	}

	public void delete(int id) {
		
		
	}

}
