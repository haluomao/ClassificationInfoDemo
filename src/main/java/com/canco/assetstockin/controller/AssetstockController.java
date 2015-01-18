package com.canco.assetstockin.controller;

import com.canco.assetstockin.model.AssetList;
import com.canco.assetstockin.model.AssetStockList;
import com.canco.assetstockin.model.StockInInfoList;
import com.canco.assetstockin.model.StockInList;
import com.canco.assetstockin.service.AssetService;
import com.canco.assetstockin.service.StockInInfoService;
import com.canco.assetstockin.service.StockInService;
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


/**
 * Handler ajax request
 */
@Scope("prototype")
@Controller
public class AssetstockController {
    public static final Logger logger = LoggerFactory.getLogger(AssetstockController.class);
    @Autowired
    private AssetService assetService;

    @Autowired
    private StockInInfoService stockInInfoService;

    @Autowired
    private StockInService stockInService;

    /**
     * 包含 增 删 改
     * @param httpServletRequest
     * @return
     * @throws Exception
     */
    @RequestMapping("assetstockinEdit")
    @ResponseBody
    public Map assetstockinEdit(HttpServletRequest httpServletRequest) throws Exception
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
                    int res = 0;
                    StockInList entity = UtilMethod.ClassMakeup(StockInList.class, map);
                    logger.info("entity:" + entity);

                    res = stockInService.add(entity);
                    if (res == 1) {
                        logger.info(oper + " succeed");
                    }else{
                        logger.info(oper + " failed");
                        throw new Exception();
                    }
                    StockInInfoList entity2 = UtilMethod.ClassMakeup(StockInInfoList.class, map);
                    logger.info("entity2:" + entity2);

                    res = stockInInfoService.add(entity2);
                    if (res == 1) {
                        editResponse.setStatus("success");
                        editResponse.setMessage(oper + " succeed");
                    }
                } else if ("edit".equals(oper)) {
                    logger.info("edit");
//                    ClassList entity = UtilMethod.ClassMakeup(ClassList.class, map);
//                    logger.info("entity:" + entity);
//                    int res = classListService.update(entity);
//                    if (res == 1) {
//                        editResponse.setStatus("success");
//                        editResponse.setMessage(oper + " succeed");
//                    }
                } else if ("del".equals(oper)) {
                    logger.info("del");
//                    Set<Integer> idSet = UtilMethod.TurnString2Set((String)map.get("id"));/*fill*/
//                    logger.info("keySet:" + idSet);
//
//                    editResponse.setStatus("success");
//                    editResponse.setMessage(oper + " succeed");
//                    for (Integer id : idSet) {
//                        int res = classListService.delete(id);
//                        if (res == 0) {
//                            editResponse.setStatus("error");
//                            editResponse.setMessage(oper + " failed");
//                            break;
//                        }
//                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            editResponse.setStatus("error");
            editResponse.setMessage("operation failed");
            logger.error(editResponse.toString());
            result.put("editResponse", editResponse);
            return result;
        }
        logger.info(editResponse.toString());
        result.put("editResponse", editResponse);
        return result;
    }

    @RequestMapping("assetstockinSelect")
    @ResponseBody
    public DataSearchResponse<?> assetstockinSelect(HttpServletRequest httpServletRequest, DataRequest dataRequest) throws Exception
    {
        logger.info("dataRequest:" + dataRequest);
        //logger.info("Entity:" + entity.getClass()+entity.toString());

        Map map = UtilMethod.TurnRequest2Map(httpServletRequest);
        DataSearchResponse<AssetStockList> dataResponse = null;

        AssetList entity = UtilMethod.ClassMakeup(AssetList.class, map);
        logger.info("entity:" + entity);
        try {
            dataResponse = search(map, dataRequest, entity, stockInInfoService);
        }catch(Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
        }
        return dataResponse;
    }

    //搜索
    public DataSearchResponse<AssetStockList> search(Map<String, Object> map, DataRequest request, AssetList entity, StockInInfoService service) {
        DataSearchResponse<AssetStockList> response = new DataSearchResponse<AssetStockList>();

        int limit = request.getRows() <= 0 ? 20 : request.getRows();//每页显示数量
        int totalPages;//总页数
        int page = request.getPage() <= 0 ? 1 : request.getPage();//当前显示页码
        int count;//总记录数
        int start=0;

        count = service.count(map, entity);
        logger.info("Count:"+count);

        totalPages = count / limit;
        if (count % limit != 0) {totalPages++;}
        int currPage = Math.min(totalPages, page);
        start = currPage * limit - limit;
        start = start < 0 ? 0 : start;

        String orderByClause = UtilMethod.TurnUpperCase2Underline(request.getSidx())+" "+request.getSord(); //如 ID desc
        logger.info("orderByClause:"+orderByClause);
        List<AssetStockList> list;
        list = service.select(map, entity, orderByClause, start, limit);

        response.setRecords(count);
        response.setTotalpage(totalPages);
        response.setCurrentpage(currPage);
        response.setRows(list);

//        for(AssetStockList a:list){
//            System.out.println(a.toString());
//        }

        logger.info("response:"+response);
        return response;
    }
}