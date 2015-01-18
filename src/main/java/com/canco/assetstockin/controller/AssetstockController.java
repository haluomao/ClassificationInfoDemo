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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

                    StockInInfoList entity1 = UtilMethod.ClassMakeup(StockInInfoList.class, map);
                    logger.info("entity1:" + entity1);

                    AssetList entity2 = UtilMethod.ClassMakeup(AssetList.class, map);
                    entity2.setAssetId(Integer.valueOf(entity2.getAssetNo() ));
                    logger.info("entity2:" + entity2);

                    res = stockInInfoService.add(entity, entity1, entity2);
                    if (res == 1) {
                        editResponse.setStatus("success");
                        editResponse.setMessage(oper + " succeed");
                    }
                } else if ("edit".equals(oper)) {
                    int res = 0;
                    logger.info("edit");
                    StockInList entity = UtilMethod.ClassMakeup(StockInList.class, map);
                    logger.info("entity:" + entity);

                    StockInInfoList entity1 = UtilMethod.ClassMakeup(StockInInfoList.class, map);
                    entity1.setStockInInfoId(Integer.valueOf((String)map.get("id")));
                    logger.info("entity1:" + entity1);

                    AssetList entity2 = UtilMethod.ClassMakeup(AssetList.class, map);
                    entity2.setAssetId(Integer.valueOf(entity2.getAssetNo() ));
                    logger.info("entity2:" + entity2);

                    res = stockInInfoService.update(entity, entity1, entity2);
                    if (res == 1) {
                        editResponse.setStatus("success");
                        editResponse.setMessage(oper + " succeed");
                    }
                } else if ("del".equals(oper)) {
                    logger.info("del");
                    Set<Integer> idSet = UtilMethod.TurnString2Set((String)map.get("id"));/*fill*/
                    logger.info("keySet:" + idSet);
//
                    editResponse.setStatus("success");
                    editResponse.setMessage(oper + " succeed");
                    for (Integer id : idSet) {
                        int res = stockInInfoService.delete(id);
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
            logger.error(editResponse.toString());
            result.put("editResponse", editResponse);
            return result;
        }
        logger.info(editResponse.toString());
        result.put("editResponse", editResponse);
        return result;
    }

    /**
     * 查找
     * @param httpServletRequest
     * @param dataRequest
     * @return
     * @throws Exception
     */
    @RequestMapping("assetstockinSelect")
    @ResponseBody
    public DataSearchResponse<?> assetstockinSelect(HttpServletRequest httpServletRequest, DataRequest dataRequest) throws Exception
    {
        logger.info("dataRequest:" + dataRequest);

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

    /**
     * 搜索
      * @param map
     * @param request
     * @param entity
     * @param service
     * @return
     */
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

        logger.info("response:"+response);
        return response;
    }

    /**
     * 找出不在关联表中的资产列表
     * @param httpServletRequest
     * @return
     */
    @RequestMapping("assetListSelect")
    @ResponseBody
    public List<AssetList> assetListSelect(HttpServletRequest httpServletRequest){
        List<AssetList> assetLists =  stockInInfoService.selectAssetList();
        logger.info("assetLists:"+assetLists);
        return  assetLists;
    }

    /**
     * 映射
     * @param locale
     * @param httpServletRequest
     * @return
     */
    @RequestMapping(value="index" , method = RequestMethod.GET)
     public String index(@RequestParam(required=false,defaultValue="en",value="locale" ) String locale,HttpServletRequest httpServletRequest){
        logger.info("index and locale:"+locale);
        return "classification/classification";
    }
    @RequestMapping(value="assetstockin")
    public String assetstockin(HttpServletRequest httpServletRequest){
        logger.info("Go to Assetstockin");
        return "assetstockin/assetstockin";
    }

    @RequestMapping(value="classification2")
    public String classification2(HttpServletRequest httpServletRequest){
        logger.info("Go to classification2");
        return "classification/classification2";
    }

    @RequestMapping(value="login")
    public String redirectTo_login() throws Exception {
        return "classification2/login";  //跳转到registerSuccess.jsp;

    }

}