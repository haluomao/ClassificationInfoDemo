package com.student.registration.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.student.registration.dao.UserMapper;
import com.student.registration.model.User;
import com.student.registration.model.UserExample;
import com.student.registration.service.UserService;

@Component("UserServiceImpl")
public class UserServiceImpl implements UserService{
	
	private UserExample userExample;
	private UserMapper userMapper;
	
	@Override
	public boolean exists(User u) throws Exception{
		System.out.println(u.getUsername());
//		userExample = new UserExample();
		userExample.createCriteria().andUsernameEqualTo(u.getUsername());  //username=u.username
		int count = userMapper.countByExample(userExample);
		userExample.clear();
		System.out.println(count);
		if(count == 0)
			return false;
		else
			return true;
	}
	
	@Override
	public void add(User u) throws Exception{
		userMapper.insert(u);
	}
	
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return this.userMapper.selectByExample(userExample);
	}
	
	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return this.userMapper.selectByPrimaryKey(id);
	}

	@Override
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		UserExample userExample = new UserExample();
		userExample.createCriteria().andUsernameEqualTo(username);
		User user = userMapper.selectByExample(userExample).get(0);
		userExample.clear();
		return user;
	}
	
	public UserExample getUserExample() {
		return userExample;
	}

	@Resource(name="UserExample")
	public void setUserExample(UserExample userExample) {
		this.userExample = userExample;
	}
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	@Resource(name="UserMapper")
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	
}
