package com.student.registration.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.registration.model.User;

@Controller
@RequestMapping("myajax.do")
public class MyAjaxController {
	
	@RequestMapping(params="method=test1",method=RequestMethod.GET)
	public @ResponseBody List<User> test1(String username) throws Exception{ 
		String username2 = username;
		System.out.println("username2:" + username2); 
		System.out.println("MyAjaxController.test1()");
		List<User> list = new ArrayList<User>();
		list.add(new User("蔡栩阳","123"));
		list.add(new User("dzkdlj","456"));
		
		return list;
	}
	
}
