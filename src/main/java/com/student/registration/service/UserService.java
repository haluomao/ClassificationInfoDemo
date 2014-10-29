package com.student.registration.service;

import java.util.List;

import com.student.registration.model.User;

public interface UserService {
	
	public boolean exists(User u) throws Exception;
	
	public void add(User u) throws Exception;
	
	public List<User> getUsers();
	
	public User getUserById(int id);
}
