package com.example.pbapp.daoimpl;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.example.pbapp.dao.BaseDAO;
import com.example.pbapp.dao.UserDAO;
import com.example.pbapp.domain.User;
import com.example.pbapp.rowmapper.UserRowMapper;
import com.example.pbapp.util.SecurePasswordUtil;
@Repository
public class UserDAOImpl extends BaseDAO implements UserDAO{

	public void save(User user) throws NoSuchAlgorithmException, NoSuchProviderException {
		String sql = "INSERT INTO users(name,email,status,role,loginname,password,created_at,updated_at) VALUES(:name,:email,:status,:role,:loginname,:password,:created_at,:updated_at)";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", user.getName());
		params.put("email", user.getEmail());
		params.put("status",user.getStatus());
		params.put("role", user.getRole());
		params.put("loginname", user.getLoginName());
		String passwordToHash = user.getPassword();
		//byte[] salt = SecurePasswordUtil.getSalt();
		//String securePassword = SecurePasswordUtil.getSecurePassword(passwordToHash, salt);
		String securePassword = SecurePasswordUtil.getSecurePassword(passwordToHash);
		params.put("password", securePassword);
		params.put("created_at", user.getCreated_at());
		params.put("updated_at", user.getUpdated_at());
		
		SqlParameterSource paramSource = new MapSqlParameterSource(params);
		KeyHolder keyHolder = new GeneratedKeyHolder();
		getNamedParameterJdbcTemplate().update(sql, paramSource, keyHolder);
		Integer id = keyHolder.getKey().intValue();
		user.setId(id);
	}

	public void update(User user) {
		
		String sql = "UPDATE users SET name=:name,phone = :phone , address = :address , email = :email, status = :status, role= :role,password= :password where id=:id";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", user.getName());
		params.put("phone", user.getPhone());
		params.put("address", user.getAddress());
		params.put("email", user.getEmail());
		params.put("status",user.getStatus());
		params.put("role", user.getRole());
		params.put("password", user.getPassword());
		params.put("id", user.getId());

		SqlParameterSource paramSource = new MapSqlParameterSource(params);
		getNamedParameterJdbcTemplate().update(sql, paramSource);

	}

	public void delete(Integer userId) {
		String sql = "DELETE FROM users WHERE id=?";
		getJdbcTemplate().update(sql,userId);
		
	}

	public void delete(User user) {
		this.delete(user.getId());
	}

	public User findById(Integer userId) {
		String sql = "SELECT * FROM users WHERE id = ?";
		User user = getJdbcTemplate().queryForObject(sql,new UserRowMapper(), userId);
		return user;
	}

	public List<User> findAll() {
		String sql = "SELECT * FROM users";
		List<User> users = getJdbcTemplate().query(sql, new UserRowMapper());
			return users;
	}

	public List<User> findByProperty(String propertyName, Object propertyValue) {
		String sql = "SELECT * FROM users where "+propertyName+"=?";
		List<User> users  = getJdbcTemplate().query(sql,new UserRowMapper(),propertyValue);
		return users;
	}

}
