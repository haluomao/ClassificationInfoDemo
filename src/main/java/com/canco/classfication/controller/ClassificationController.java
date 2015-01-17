package com.canco.classfication.controller;

import com.canco.classfication.model.ClassList;
import com.canco.classfication.service.ClassListService;
import com.canco.common.util.DataEditResponse;
import com.canco.common.util.DataRequest;
import com.canco.common.util.DataSearchResponse;
import com.canco.common.util.UtilMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * Handler ajax request
 */
@Scope("prototype")
@Controller
public class ClassificationController {
    public static final Logger logger = LoggerFactory.getLogger(ClassificationController.class);

    @Autowired
    private ClassListService classListService;

    /**
     * 包含 增 删 改
     * @param httpServletRequest
     * @return
     * @throws Exception
     */
    @RequestMapping("classListEdit")
    @ResponseBody
    public Map classListEdit(HttpServletRequest httpServletRequest) throws Exception
    {
        Map map = UtilMethod.TurnRequest2Map(httpServletRequest);
        logger.info("httpServletRequest:" + httpServletRequest.getParameterMap());
        logger.info("map:" + map);
        Map<String,Object> result = new HashMap<String,Object>();
        DataEditResponse editResponse = new DataEditResponse();
        try {
            if (map.containsKey("oper")) {
                String oper = (String) map.get("oper");
                if ("add".equals(oper)) {
                    ClassList entity = UtilMethod.ClassMakeup(ClassList.class, map);
                    System.out.println("user1:" + entity);
                    int res = classListService.add(entity);
                    if (res == 1) {
                        editResponse.setStatus("success");
                        editResponse.setMessage(oper + " succeed");
                    }
                } else if ("edit".equals(oper)) {
                    ClassList entity = UtilMethod.ClassMakeup(ClassList.class, map);
                    System.out.println("user1:" + entity);
                    int res = classListService.update(entity);
                    if (res == 1) {
                        editResponse.setStatus("success");
                        editResponse.setMessage(oper + " succeed");
                    }
                } else if ("del".equals(oper)) {
                    Set<Integer> idSet = UtilMethod.TurnString2Set((String)map.get("id"));/*fill*/
                    System.out.println("keySet:" + idSet);

                    editResponse.setStatus("success");
                    editResponse.setMessage(oper + " succeed");
                    for (Integer id : idSet) {
                        int res = classListService.delete(id);
                        if (res == 0) {
                            editResponse.setStatus("error");
                            editResponse.setMessage(oper + " failed");
                            break;
                        }
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            editResponse.setStatus("error");
            editResponse.setMessage("operation failed");
            logger.info(editResponse.toString());
            result.put("editResponse", editResponse);
            return result;
        }
        logger.info(editResponse.toString());
        result.put("editResponse", editResponse);
        return result;
    }

    @RequestMapping("classListSelectM")
    @ResponseBody
    public DataSearchResponse<ClassList> classListSearch(HttpServletRequest httpServletRequest, DataRequest dataRequest, ClassList entity) throws Exception
    {
        logger.info("dataRequest:" + dataRequest);
        logger.info("Entity:" + entity.getClass()+entity.toString());

        Map map = UtilMethod.TurnRequest2Map(httpServletRequest);
        DataSearchResponse<ClassList> dataResponse = null;
        try {
				dataResponse = search(map, dataRequest, entity, classListService);
        }catch(Exception e){
            e.printStackTrace();
        }
        return dataResponse;
    }


    //搜索
    public DataSearchResponse<ClassList> search(Map<String, Object> map, DataRequest request, ClassList entity, ClassListService classListService) {
        DataSearchResponse<ClassList> response = new DataSearchResponse<ClassList>();

        int limit = request.getRows() <= 0 ? 20 : request.getRows();//每页显示数量
        int totalPages;//总页数
        int page = request.getPage() <= 0 ? 1 : request.getPage();//当前显示页码
        int count;//总记录数

        count = classListService.count(map, entity);
        logger.info("Count:"+count);

        totalPages = count / limit;
        if (count % limit != 0) {totalPages++;}
        int currPage = Math.min(totalPages, page);
        int start = currPage * limit - limit;
        start = start < 0 ? 0 : start;

        String orderByClause = UtilMethod.TurnUpperCase2Underline(request.getSidx())+" "+request.getSord(); //如 ID desc
//        String orderByClause = request.getSidx()+" "+request.getSord();
        logger.info("orderByClause:"+orderByClause);
        List<ClassList> list;
        list = classListService.select(map, entity, orderByClause, start, limit);

        response.setRecords(count);
        response.setTotalpage(totalPages);
        response.setCurrentpage(currPage);
        response.setRows(list);
        logger.info("response:"+response);
        return response;
    }
}