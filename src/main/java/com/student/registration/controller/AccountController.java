package com.student.registration.controller;

import com.student.registration.model.ClassList;
import com.student.registration.model.User;
import com.student.registration.service.ClassListService;
import com.student.registration.service.UserService;
import com.student.registration.vo.ClassListFormBean;
import com.student.registration.vo.PageBean;
import com.student.registration.vo.UserFormBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
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

            ClassListFormBean classListFormBean = new ClassListFormBean();
            classListFormBean.setClassName("");
            classListFormBean.setCreateMan("");
            //List<ClassList> objList =classListService.selectByClassName(className);
            int count = classListService.countClassListByClassNameAndCreateMan(classListFormBean);  //获取数据库中记录总条数
            logger.info("c ount:"+count);
            PageBean pageBean = new PageBean();
            pageBean.setCacheBegin(0);
            pageBean.setCacheSize(100);
            pageBean.setTotalCount(count);
            pageBean.setListCount(10);
            pageBean.setTotalPages((count-1)/pageBean.getListCount()+1);

            //返回结果
            List<ClassList> classLists = classListService.selectByClassNameAndCreateManAndLimit(classListFormBean, pageBean);  //根据page，offset查询对应的记录
            classListFormBean.setClassLists(classLists); //将结果返回给Bean

            //List<ClassList> objList =classListService.listByLimit(0,20,0);
            map.put("objList", classLists);

            //PageBean pageListBean = new PageBean();
            map.put("pageBean", pageBean);

            return "index";
        }

        userService.add(u);
        return "register1";
	}

	/* 此方法实现网页分页机制 */
	/* 参数：
		page:需要访问的页数（如需要访问第1页，则输入1。规定首页为0，末页为-1）
		offset:每页显示的记录条数
		classname
		createman
	*/
	@RequestMapping("/pagelist")
	public @ResponseBody ClassListFormBean pageList(ClassListFormBean classListFormBean) throws Exception
	{
//		ClassListFormBean classListFormBean = new ClassListFormBean();

//		if(classListFormBean.getOffset() <= 0)
//			classListFormBean.setOffset(10);
//		if(classListFormBean.getPage() <= 1 && classListFormBean.getPage() != -1) //如果访问首页
//		{
//			classListFormBean.setHasPrev(false);
//			classListFormBean.setPage(1);
//		}
//
//		int count = classListService.countClassListByClassNameAndCreateMan(classListFormBean);  //获取数据库中记录总条数
////		System.out.println("count:" + count);
//		classListFormBean.setTotalpage((int)Math.ceil(count / (float)classListFormBean.getOffset()));  //计算总页数
//
//		if(classListFormBean.getPage() == -1 || (int)Math.ceil(count / (float)classListFormBean.getOffset()) == classListFormBean.getPage())  //如果访问末页
//		{
//			classListFormBean.setHasNext(false);  //如果是末页则不可继续访问下一页
//			classListFormBean.setPage((int)Math.ceil(count / (float)classListFormBean.getOffset()));  //计算page，向上取整
//		}
//
//		List<ClassList> classLists = classListService.selectByClassNameAndCreateManAndLimit(classListFormBean);  //根据page，offset查询对应的记录
//		classListFormBean.setClassLists(classLists); //将结果返回给Bean

		return classListFormBean;
	}


    @RequestMapping("registerSubmitAction")
    public String registerSubmit(UserFormBean userFormBean,HttpServletRequest req,ModelMap map) throws Exception {
        System.out.println("registerSubmit");
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
            return "registerFailure";  //跳转到registerFailure.jsp;
        userService.add(u);
        return "login";  //跳转到registerSuccess.jsp;
    }

    @RequestMapping("registerAction")
    public String redirect2register(HttpServletRequest req, ModelMap map) throws Exception {
        System.out.println("redirect2register");
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
