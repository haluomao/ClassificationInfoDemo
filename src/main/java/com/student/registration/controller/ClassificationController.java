package com.student.registration.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.student.registration.model.ClassList;
import com.student.registration.model.User;
import com.student.registration.service.ClassListService;
import com.student.registration.service.UserService;
import com.student.registration.util.JsonUtil;
import com.student.registration.vo.UserFormBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

        List<ClassList> objList =classListService.selectByName(className);
        map.put("objList", objList);
        return "index";
    }

    @RequestMapping(value = "ajaxSearchAction", method = RequestMethod.POST)
    public void ajaxSearchAction(HttpServletRequest req,
                           HttpServletResponse response) throws Exception {
        logger.info("ajaxSearchAction method(post)");
        String className = req.getParameter("className");
        logger.info("classNameAjax:" + className);

        List<ClassList> objList = classListService.selectByName(className);
        String jsonString = JsonUtil.getMapper().writeValueAsString(objList);
        logger.info("Json result", jsonString);
        PrintWriter printWriter = response.getWriter();
        printWriter.write(jsonString);
        printWriter.flush();
        printWriter.close();
    }

    @RequestMapping(value = "ajaxSearchTest", method=RequestMethod.GET)
    public void ajaxSearchTest(HttpServletRequest req,
                           String classNameAjax, PrintWriter printWriter) throws Exception {
        logger.info("ajaxSearch method");
        String className = req.getParameter("classNameAjax");
        logger.info("classNameAjax:" + classNameAjax);

        List<ClassList> objList = classListService.selectByName(classNameAjax);
        String jsonString = JsonUtil.getMapper().writeValueAsString(objList);
        logger.info("Json result", jsonString);
        printWriter.write(jsonString);
        printWriter.flush();
        printWriter.close();
    }
}
