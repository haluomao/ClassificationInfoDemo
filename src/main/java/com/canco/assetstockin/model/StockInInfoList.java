package com.canco.assetstockin.model;

public class StockInInfoList {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column stock_in_info_list.stock_in_info_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private Integer stockInInfoId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column stock_in_info_list.stock_in_info_stock_in_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private Integer stockInInfoStockInId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column stock_in_info_list.stock_in_info_asset_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private Integer stockInInfoAssetId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column stock_in_info_list.stock_in_info_is_visible
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private String stockInInfoIsVisible;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column stock_in_info_list.stock_in_info_id
	 * @return  the value of stock_in_info_list.stock_in_info_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public Integer getStockInInfoId() {
		return stockInInfoId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column stock_in_info_list.stock_in_info_id
	 * @param stockInInfoId  the value for stock_in_info_list.stock_in_info_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setStockInInfoId(Integer stockInInfoId) {
		this.stockInInfoId = stockInInfoId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column stock_in_info_list.stock_in_info_stock_in_id
	 * @return  the value of stock_in_info_list.stock_in_info_stock_in_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public Integer getStockInInfoStockInId() {
		return stockInInfoStockInId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column stock_in_info_list.stock_in_info_stock_in_id
	 * @param stockInInfoStockInId  the value for stock_in_info_list.stock_in_info_stock_in_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setStockInInfoStockInId(Integer stockInInfoStockInId) {
		this.stockInInfoStockInId = stockInInfoStockInId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column stock_in_info_list.stock_in_info_asset_id
	 * @return  the value of stock_in_info_list.stock_in_info_asset_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public Integer getStockInInfoAssetId() {
		return stockInInfoAssetId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column stock_in_info_list.stock_in_info_asset_id
	 * @param stockInInfoAssetId  the value for stock_in_info_list.stock_in_info_asset_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setStockInInfoAssetId(Integer stockInInfoAssetId) {
		this.stockInInfoAssetId = stockInInfoAssetId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column stock_in_info_list.stock_in_info_is_visible
	 * @return  the value of stock_in_info_list.stock_in_info_is_visible
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public String getStockInInfoIsVisible() {
		return stockInInfoIsVisible;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column stock_in_info_list.stock_in_info_is_visible
	 * @param stockInInfoIsVisible  the value for stock_in_info_list.stock_in_info_is_visible
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setStockInInfoIsVisible(String stockInInfoIsVisible) {
		this.stockInInfoIsVisible = stockInInfoIsVisible;
	}

    //@CodeGen start
    public StockInInfoList(){
        this.setStockInInfoIsVisible("1");
    }
	@Override
	public String toString() {
		return "StockInInfoList [stockInInfoId=" + stockInInfoId
				+ ", stockInInfoStockInId=" + stockInInfoStockInId
				+ ", stockInInfoAssetId=" + stockInInfoAssetId
				+ ", stockInInfoIsVisible=" + stockInInfoIsVisible + "]";
	}

    //@CodeGen end

}