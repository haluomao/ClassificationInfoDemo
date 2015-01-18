package com.canco.assetstockin.service.impl;

import com.canco.assetstockin.dao.AssetListMapper;
import com.canco.assetstockin.dao.StockInInfoListMapper;
import com.canco.assetstockin.dao.StockInListMapper;
import com.canco.assetstockin.model.*;
import com.canco.assetstockin.service.StockInInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by haluomao on 15/01/07.
 */
@Component("StockInInfoService")
public class StockInInfoServiceImpl implements StockInInfoService {
    public static final Logger logger = LoggerFactory.getLogger(StockInInfoServiceImpl.class);

    private StockInInfoListMapper stockInInfoListMapper;

    private StockInListMapper stockInListMapper;

    private AssetListMapper assetListMapper;

    @Resource(name="StockInInfoListMapper")
    public void setStockInInfoListMapper(StockInInfoListMapper stockInInfoListMapper) {
        this.stockInInfoListMapper = stockInInfoListMapper;
    }

    @Resource(name="StockInListMapper")
    public void setStockInListMapper(StockInListMapper stockInListMapper) {
        this.stockInListMapper = stockInListMapper;
    }

    @Resource(name="AssetListMapper")
    public void setAssetListMapper(AssetListMapper assetListMapper) {
        this.assetListMapper = assetListMapper;
    }

    /*
	 * 添加一条记录
	 * @param stockInInfoList
	 * @return int
	 */
    public int add(StockInList stockInList, StockInInfoList stockInInfoList,
                   AssetList assetList){
        //先插入stockinlist数据
        stockInListMapper.insert(stockInList);
        logger.info("insert stockInList:" + stockInList);

        //选出刚插入的数据的Id
        if(stockInList.getStockInId()==null) return 0;
        stockInInfoList.setStockInInfoStockInId(stockInList.getStockInId());
        stockInInfoList.setStockInInfoAssetId(assetList.getAssetId());
        stockInInfoList.setStockInInfoIsVisible("1");

        return stockInInfoListMapper.insert(stockInInfoList);
    }

    /**
     * 删除一条关联数据
     * @param stockInInfoId
     * @return
     */
    public int delete(int stockInInfoId){
        StockInInfoList stockInInfoList  =
                stockInInfoListMapper.selectByPrimaryKey(stockInInfoId);
        stockInInfoList.setStockInInfoIsVisible("0");
        return stockInInfoListMapper.updateByPrimaryKey(stockInInfoList);
    }

    /**
     * 更新一条关联数据和入库数据
     * @param stockInList
     * @param stockInInfoList
     * @param assetList
     * @return
     */
    public int update(StockInList stockInList, StockInInfoList stockInInfoList,
                      AssetList assetList){

        logger.info("before update stockInInfoList:" + stockInInfoList);
        stockInInfoList = stockInInfoListMapper.selectByPrimaryKey(
                stockInInfoList.getStockInInfoId());

        logger.info("before update stockInList:" + stockInList);
        stockInList.setStockInId(stockInInfoList.getStockInInfoStockInId());
        stockInListMapper.updateByPrimaryKey(stockInList);

        if(stockInInfoList.getStockInInfoAssetId()!=assetList.getAssetId()){
            stockInInfoList.setStockInInfoAssetId(assetList.getAssetId());
        }

        return stockInInfoListMapper.updateByPrimaryKey(stockInInfoList);
    }


    private AssetStockListExample updateExample(Map<String, Object> map, AssetList entity){
        AssetStockListExample example = new AssetStockListExample();

        //添加asset_list表判断条件
        AssetListExample assetListExample = new AssetListExample();
        AssetListExample.Criteria assetList_criteria = assetListExample.createCriteria();

        //添加stockin_list表判断条件
        StockInListExample stockInListExample = new StockInListExample();
        StockInListExample.Criteria stockInList_criteria = stockInListExample.createCriteria();

        //添加stockinInfo_list表判断条件
        StockInInfoListExample stockInInfoListExample = new StockInInfoListExample();
        StockInInfoListExample.Criteria stockInInfoList_criteria = stockInInfoListExample.createCriteria();
        stockInInfoList_criteria.andStockInInfoIsVisibleEqualTo("1");

        if(entity.getAssetNo()!= null)
            assetList_criteria.andAssetNoLike("%" + entity.getAssetNo() + "%");
        if(entity.getAssetName() != null)
            assetList_criteria.andAssetNameLike("%" + entity.getAssetName() + "%");

        //对日期进行判断
        try {
            if(map.get("search_startDate")!=null && map.get("search_endDate")!=null) {
                String startDateString = map.get("search_startDate").toString();
                String endDateString = map.get("search_endDate").toString();
                Date startDate = null, endDate = null;
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

                if (startDateString != null && !"".equals(startDateString)) {
                    logger.info("startDateString:" + startDateString);
                    startDate = sdf.parse(startDateString);
                    logger.info("StartDate:" + startDate);
                    //assetList_criteria.andPurchaseDateGreaterThan(startDate);
                    assetList_criteria.andAssetCreateDateGreaterThanOrEqualTo(startDate);
                }

                if (endDateString != null && !"".equals(endDateString)) {
                    endDate = new Date((sdf.parse(endDateString)).getTime() + 1 * 24 * 60 * 60 * 1000 - 1);  //将时间调整为该日的最后一毫秒
                    logger.info("EndDate:" + endDate);
                    assetList_criteria.andAssetCreateDateLessThan(endDate);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
        }

        example.setAssetListExample(assetListExample);
        example.setStockInInfoListExample(stockInInfoListExample);
        example.setStockInListExample(stockInListExample);

        return example;
    }

    /**
     * 选择符合条件的结果数目
     * @param map
     * @param entity
     * @return
     */
    public int count(Map<String, Object> map, AssetList entity) {
        //动态生成Criteria，依据是map里面出现了entity里面的属性
        AssetStockListExample example = updateExample(map, entity);
        return stockInInfoListMapper.countByExample(example.getStockInInfoListExample());
    }

    /*
	 * 联合查询三表
	 * @param asset_no,asset_name,early_purchase_date,late_purchase_date
	 * @return List<AssetStockList>
	 *
	 */
    public List<AssetStockList> select(Map<String, Object> map, AssetList entity, String orderByClause, int start, int limit) {

        AssetStockListExample example = updateExample(map, entity);
        example.getStockInInfoListExample().setOrderByClause(orderByClause);
        example.getStockInInfoListExample().setStart(start);
        example.getStockInInfoListExample().setOffset(limit);
        List<AssetStockList> result = stockInInfoListMapper
                .selectAssetStockList(example);

        return result;
    }

    public List<AssetList> selectAssetList(){
        AssetStockListExample example = new AssetStockListExample();
        StockInInfoListExample stockInInfoListExample = new StockInInfoListExample();
        example.setStockInInfoListExample(stockInInfoListExample);
        return stockInInfoListMapper.selectAssetListNotInStockInInfoList(example);
    }
}
