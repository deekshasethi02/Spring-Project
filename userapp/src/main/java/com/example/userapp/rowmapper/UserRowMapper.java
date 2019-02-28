package com.example.userapp.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.userapp.domain.User;



public class UserRowMapper implements RowMapper<User> {

		public User mapRow(ResultSet rs, int arg1) throws SQLException {
			User user  = new User();
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			return user;
		}
}
