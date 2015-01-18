package com.canco.assetstockin.service;

import com.canco.assetstockin.model.StockInList;


public interface StockInService {

    /*
	 * 添加一条记录
	 * @param stockInList
	 * @return int
	 */
    public int add(StockInList stockInList);
	/*
	 * 删除一条记录
	 * @param stockInList
	 * @return int
	 */
	public int delete(StockInList stockInList);
	
	/*
	 * 修改一条记录
	 * @param stockInList
	 * @return int
	 */
	public int update(StockInList stockInList);
}
