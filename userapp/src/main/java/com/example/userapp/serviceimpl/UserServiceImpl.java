package com.example.userapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.userapp.dao.BaseDAO;
import com.example.userapp.dao.UserDAO;
import com.example.userapp.domain.User;
import com.example.userapp.exception.UserIdException;
import com.example.userapp.service.UserService;

@Service
public class UserServiceImpl extends BaseDAO implements UserService {

	@Autowired
	private UserDAO userDao;
	@Override
	public void save(User user) {
		userDao.save(user);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}
//
//	@Override
//	public void delete(Integer userId) {
//		userDao.delete(userId);
//		
//	}

	@Override
	public int delete(Integer id) {
	
		return userDao.delete(id);
		
	}
	@Override
	public User findById(Integer userId) {
		
		return userDao.findById(userId);
	}

	@Override
	public List<User> findAll() {
		
		List<User>users = userDao.findAll();
		if(users.size()==0) {
			throw new UserIdException("No user to display");
		}
		return users;
	}

	
}
