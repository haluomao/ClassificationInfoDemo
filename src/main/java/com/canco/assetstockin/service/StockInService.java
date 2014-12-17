package com.canco.assetstockin.service;

import java.util.Date;

import javax.annotation.Resource;

import com.canco.assetstockin.dao.StockInListMapper;
import com.canco.assetstockin.model.StockInList;
import org.springframework.stereotype.Component;


@Component("StockInService")
public class StockInService {
	
	StockInListMapper stockInListMapper;
	
	public StockInListMapper getStockInListMapper() {
		return stockInListMapper;
	}

	@Resource(name="StockInListMapper")
	public void setStockInListMapper(StockInListMapper stockInListMapper) {
		this.stockInListMapper = stockInListMapper;
	}

    /*
	 * 添加一条记录
	 * @param stockInList
	 * @return int
	 */
    public int add(StockInList stockInList){
        return stockInListMapper.insert(stockInList);
    }

	/*
	 * 添加一条记录
	 * @param stockInList
	 * @return int
	 */
	public int addStockInRecord(StockInList stockInList){
		if(stockInList.getStockInNo() == null)
			stockInList.setStockInNo("");
		if(stockInList.getInOrganId() == null)
			stockInList.setInOrganId(0);
		if(stockInList.getInUnitId() == null)
			stockInList.setInUnitId(0);
		if(stockInList.getStockInInDate() == null)
			stockInList.setStockInInDate(new Date());
		if(stockInList.getStockInIsVisible() == null)
			stockInList.setStockInIsVisible("1");
		if(stockInList.getStockInCreateDate() == null)
			stockInList.setStockInCreateDate(new Date());
		if(stockInList.getStockInCreateMan() == null)
			stockInList.setStockInCreateMan("system");
		
		return stockInListMapper.insert(stockInList);
		
	}
	
	/*
	 * 删除一条记录
	 * @param stockInList
	 * @return int
	 */
	public int deleteStockInRecord(StockInList stockInList){
		if(stockInList != null && stockInList.getStockInId() != null)
			return stockInListMapper.deleteByPrimaryKey(stockInList.getStockInId());
		return 0;
	}
	
	
	/*
	 * 修改一条记录
	 * @param stockInList
	 * @return int
	 */
	public int updateStockInRecord(StockInList stockInList){
		if(stockInList != null && stockInList.getStockInId() != null)
			return stockInListMapper.updateByPrimaryKey(stockInList);
		return 0;
	}
	
}
