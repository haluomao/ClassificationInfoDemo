package com.canco.assetstockin.service;


import com.canco.assetstockin.dao.AssetListMapper;
import com.canco.assetstockin.model.AssetList;
import org.springframework.stereotype.Component;


public interface AssetService {
	/*
	 * 添加一条记录
	 * @param assetList
	 * @return int
	 */
	public int addAssetRecord(AssetList assetList);
	
}
