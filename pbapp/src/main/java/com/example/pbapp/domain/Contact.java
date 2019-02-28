package com.example.pbapp.domain;

import java.util.Date;

/**
 * This user model is used as a data traveller from layer to layer
 * 
 * @author deeksha.sethi
 *
 */
public class Contact extends Person{

	/**
	 * user id of user foreign key
	 */
	private Integer userId;

	/**
	 * group of contact like : family,friends, business etc.
	 */
	private String groupname;

	/**
	 * remark for contact
	 */
	private String remark;

	/**
	 * id of user who has created contact
	 */
	private Integer created_By;
	/**
	 * id of user who has updated contact
	 */
	private Integer updated_By;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getGroupName() {
		return groupname;
	}

	public void setGroupName(String group) {
		this.groupname = group;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getCreated_By() {
		return created_By;
	}

	public void setCreated_By(Integer created_By) {
		this.created_By = created_By;
	}

	public Integer getUpdated_By() {
		return updated_By;
	}

	public void setUpdated_By(Integer updated_By) {
		this.updated_By = updated_By;
	}

}
