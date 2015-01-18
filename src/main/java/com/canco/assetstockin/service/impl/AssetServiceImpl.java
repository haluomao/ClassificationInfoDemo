package com.canco.assetstockin.service.impl;

import com.canco.assetstockin.dao.AssetListMapper;
import com.canco.assetstockin.model.AssetList;
import com.canco.assetstockin.service.AssetService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by haluomao on 15/01/07.
 */
@Component("AssetService")
public class AssetServiceImpl implements AssetService {
    private AssetListMapper assetListMapper;

    public AssetListMapper getAssetListMapper() {
        return assetListMapper;
    }

    @Resource(name = "AssetListMapper")
    public void setAssetListMapper(AssetListMapper assetListMapper) {
        this.assetListMapper = assetListMapper;
    }

    /*
     * 添加一条记录
     * @param assetList
     * @return int
     */
    public int addAssetRecord(AssetList assetList){
        if(assetList.getAssetPid() == null)
            assetList.setAssetPid(0);
        if(assetList.getAssetOrganId() == null)
            assetList.setAssetOrganId(0);
        if(assetList.getAssetBarcode() == null)
            assetList.setAssetBarcode("");
        if(assetList.getAssetClassId() == null)
            assetList.setAssetClassId(0);
        if(assetList.getAssetName() == null)
            assetList.setAssetName("");
        if(assetList.getPurchaseId() == null)
            assetList.setPurchaseId(0);

        if(assetList.getPurchaseDate() == null)
            assetList.setPurchaseDate(new Date());
        if(assetList.getQuantityNum() == null)
            assetList.setQuantityNum(new BigDecimal(1));

        if(assetList.getOriginalValue() == null)
            assetList.setOriginalValue(new BigDecimal(0));
        if(assetList.getDepositaryId() == null)
            assetList.setDepositaryId(0);
        if(assetList.getKeepUnitId() == null)
            assetList.setKeepUnitId(0);
        if(assetList.getKeepEmployeeId() == null)
            assetList.setKeepEmployeeId(0);
        if(assetList.getAssetStateId() == null)
            assetList.setAssetStateId(0);
        if(assetList.getAssetKindId() == null)
            assetList.setAssetKindId(0);
        if(assetList.getAssetIsEnabled() == null)
            assetList.setAssetIsEnabled("1");
        if(assetList.getAssetCreateDate() == null)
            assetList.setAssetCreateDate(new Date());
        if(assetList.getAssetIsVisible() == null)
            assetList.setAssetIsVisible("1");
        if(assetList.getAssetCreateMan() == null)
            assetList.setAssetCreateMan("system");

        return assetListMapper.insert(assetList);
    }

}
