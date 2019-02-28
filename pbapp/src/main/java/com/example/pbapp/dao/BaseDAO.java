package com.example.pbapp.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

//NOTE : Do not use @Service , @Repository, @Component annotation here. It is not Spring managed object.
// 		User does not need to create its object any where.
 
abstract public class BaseDAO extends NamedParameterJdbcDaoSupport{
	
	@Autowired
	public void setDataSource2(DataSource dataSource) {
		super.setDataSource(dataSource);
	}
}
