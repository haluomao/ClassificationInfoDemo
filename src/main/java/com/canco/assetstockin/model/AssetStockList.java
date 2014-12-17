package com.canco.assetstockin.model;

public class AssetStockList {
    //这个属性是必须的，作为“主键”
    private Integer stockInInfoId;

	StockInInfoList stockInInfoList;
	
	AssetList assetList;
	
	StockInList stockInList;

    public Integer getStockInInfoId() {
        return stockInInfoId;
    }

    public void setStockInInfoId(Integer stockInInfoId) {
        this.stockInInfoId = stockInInfoId;
    }

	public StockInInfoList getStockInInfoList() {
		return stockInInfoList;
	}

	public void setStockInInfoList(StockInInfoList stockInInfoList) {
		this.stockInInfoList = stockInInfoList;
	}

	public AssetList getAssetList() {
		return assetList;
	}

	public void setAssetList(AssetList assetList) {
		this.assetList = assetList;
	}

	public StockInList getStockInList() {
		return stockInList;
	}

	public void setStockInList(StockInList stockInList) {
		this.stockInList = stockInList;
	}

	@Override
	public String toString() {
		return "AssetStockList [stockInInfoId=" + stockInInfoId + ", stockInInfoList=" + stockInInfoList + ", assetList="
				+ assetList + ", stockInList=" + stockInList + "]";
	}


	
}
