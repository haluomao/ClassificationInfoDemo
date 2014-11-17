package com.student.registration.vo;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;

public class UserFormBean {
    @Length(max = 64)
	private String username;

    @Length(max = 64, min=10)
	private String password;

	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
