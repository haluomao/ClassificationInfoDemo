package com.canco.assetstockin.service;

import java.util.List;
import java.util.Map;

import com.canco.assetstockin.model.*;

public interface StockInInfoService {

    /*
	 * 添加一条记录
	 * @param stockInInfoList
	 * @return int
	 */
    public int add(StockInList stockInList, StockInInfoList stockInInfoList,
                   AssetList assetList);

    /**
     * 删除一条关联数据
     * @param stockInInfoId
     * @return
     */
    public int delete(int stockInInfoId);

    /**
     * 更新一条关联数据和入库数据
     * @param stockInList
     * @param stockInInfoList
     * @param assetList
     * @return
     */
    public int update(StockInList stockInList, StockInInfoList stockInInfoList,
                      AssetList assetList);

    /**
     * 选择符合条件的结果数目
     * @param map
     * @param entity
     * @return
     */
    public int count(Map<String, Object> map, AssetList entity);
    /*
	 * 联合查询三表
	 * @param asset_no,asset_name,early_purchase_date,late_purchase_date
	 * @return List<AssetStockList>
	 *
	 */
    public List<AssetStockList> select(Map<String, Object> map, AssetList entity,
                                       String orderByClause, int start, int limit);

    public List<AssetList> selectAssetList();
}
