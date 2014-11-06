package com.student.registration.controller;

import com.student.registration.model.ClassList;
import com.student.registration.model.User;
import com.student.registration.service.ClassListService;
import com.student.registration.service.UserService;
import com.student.registration.vo.UserFormBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Scope("prototype")
@Controller("AccountController")
public class AccountController {
    public static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    private UserService userService;

	private ClassListService classListService;

	public ClassListService getClassListService() {
		return classListService;
	}

	@Resource(name="ClassListServiceImpl")
	public void setClassListService(ClassListService classListService) {
		this.classListService = classListService;
	}

	public UserService getUserService() {
		return userService;
	}

	@Resource(name="UserServiceImpl")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("login.do")
	public String login(UserFormBean userFormBean,HttpServletRequest req, ModelMap map) throws Exception
    {
        logger.info("login method");

        //获取
        User u= new User();
        u.setUsername(userFormBean.getUsername());
        u.setPassword(userFormBean.getPassword());

        System.out.println("username:" + userFormBean.getUsername());
        System.out.println("password:" + userFormBean.getPassword());

        if(userService.exists(u)){
            logger.info("user exist.");
            map.put("user", u);
            List<ClassList> objList =classListService.listByLimit(0,20,0);
            map.put("objList", objList);
            return "index";
        }

        userService.add(u);
        return "register";
	}

	@RequestMapping(value="usercheck",method= RequestMethod.POST)
	public @ResponseBody String userCheck(UserFormBean userFormBean) throws Exception{
		String username = userFormBean.getUsername();
		String password = userFormBean.getPassword();
		System.out.println("username:" + username);
		System.out.println("password:" + password);

		User u= new User();
		u.setUsername(userFormBean.getUsername());
		u.setPassword(userFormBean.getPassword());
		if(userService.exists(u)) {
			System.out.println("user exist.");
			User u1 = userService.getUserByUsername(u.getUsername());
			System.out.println("u1:" + u1.getPassword());
			System.out.println("u:" + u.getPassword());
			if (u1.getPassword().equals(u.getPassword())) {
				System.out.println("success_1");
				return "success";
			}
			else {
				System.out.println("failure_1");
				return "failure";
			}
		}
		else
		{
			System.out.println("failure_2");
			return "failure";
		}
	}

	@RequestMapping(value="register.html")
	public String redirectTo_register(ModelMap map) throws Exception {
		return "register";  //跳转到registerSuccess.jsp;
	}

	@RequestMapping(value="login.html")
	public String redirectTo_login(ModelMap map) throws Exception {
		return "login";  //跳转到registerSuccess.jsp;

	}

	//@Override  //不带参数访问时的默认方法
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("HelloController.handelRequest()");
		req.setAttribute("a", "aaaa");  //设置返回数据
		User u = new User();
		u.setUsername(req.getParameter("username"));
		u.setPassword(req.getParameter("password"));
		if(userService.exists(u))
			return new ModelAndView("registerFailure");  //跳转到registerFailure.jsp;
		userService.add(u);
		return new ModelAndView("registerSuccess");  //跳转到registerSuccess.jsp;
	}
	
}
