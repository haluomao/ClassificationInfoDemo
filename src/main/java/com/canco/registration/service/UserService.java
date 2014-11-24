package com.canco.registration.service;

import java.util.List;

import com.canco.registration.model.User;

public interface UserService {
	
	public boolean exists(User u) throws Exception;
	
	public void add(User u) throws Exception;
	
	public List<User> getUsers();
	
	public User getUserById(int id);

	public User getUserByUsername(String username);
}
