package com.example.pbapp.domain;

import java.util.Date;

/**
 * This user model is used as a data traveller from layer to layer
 * 
 * @author deeksha.sethi
 *
 */
public class User extends Person{
	
	/**
	 * status of user 1: Active, 2: Block By default user will be active at
	 * registration time
	 */
	private Integer status;
	/**
	 * role of user 1: Admin , 2:User By default user will be User role at
	 * registration time
	 */
	private Integer role;
	/**
	 * login name of user
	 */
	private String loginName;
	/**
	 * password of user
	 */
	private String password;
	
		
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

}
