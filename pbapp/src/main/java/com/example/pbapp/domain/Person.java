package com.example.pbapp.domain;

import java.util.Date;

/**
 * This person model will hold the common fields of user and contact
 * 
 * @author deeksha.sethi
 *
 */
public class Person {
	/**
	 * id of person
	 */
	private Integer id;

	/**
	 * name of person
	 */
	private String name;
	/**
	 * phone number of person
	 */
	private String phone;
	/**
	 * address of person
	 */
	private String address;
	/**
	 * email of person
	 */
	private String email;
	/**
	 * created date of person
	 */
	private Date created_at;
	/**
	 * updated date of person
	 */
	private Date updated_at;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
}
