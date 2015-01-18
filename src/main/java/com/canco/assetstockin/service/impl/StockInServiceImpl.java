package com.canco.assetstockin.service.impl;

import com.canco.assetstockin.dao.StockInListMapper;
import com.canco.assetstockin.model.StockInList;
import com.canco.assetstockin.service.StockInService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by haluomao on 15/01/07.
 */
@Component("StockInService")
public class StockInServiceImpl implements StockInService{
    public static final Logger logger = LoggerFactory.getLogger(StockInServiceImpl.class);

    private StockInListMapper stockInListMapper;

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
    public int delete(StockInList stockInList){
        if(stockInList != null && stockInList.getStockInId() != null)
            return stockInListMapper.deleteByPrimaryKey(stockInList.getStockInId());
        return 0;
    }

    /*
     * 修改一条记录
     * @param stockInList
     * @return int
     */
    public int update(StockInList stockInList){
        if(stockInList != null && stockInList.getStockInId() != null)
            return stockInListMapper.updateByPrimaryKey(stockInList);
        return 0;
    }

}
