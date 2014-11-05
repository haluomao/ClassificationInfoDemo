package com.student.registration.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.student.registration.model.ClassList;
import com.student.registration.model.User;
import com.student.registration.service.ClassListService;
import com.student.registration.service.UserService;
import com.student.registration.util.JsonUtil;
import com.student.registration.vo.ClassListFormBean;
import com.student.registration.vo.UserFormBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;


/**
 * Handler ajax request
 */
@Scope("prototype")
@Controller
public class ClassificationController {
    public static final Logger logger = LoggerFactory.getLogger(ClassificationController.class);

    private ClassListService classListService;

    @Resource(name="ClassListServiceImpl")
    public void setClassListService(ClassListService classListService) {
        this.classListService = classListService;
    }

    public ClassListService getClassListService() {
        return classListService;
    }

    @RequestMapping("searchAction")
    public String searchByPara(HttpServletRequest req, ModelMap map) throws Exception
    {
        logger.info("searchByPara method");
        logger.info(req.getRequestURI());

        //获取
        String className = req.getParameter("className");
        String createMan = req.getParameter("createMan");

        logger.info("className:" + className);
        logger.info("createMan:" + createMan);

        List<ClassList> objList =classListService.selectByClassName(className);
        map.put("objList", objList);
        return "index";
    }

//    @RequestMapping(value = "ajaxSearchAction", method = RequestMethod.POST)
//    public void ajaxSearchAction(HttpServletRequest req,
//                           HttpServletResponse response,ClassListFormBean classListFormBean) throws Exception {
//        logger.info("ajaxSearchAction method(post)");
//        String classNameAjax = req.getParameter("classNameAjax");
//		String createManAjax = req.getParameter("createManAjax");
//		int page = Integer.parseInt(req.getParameter("page"));
//		int offset = Integer.parseInt(req.getParameter("offset"));
//        logger.info("classNameAjax:" + classNameAjax);
//		logger.info("createManAjax:" + createManAjax);
//		logger.info("page:" + page);
//		logger.info("offset:" + offset);
//
//		System.out.println("lalala:" + classListFormBean.getOffset());
//
//        List<ClassList> objList = classListService.selectByClassName(classNameAjax);
//        String jsonString = JsonUtil.getMapper().writeValueAsString(objList);
//        logger.info("Json result", jsonString);
//        PrintWriter printWriter = response.getWriter();
//        printWriter.write(jsonString);
//        printWriter.flush();
//        printWriter.close();
//    }

	@RequestMapping(value = "ajaxSearchAction", method = RequestMethod.POST)
	public @ResponseBody ClassListFormBean ajaxSearchAction(HttpServletResponse response,ClassListFormBean classListFormBean) throws Exception {

//		System.out.println(classListFormBean);

		if(classListFormBean.getOffset() <= 0)
			classListFormBean.setOffset(10);
		if(classListFormBean.getPage() <= 1 && classListFormBean.getPage() != -1) //如果访问首页
		{
			classListFormBean.setHasPrev(false);
			classListFormBean.setPage(1);
		}

		int count = classListService.countClassListByClassNameAndCreateMan(classListFormBean);  //获取数据库中记录总条数
		classListFormBean.setTotalCount(count);  //计算总页数
		classListFormBean.setTotalPage((int)Math.ceil(count / (float)classListFormBean.getOffset()));  //计算总页数

		if(classListFormBean.getPage() == -1 || (int)Math.ceil(count / (float)classListFormBean.getOffset()) == classListFormBean.getPage())  //如果访问末页
		{
			classListFormBean.setHasNext(false);  //如果是末页则不可继续访问下一页
			classListFormBean.setPage((int)Math.ceil(count / (float)classListFormBean.getOffset()));  //计算page，向上取整
		}

		List<ClassList> classLists = classListService.selectByClassNameAndCreateManAndLimit(classListFormBean);  //根据page，offset查询对应的记录
		classListFormBean.setClassLists(classLists); //将结果返回给Bean

		System.out.println(classListFormBean);

		return classListFormBean;

//		String jsonString = JsonUtil.getMapper().writeValueAsString(classListFormBean);
//
//		logger.info("Json result", jsonString);
//		logger.info(jsonString);
//		PrintWriter printWriter = response.getWriter();
//		printWriter.write(jsonString);
//		printWriter.flush();
//		printWriter.close();
	}

    @RequestMapping(value = "ajaxSearchTest", method=RequestMethod.GET)
    public void ajaxSearchTest(HttpServletRequest req,
                           String classNameAjax, PrintWriter printWriter) throws Exception {
        logger.info("ajaxSearch method");
        String className = req.getParameter("classNameAjax");
        logger.info("classNameAjax:" + classNameAjax);

        List<ClassList> objList = classListService.selectByClassName(classNameAjax);
        String jsonString = JsonUtil.getMapper().writeValueAsString(objList);
        logger.info("Json result", jsonString);
        printWriter.write(jsonString);
        printWriter.flush();
        printWriter.close();
    }
}
