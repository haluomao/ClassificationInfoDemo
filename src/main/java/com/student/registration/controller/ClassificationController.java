package com.student.registration.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.student.registration.model.ClassList;
import com.student.registration.model.User;
import com.student.registration.service.ClassListService;
import com.student.registration.service.UserService;
import com.student.registration.util.JsonUtil;
import com.student.registration.vo.ClassListFormBean;
import com.student.registration.vo.PageBean;
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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
    @ResponseBody
    public ClassListFormBean ajaxSearchAction(HttpServletResponse response,ClassListFormBean classListFormBean) throws Exception {

//		System.out.println(classListFormBean);

//        if(classListFormBean.getOffset() <= 0)
//            classListFormBean.setOffset(10);
//        if(classListFormBean.getPage() <= 1 && classListFormBean.getPage() != -1) //如果访问首页
//        {
//            classListFormBean.setHasPrev(false);
//            classListFormBean.setPage(1);
//        }
//
//        int count = classListService.countClassListByClassNameAndCreateMan(classListFormBean);  //获取数据库中记录总条数
////        classListFormBean.setTotalCount(count);  //计算总页数
////        classListFormBean.setTotalPage((int)Math.ceil(count / (float)classListFormBean.getOffset()));  //计算总页数
//
//        if(classListFormBean.getPage() == -1 || (int)Math.ceil(count / (float)classListFormBean.getOffset()) == classListFormBean.getPage())  //如果访问末页
//        {
//            classListFormBean.setHasNext(false);  //如果是末页则不可继续访问下一页
//            classListFormBean.setPage((int)Math.ceil(count / (float)classListFormBean.getOffset()));  //计算page，向上取整
//        }
//
//        List<ClassList> classLists = classListService.selectByClassNameAndCreateManAndLimit(classListFormBean);  //根据page，offset查询对应的记录
//        classListFormBean.setClassLists(classLists); //将结果返回给Bean
//
//        System.out.println(classListFormBean);
//
//        return classListFormBean;

//		String jsonString = JsonUtil.getMapper().writeValueAsString(classListFormBean);
//
//		logger.info("Json result", jsonString);
//		logger.info(jsonString);
//		PrintWriter printWriter = response.getWriter();
//		printWriter.write(jsonString);
//		printWriter.flush();
//		printWriter.close();
        return null;
    }

    @RequestMapping("classListSearchNormalAction")
    public String classListSearchNormal(HttpServletRequest req, ModelMap map) throws Exception
    {
        logger.info("classListSearchNormalAction method");
        logger.info(req.getRequestURI());

        //获取
        String className = req.getParameter("className");
        String createMan = req.getParameter("createMan");

        logger.info("className:" + className);
        logger.info("createMan:" + createMan);

        ClassListFormBean classListFormBean = new ClassListFormBean();
        classListFormBean.setClassName(className);
        classListFormBean.setCreateMan(createMan);
        //List<ClassList> objList =classListService.selectByClassName(className);
        int count = classListService.countClassListByClassNameAndCreateMan(classListFormBean);  //获取数据库中记录总条数
        logger.info("count:"+count);
        PageBean pageBean = new PageBean();
        pageBean.setCacheBegin(0);
        pageBean.setCacheSize(100);
        pageBean.setTotalCount(count);
        pageBean.setListCount(10);
        pageBean.setTotalPages((count-1)/pageBean.getListCount()+1);

        //返回结果
        List<ClassList> classLists = classListService.selectByClassNameAndCreateManAndLimit(classListFormBean, pageBean);  //根据page，offset查询对应的记录
        classListFormBean.setClassLists(classLists); //将结果返回给Bean

//        System.out.println(classListFormBean);
//        System.out.println(pageBean);
//
//        Map<String,Object> result = new HashMap<String,Object>();
        logger.info(pageBean.toString());
        map.put("pageBean",pageBean);
        map.put("classListFormBean",classListFormBean);
        map.put("objList", classLists);
        return "index";
    }

    @RequestMapping("classListModifyAction")
    public String classListModifyAction(HttpServletRequest req, ModelMap map) throws Exception
    {
        logger.info("classListModifyAction method");

        //获取
        String className = req.getParameter("className");
        String createMan = req.getParameter("createMan");
        String defaultStatName = req.getParameter("defaultStatName");
        int classId = Integer.valueOf(req.getParameter("classId"));

        logger.info("className:" + className);
        logger.info("createMan:" + createMan);

        ClassList classList = classListService.selectByClassId(classId);
        classList.setClassName(className);
        classList.setCreateMan(createMan);
        classList.setDefaultStatName(defaultStatName);
        classList.setModifyDate(new Date());
        classListService.modifyOneRecord(classList);

        ClassListFormBean classListFormBean = new ClassListFormBean();
        classListFormBean.setClassName("");
        classListFormBean.setCreateMan("");
        //List<ClassList> objList =classListService.selectByClassName(className);
        int count = classListService.countClassListByClassNameAndCreateMan(classListFormBean);  //获取数据库中记录总条数
        logger.info("count:"+count);
        PageBean pageBean = new PageBean();
        pageBean.setCacheBegin(0);
        pageBean.setCacheSize(100);
        pageBean.setTotalCount(count);
        pageBean.setListCount(10);
        pageBean.setTotalPages((count-1)/pageBean.getListCount()+1);

        //返回结果
        List<ClassList> classLists = classListService.selectByClassNameAndCreateManAndLimit(classListFormBean, pageBean);  //根据page，offset查询对应的记录
        classListFormBean.setClassLists(classLists); //将结果返回给Bean

//        System.out.println(classListFormBean);
//        System.out.println(pageBean);
//
//        Map<String,Object> result = new HashMap<String,Object>();
        logger.info(pageBean.toString());
        map.put("pageBean",pageBean);
        map.put("classListFormBean",classListFormBean);
        map.put("objList", classLists);
        return "index";
    }

    @RequestMapping(value = "classListSearchAction", method = RequestMethod.POST)
    @ResponseBody
    public Map classListSearch(ClassListFormBean classListFormBean, PageBean pageBean) throws Exception {
        //PageBean pageBean = classListFormBean.getPageBean();
        logger.info("pagebean ListCount:"+(pageBean==null?null:pageBean.getListCount()));
        logger.info("pagebean getCacheSize:"+(pageBean==null?null:pageBean.getCacheSize()));
        logger.info("pagebean getCacheBegin:"+(pageBean==null?null:pageBean.getCacheBegin()));
        logger.info("pagebean getCurrentPage:"+(pageBean==null?null:pageBean.getCurrentPage()));
//        if(classListFormBean.getOffset() <= 0)
//            classListFormBean.setOffset(10);
//        if(classListFormBean.getPage() <= 1 && classListFormBean.getPage() != -1) //如果访问首页
//        {
//            classListFormBean.setHasPrev(false);
//            classListFormBean.setPage(1);
//        }
//
//        int count = classListService.countClassListByClassNameAndCreateMan(classListFormBean);  //获取数据库中记录总条数
////        classListFormBean.setTotalCount(count);  //计算总页数
////        classListFormBean.setTotalPage((int)Math.ceil(count / (float)classListFormBean.getOffset()));  //计算总页数
//
//        if(classListFormBean.getPage() == -1 || (int)Math.ceil(count / (float)classListFormBean.getOffset()) == classListFormBean.getPage())  //如果访问末页
//        {
//            classListFormBean.setHasNext(false);  //如果是末页则不可继续访问下一页
//            classListFormBean.setPage((int)Math.ceil(count / (float)classListFormBean.getOffset()));  //计算page，向上取整
//        }

        int count = classListService.countClassListByClassNameAndCreateMan(classListFormBean);  //获取数据库中记录总条数

        pageBean.setCacheBegin(pageBean.getCacheBegin());
        pageBean.setCacheSize(100);
        pageBean.setTotalCount(count);
        pageBean.setTotalPages((count-1)/pageBean.getListCount()+1);

        //返回结果
        List<ClassList> classLists = classListService.selectByClassNameAndCreateManAndLimit(classListFormBean, pageBean);  //根据page，offset查询对应的记录
        classListFormBean.setClassLists(classLists); //将结果返回给Bean

        System.out.println(classListFormBean);
        System.out.println(pageBean);

        Map<String,Object> result = new HashMap<String,Object>();
        result.put("pageBean",pageBean);
        result.put("classListFormBean",classListFormBean);
        return result;
    }


    @RequestMapping("classListAddAction")
    public String classListAdd(ClassList classList, HttpServletRequest req, ModelMap map) throws Exception
    {
        logger.info("classListAddAction method");
        //获取
        String className = req.getParameter("className");
        String createMan = req.getParameter("createMan");

        logger.info("className:" + className);
        logger.info("createMan:" + createMan);

        classList.setDefaultIsCheck("1");
        classList.setDefaultUserYear(2014);
        classList.setDeprTypeId(1);
        classList.setModifyMan("修改人_" + 2014);
        classList.setClassType("t");
        classList.setCreateDate(new Date());
        int res=classListService.addClassList(classList);
        logger.info("res:" + res);

        ClassListFormBean classListFormBean = new ClassListFormBean();
        classListFormBean.setClassName("");
        classListFormBean.setCreateMan("");
        //List<ClassList> objList =classListService.selectByClassName(className);
        int count = classListService.countClassListByClassNameAndCreateMan(classListFormBean);  //获取数据库中记录总条数
        logger.info("count:"+count);
        PageBean pageBean = new PageBean();
        pageBean.setCacheBegin(0);
        pageBean.setCacheSize(100);
        pageBean.setTotalCount(count);
        pageBean.setListCount(10);
        pageBean.setTotalPages((count-1)/pageBean.getListCount()+1);

        //返回结果
        List<ClassList> classLists = classListService.selectByClassNameAndCreateManAndLimit(classListFormBean, pageBean);  //根据page，offset查询对应的记录
        classListFormBean.setClassLists(classLists); //将结果返回给Bean

        logger.info(pageBean.toString());
        map.put("pageBean",pageBean);
        map.put("classListFormBean",classListFormBean);
        map.put("objList", classLists);
        return "index";
    }

    @RequestMapping("classListDeleteAction")
    @ResponseBody
    public Map classListDelete(ClassListFormBean classListFormBean, PageBean pageBean, ClassList classList) throws Exception {
        //PageBean pageBean = classListFormBean.getPageBean();
        logger.info("pagebean ListCount:"+(pageBean==null?null:pageBean.getListCount()));
        logger.info("pagebean getCacheSize:"+(pageBean==null?null:pageBean.getCacheSize()));
        logger.info("pagebean getCacheBegin:"+(pageBean==null?null:pageBean.getCacheBegin()));
        logger.info("pagebean getCurrentPage:"+(pageBean==null?null:pageBean.getCurrentPage()));
        logger.info("classList getClassId:"+(classList==null?null:classList.getClassId()));

        classListService.deleteByClassId(classList==null?-1:classList.getClassId());

        int count = classListService.countClassListByClassNameAndCreateMan(classListFormBean);  //获取数据库中记录总条数

        pageBean.setCacheBegin(pageBean.getCacheBegin());
        pageBean.setCacheSize(100);
        pageBean.setTotalCount(count);
        pageBean.setTotalPages((count-1)/pageBean.getListCount()+1);

        //返回结果
        List<ClassList> classLists = classListService.selectByClassNameAndCreateManAndLimit(classListFormBean, pageBean);  //根据page，offset查询对应的记录
        classListFormBean.setClassLists(classLists); //将结果返回给Bean

        System.out.println(classListFormBean);
        System.out.println(pageBean);

        Map<String,Object> result = new HashMap<String,Object>();
        result.put("pageBean",pageBean);
        result.put("classListFormBean",classListFormBean);
        return result;
    }

    @RequestMapping("classListModifyActionAjax")
    @ResponseBody
    public Map classListModify(ClassListFormBean classListFormBean, PageBean pageBean, ClassList classList) throws Exception {
        //PageBean pageBean = classListFormBean.getPageBean();
        logger.info("pagebean ListCount:"+(pageBean==null?null:pageBean.getListCount()));
        logger.info("pagebean getCacheSize:"+(pageBean==null?null:pageBean.getCacheSize()));
        logger.info("pagebean getCacheBegin:"+(pageBean==null?null:pageBean.getCacheBegin()));
        logger.info("pagebean getCurrentPage:"+(pageBean==null?null:pageBean.getCurrentPage()));
        logger.info("classList getClassId:"+(classList==null?null:classList.getClassId()));

        classListService.modifyOneRecord(classList);

        int count = classListService.countClassListByClassNameAndCreateMan(classListFormBean);  //获取数据库中记录总条数

        pageBean.setCacheBegin(pageBean.getCacheBegin());
        pageBean.setCacheSize(100);
        pageBean.setTotalCount(count);
        pageBean.setTotalPages((count-1)/pageBean.getListCount()+1);

        //返回结果
        List<ClassList> classLists = classListService.selectByClassNameAndCreateManAndLimit(classListFormBean, pageBean);  //根据page，offset查询对应的记录
        classListFormBean.setClassLists(classLists); //将结果返回给Bean

        System.out.println(classListFormBean);
        System.out.println(pageBean);

        Map<String,Object> result = new HashMap<String,Object>();
        result.put("pageBean",pageBean);
        result.put("classListFormBean",classListFormBean);
        return result;
    }

    @RequestMapping(value = "ajaxSearchTest", method=RequestMethod.POST)
    public void ajaxSearchTest(HttpServletRequest req,
                               String classNameAjax, PrintWriter printWriter) throws Exception {
        logger.info("ajaxSearch method");
        String className = req.getParameter("className");
        logger.info("className:" + classNameAjax);

        List<ClassList> objList = classListService.selectByClassName(classNameAjax);
        String jsonString = JsonUtil.getMapper().writeValueAsString(objList);
        logger.info("Json result", jsonString);
        printWriter.write(jsonString);
        printWriter.flush();
        printWriter.close();
    }
}