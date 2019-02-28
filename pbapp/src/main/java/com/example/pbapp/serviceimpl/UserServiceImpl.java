package com.example.pbapp.serviceimpl;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

import com.example.pbapp.dao.BaseDAO;
import com.example.pbapp.dao.UserDAO;
import com.example.pbapp.domain.User;
import com.example.pbapp.exception.BlockUserException;
import com.example.pbapp.exception.ContactAlreadyExistsException;
import com.example.pbapp.exception.UserAlreadyExistsException;
import com.example.pbapp.rowmapper.UserRowMapper;
import com.example.pbapp.service.UserService;

@Service
public class UserServiceImpl extends BaseDAO implements UserService {

	@Autowired
	private UserDAO userDAO;

	public void register(User user) throws UserAlreadyExistsException, NoSuchAlgorithmException, NoSuchProviderException {
		   if(userDAO.findByProperty("name",user.getName()).size()>0) {
	            throw new UserAlreadyExistsException("login name Already exist.. Please try another login name");
	        }else {
	            userDAO.save(user);
	        }
	}

	public User login(String loginname, String password) throws BlockUserException {
		
		String sql = "SELECT * FROM users WHERE loginname=:loginname AND password=:password";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("loginname", loginname);
		params.put("password", password);
		
		try {
			 User user = getNamedParameterJdbcTemplate().queryForObject(sql,params, new UserRowMapper());
			 if (user.getStatus().equals(USER_STATUS_BLOCKED)) {
				throw new BlockUserException("you are blocked!");
			}else {
				return user;
			}
		} catch (EmptyResultDataAccessException ex) {
			return null;
		}
	}

	public List<User> getUserList() {
		return userDAO.findAll();
	}

	public void changeLoginStatus(Integer userId, Integer loginStatus) {
		User user = userDAO.findById(userId);
		user.setStatus(loginStatus);
		userDAO.update(user);

	}

}
