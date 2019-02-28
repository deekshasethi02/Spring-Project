package com.example.userapp.daoimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.example.userapp.rowmapper.UserRowMapper;
import com.example.userapp.dao.BaseDAO;
import com.example.userapp.dao.UserDAO;
import com.example.userapp.domain.User;
import com.example.userapp.exception.UserIdException;

@Repository
public class UserDAOImpl extends BaseDAO implements UserDAO {

	@Override
	public void save(User user) {
		
		String sql = "INSERT INTO users(name) VALUES(:name)";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", user.getName());
		SqlParameterSource paramSource = new MapSqlParameterSource(params);
		getNamedParameterJdbcTemplate().update(sql, paramSource);
	
	}

	@Override
	public void update(User user) {
		String sql = "UPDATE users SET name=:name where id=:id";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", user.getName());
		params.put("id", user.getId());
		SqlParameterSource paramSource = new MapSqlParameterSource(params);
		getNamedParameterJdbcTemplate().update(sql, paramSource);
		
	}

//	@Override
//	public void delete(Integer userId) {
//		String sql = "DELETE FROM users WHERE id=?";
//		getJdbcTemplate().update(sql,userId);
//	}

	@Override
	public int delete(Integer id) {
		String sql = "DELETE FROM users where id = ?";
		int size =  getJdbcTemplate().update(sql, id);
		if(size == 0) {
			throw new UserIdException("Not Exist");
		}
		return id;
		
	}
//	@Override
//	public void delete(User user) {
//		this.delete(user.getId());;
//		
//	}

	@Override
	public User findById(Integer userId) {
		String sql = "SELECT * FROM users WHERE id = ?";
		User user = getJdbcTemplate().queryForObject(sql,new UserRowMapper(), userId);
		return user;
	}

	@Override
	public List<User> findAll() {
		String sql = "SELECT * FROM users";
		List<User> users = getJdbcTemplate().query(sql, new UserRowMapper());
			return users;
	}
	@Override
	public List<User> findByProperty(String propertyName, Object propertyValue) {
		String sql = "SELECT * FROM users where "+propertyName+"=?";
		List<User> users  = getJdbcTemplate().query(sql,new UserRowMapper(),propertyValue);
		return users;
	}
	
}
