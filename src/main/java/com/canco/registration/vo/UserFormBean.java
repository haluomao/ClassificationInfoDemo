package com.canco.registration.vo;

import org.hibernate.validator.constraints.Length;

public class UserFormBean {
    @Length(max = 32, min=6)
	private String username;

    @Length(max = 32, min=6)
	private String password;

	private int id;

	@Length(max = 64, min=8)
	private String email;
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
