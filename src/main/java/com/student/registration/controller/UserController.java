package com.student.registration.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.student.registration.model.User;
import com.student.registration.service.UserService;
import com.student.registration.vo.UserFormBean;

@Component("userController")
//@RequestMapping("user.do")  //请求url配置
@Scope("prototype")
//@SessionAttributes({"arg3"})
public class UserController implements Controller{
    public static final Logger logger = LoggerFactory.getLogger(UserController.class);
    private UserService userService;

    private List<User> users;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserService getUserService() {
        return userService;
    }

    @Resource(name="UserServiceImpl")
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @RequestMapping(params="method=reg4")
    public String reg4(UserFormBean userFormBean,HttpServletRequest req,ModelMap map) throws Exception {
        System.out.println("HelloController.reg4()");
        System.out.println(req.getRequestURI());
        logger.info("reg4!!!!");

        //	req.setAttribute("a", "aaaa");  //设置返回数据
        req.setAttribute("arg1", "requestValue");
        req.getSession().setAttribute("arg2", "sessionValue");
        map.addAttribute("arg3", "ModelMapValue3");
        map.addAttribute("arg4", "ModelMapValue4");
        User u = new User();
        u.setUsername(userFormBean.getUsername());
        u.setPassword(userFormBean.getPassword());

        System.out.println("username:" + userFormBean.getUsername());
        System.out.println("password:" + userFormBean.getPassword());

        if(userService.exists(u))
            return "register/registerFailure";  //跳转到registerFailure.jsp;
        userService.add(u);
        return "register/registerSuccess";  //跳转到registerSuccess.jsp;
    }


    @Override  //不带参数访问时的默认方法
    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        // TODO Auto-generated method stub
        System.out.println("HelloController.handelRequest()");
        req.setAttribute("a", "aaaa");  //设置返回数据
        User u = new User();
        u.setUsername(req.getParameter("username"));
        u.setPassword(req.getParameter("password"));
        if(userService.exists(u))
            return new ModelAndView("register/registerFailure");  //跳转到registerFailure.jsp;
        userService.add(u);
        return new ModelAndView("register/registerSuccess");  //跳转到registerSuccess.jsp;
    }

}
