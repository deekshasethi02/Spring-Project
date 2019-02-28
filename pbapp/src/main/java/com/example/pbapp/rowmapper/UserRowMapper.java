package com.example.pbapp.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.pbapp.domain.User;
/**
 * This UserRowMapper will take input from result set and map each field in the user domain
 * @author deeksha.sethi
 *
 */
public class UserRowMapper implements RowMapper<User> {

	public User mapRow(ResultSet rs, int arg1) throws SQLException {
		User user  = new User();
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("name"));
		user.setPhone(rs.getString("phone"));
		user.setAddress(rs.getString("address"));
		user.setEmail(rs.getString("email"));
		user.setStatus(rs.getInt("status"));
		user.setRole(rs.getInt("role"));
		user.setLoginName(rs.getString("loginname"));
		user.setPassword(rs.getString("password"));
		user.setCreated_at(rs.getDate("created_at"));
		user.setUpdated_at(rs.getDate("updated_at"));
		return user;
	}

}
