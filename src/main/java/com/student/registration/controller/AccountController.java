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
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Scope("prototype")
@Controller
public class AccountController {
    public static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    private ClassListService classListService;

    @Resource(name="ClassListServiceImpl")
    public void setClassListService(ClassListService classListService) {
        this.classListService = classListService;
    }

    public ClassListService getClassListService() {
        return classListService;
    }


    private UserService userService;

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
