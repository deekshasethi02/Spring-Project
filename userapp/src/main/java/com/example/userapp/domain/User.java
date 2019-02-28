package com.example.userapp.domain;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class User {
	
	
	private int id;
	@NotBlank(message="name is Required")
	private String name;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
