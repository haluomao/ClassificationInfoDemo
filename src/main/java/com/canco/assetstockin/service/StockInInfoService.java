package com.canco.assetstockin.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.canco.assetstockin.dao.AssetListMapper;
import com.canco.assetstockin.dao.StockInInfoListMapper;
import com.canco.assetstockin.dao.StockInListMapper;
import com.canco.assetstockin.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component("StockInInfoService")
public class StockInInfoService {
    public static final Logger logger = LoggerFactory.getLogger(StockInInfoService.class);
	StockInInfoListMapper stockInInfoListMapper;
	
	public StockInInfoListMapper getStockInInfoListMapper() {
		return stockInInfoListMapper;
	}

	@Resource(name="StockInInfoListMapper")
	public void setStockInInfoListMapper(StockInInfoListMapper stockInInfoListMapper) {
		this.stockInInfoListMapper = stockInInfoListMapper;
	}
	
	StockInListMapper stockInListMapper;
	
	public StockInListMapper getStockInListMapper() {
		return stockInListMapper;
	}

	@Resource(name="StockInListMapper")
	public void setStockInListMapper(StockInListMapper stockInListMapper) {
		this.stockInListMapper = stockInListMapper;
	}
	
	AssetListMapper assetListMapper;
	
	public AssetListMapper getAssetListMapper() {
		return assetListMapper;
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
	public int addStockInInfoRecord(StockInInfoList stockInInfoList){
		if(stockInInfoList.getStockInInfoAssetId() != null && stockInInfoList.getStockInInfoStockInId() != null)
			return stockInInfoListMapper.insert(stockInInfoList);
		else
			return 0;
	}

    /*
	 * 添加一条记录
	 * @param stockInInfoList
	 * @return int
	 */
    public int add(StockInInfoList stockInInfoList){
        if(stockInInfoList.getStockInInfoAssetId() != null && stockInInfoList.getStockInInfoStockInId() != null)
            return stockInInfoListMapper.insert(stockInInfoList);
        else
            return 0;
    }
	
	/*
	 * 添加一条记录
	 * @param assetList,stockInList,必须包含主键值
	 * @return int
	 */
	public int addStockInInfoRecord(AssetList assetList, StockInList stockInList){
		
//		AssetListExample assetListExample = new AssetListExample();
//		AssetListExample.Criteria assetList_criteria = assetListExample.createCriteria();
//		
//		StockInListExample stockInListExample = new StockInListExample();
//		StockInListExample.Criteria stockInList_criteria = stockInListExample.createCriteria();
		
		int result = 0;
		
		if(assetList.getAssetId() != null && stockInList.getStockInId() != null)
		{
//			assetList_criteria.andAssetIdEqualTo(assetList.getAssetId());
//			stockInList_criteria.andStockInIdEqualTo(stockInList.getStockInId());
//			
//			List<AssetList> assetLists = assetListMapper.selectByExample(assetListExample);
//			List<StockInList> stockInLists =  stockInListMapper.selectByExample(stockInListExample);
			
//			if(assetLists.size() != 0 && stockInLists.size() != 0)
//			{
				StockInInfoList stockInInfoList = new StockInInfoList();
				stockInInfoList.setStockInInfoAssetId(assetList.getAssetId());
				stockInInfoList.setStockInInfoStockInId(stockInList.getStockInId());
				result = addStockInInfoRecord(stockInInfoList);
//			}
		}
		
		return result;
	}



	/*
	 * 联合查询三表
	 * @param asset_no,asset_name,early_purchase_date,late_purchase_date
	 * @return List<AssetStockList>
	 * 
	 */
	public List<AssetStockList> selectAssetStockRecordList(String asset_no, String asset_name, Date early_purchase_date, Date late_purchase_date) {

		AssetStockListExample example = new AssetStockListExample();
		
		//添加asset_list表判断条件
		AssetListExample assetListExample = new AssetListExample();
		AssetListExample.Criteria assetList_criteria = assetListExample.createCriteria();
				
		//添加stockin_list表判断条件
		StockInListExample stockInListExample = new StockInListExample();
		StockInListExample.Criteria stockInList_criteria = stockInListExample.createCriteria();
		
		StockInInfoListExample stockInInfoListExample = new StockInInfoListExample();
		
		if(asset_no != null)
			assetList_criteria.andAssetNoLike("%" + asset_no + "%");
		if(asset_name != null)
			assetList_criteria.andAssetNoLike("%" + asset_name + "%");
		if(early_purchase_date != null && late_purchase_date != null)
			assetList_criteria.andPurchaseDateBetween(early_purchase_date, late_purchase_date);
		else if(early_purchase_date != null)
			assetList_criteria.andPurchaseDateGreaterThan(early_purchase_date);
		else if(late_purchase_date != null)
			assetList_criteria.andPurchaseDateLessThan(late_purchase_date);
		
		example.setAssetListExample(assetListExample);
		example.setStockInInfoListExample(stockInInfoListExample);
		example.setStockInListExample(stockInListExample);
		
		List<AssetStockList> result = stockInInfoListMapper
				.selectAssetStockList(example);
		return result;

	}

    private  AssetStockListExample updateExample(Map<String, Object> map, AssetList entity){
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

	/*
	 * 联合查询三表
	 * @param asset_id
	 * @return List<AssetStockList>
	 * 
	 */
	public List<AssetStockList> selectAssetStockRecordList(int assetId) {

		AssetStockListExample example = new AssetStockListExample();
		
		//添加asset_list表判断条件
		AssetListExample assetListExample = new AssetListExample();
		AssetListExample.Criteria assetList_criteria = assetListExample.createCriteria();
				
		//添加stockin_list表判断条件
		StockInListExample stockInListExample = new StockInListExample();
		StockInListExample.Criteria stockInList_criteria = stockInListExample.createCriteria();
		
		StockInInfoListExample stockInInfoListExample = new StockInInfoListExample();
		
		if(assetId >= 0)
			assetList_criteria.andAssetIdEqualTo(assetId);
		
		example.setAssetListExample(assetListExample);
		example.setStockInInfoListExample(stockInInfoListExample);
		example.setStockInListExample(stockInListExample);
		
		List<AssetStockList> result = stockInInfoListMapper
				.selectAssetStockList(example);
		return result;

	}
	
	/*
	 * 删除一条记录（假删）
	 * @param asset_id,modify_man
	 * @return int
	 */
	public void deleteRecordByAssetId(int assetId,String modifyMan){
		//删除assetlist表中记录
		if(assetId >= 0)
		{
			AssetList assetList = assetListMapper.selectByPrimaryKey(assetId);
			if(assetList != null)
			{
				assetList.setAssetIsVisible("0");
				assetList.setAssetModifyDate(new Date());
				if(modifyMan == null || modifyMan.equals(""))
					modifyMan = "system";
				assetList.setAssetModifyMan(modifyMan);
				assetListMapper.updateByPrimaryKey(assetList);
			}
			
			//删除stockininfolist表中记录
			StockInInfoListExample stockInInfoListExample = new StockInInfoListExample();
			StockInInfoListExample.Criteria stockInInfoList_criteria = stockInInfoListExample.createCriteria();
			stockInInfoList_criteria.andStockInInfoAssetIdEqualTo(assetId);
			
			List<StockInInfoList> stockInInfoLists = stockInInfoListMapper.selectByExample(stockInInfoListExample);
			for(Iterator<StockInInfoList> iter = stockInInfoLists.iterator();iter.hasNext();)
			{
				StockInInfoList stockInInfoList = iter.next();
				stockInInfoList.setStockInInfoIsVisible("0");
				stockInInfoListMapper.updateByPrimaryKey(stockInInfoList);
			}
			
			//删除stockinlist表中记录
			List<AssetStockList> assetStockLists = selectAssetStockRecordList(assetId);
			for(Iterator<AssetStockList> iter = assetStockLists.iterator();iter.hasNext();)
			{
				StockInList stockInList = iter.next().getStockInList();
				stockInList.setStockInIsVisible("0");
				stockInListMapper.updateByPrimaryKey(stockInList);
			}
		}
	}
	
}
