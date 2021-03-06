package com.canco.assetstockin.model;

import com.canco.common.util.CustomDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.math.BigDecimal;
import java.util.Date;

public class AssetList {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.asset_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private Integer assetId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.asset_pid
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private Integer assetPid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.asset_organ_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private Integer assetOrganId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.asset_no
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private String assetNo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.asset_barcode
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private String assetBarcode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.machine_no
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private String machineNo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.asset_class_id
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.asset_class_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private Integer assetClassId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.asset_name
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private String assetName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.assistant_sign
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private String assistantSign;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.asset_brand
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private String assetBrand;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.spec_model
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private String specModel;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.purchase_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private Integer purchaseId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.scrap_type_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private Integer scrapTypeId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.purchase_date
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private Date purchaseDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.warranty_period
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private Short warrantyPeriod;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.service_life
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private Short serviceLife;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.quantity_num
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private BigDecimal quantityNum;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.measurement_unit
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private String measurementUnit;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.original_value
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private BigDecimal originalValue;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.depositary_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private Integer depositaryId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.keep_unit_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private Integer keepUnitId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.keep_employee_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private Integer keepEmployeeId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.asset_state_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private Integer assetStateId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.asset_kind_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private Integer assetKindId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.account_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private Integer accountId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.asset_is_enabled
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private String assetIsEnabled;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.asset_is_visible
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private String assetIsVisible;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.asset_create_date
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private Date assetCreateDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.asset_create_man
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private String assetCreateMan;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.asset_modify_date
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private Date assetModifyDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.asset_modify_man
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private String assetModifyMan;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column asset_list.asset_explain_info
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	private String assetExplainInfo;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.asset_id
	 * @return  the value of asset_list.asset_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public Integer getAssetId() {
		return assetId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.asset_id
	 * @param assetId  the value for asset_list.asset_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.asset_pid
	 * @return  the value of asset_list.asset_pid
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public Integer getAssetPid() {
		return assetPid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.asset_pid
	 * @param assetPid  the value for asset_list.asset_pid
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setAssetPid(Integer assetPid) {
		this.assetPid = assetPid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.asset_organ_id
	 * @return  the value of asset_list.asset_organ_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public Integer getAssetOrganId() {
		return assetOrganId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.asset_organ_id
	 * @param assetOrganId  the value for asset_list.asset_organ_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setAssetOrganId(Integer assetOrganId) {
		this.assetOrganId = assetOrganId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.asset_no
	 * @return  the value of asset_list.asset_no
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public String getAssetNo() {
		return assetNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.asset_no
	 * @param assetNo  the value for asset_list.asset_no
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.asset_barcode
	 * @return  the value of asset_list.asset_barcode
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public String getAssetBarcode() {
		return assetBarcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.asset_barcode
	 * @param assetBarcode  the value for asset_list.asset_barcode
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setAssetBarcode(String assetBarcode) {
		this.assetBarcode = assetBarcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.machine_no
	 * @return  the value of asset_list.machine_no
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public String getMachineNo() {
		return machineNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.machine_no
	 * @param machineNo  the value for asset_list.machine_no
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setMachineNo(String machineNo) {
		this.machineNo = machineNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.asset_class_id
	 * @return  the value of asset_list.asset_class_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public Integer getAssetClassId() {
		return assetClassId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.asset_class_id
	 * @param assetClassId  the value for asset_list.asset_class_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setAssetClassId(Integer assetClassId) {
		this.assetClassId = assetClassId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.asset_name
	 * @return  the value of asset_list.asset_name
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public String getAssetName() {
		return assetName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.asset_name
	 * @param assetName  the value for asset_list.asset_name
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.assistant_sign
	 * @return  the value of asset_list.assistant_sign
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public String getAssistantSign() {
		return assistantSign;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.assistant_sign
	 * @param assistantSign  the value for asset_list.assistant_sign
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setAssistantSign(String assistantSign) {
		this.assistantSign = assistantSign;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.asset_brand
	 * @return  the value of asset_list.asset_brand
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public String getAssetBrand() {
		return assetBrand;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.asset_brand
	 * @param assetBrand  the value for asset_list.asset_brand
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setAssetBrand(String assetBrand) {
		this.assetBrand = assetBrand;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.spec_model
	 * @return  the value of asset_list.spec_model
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public String getSpecModel() {
		return specModel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.spec_model
	 * @param specModel  the value for asset_list.spec_model
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setSpecModel(String specModel) {
		this.specModel = specModel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.purchase_id
	 * @return  the value of asset_list.purchase_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public Integer getPurchaseId() {
		return purchaseId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.purchase_id
	 * @param purchaseId  the value for asset_list.purchase_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.scrap_type_id
	 * @return  the value of asset_list.scrap_type_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public Integer getScrapTypeId() {
		return scrapTypeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.scrap_type_id
	 * @param scrapTypeId  the value for asset_list.scrap_type_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setScrapTypeId(Integer scrapTypeId) {
		this.scrapTypeId = scrapTypeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.purchase_date
	 * @return  the value of asset_list.purchase_date
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
    @JsonSerialize(using = CustomDateSerializer.class)
	public Date getPurchaseDate() {
		return purchaseDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.purchase_date
	 * @param purchaseDate  the value for asset_list.purchase_date
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.warranty_period
	 * @return  the value of asset_list.warranty_period
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public Short getWarrantyPeriod() {
		return warrantyPeriod;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.warranty_period
	 * @param warrantyPeriod  the value for asset_list.warranty_period
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setWarrantyPeriod(Short warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.service_life
	 * @return  the value of asset_list.service_life
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public Short getServiceLife() {
		return serviceLife;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.service_life
	 * @param serviceLife  the value for asset_list.service_life
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setServiceLife(Short serviceLife) {
		this.serviceLife = serviceLife;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.quantity_num
	 * @return  the value of asset_list.quantity_num
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public BigDecimal getQuantityNum() {
		return quantityNum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.quantity_num
	 * @param quantityNum  the value for asset_list.quantity_num
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setQuantityNum(BigDecimal quantityNum) {
		this.quantityNum = quantityNum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.measurement_unit
	 * @return  the value of asset_list.measurement_unit
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public String getMeasurementUnit() {
		return measurementUnit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.measurement_unit
	 * @param measurementUnit  the value for asset_list.measurement_unit
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setMeasurementUnit(String measurementUnit) {
		this.measurementUnit = measurementUnit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.original_value
	 * @return  the value of asset_list.original_value
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public BigDecimal getOriginalValue() {
		return originalValue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.original_value
	 * @param originalValue  the value for asset_list.original_value
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setOriginalValue(BigDecimal originalValue) {
		this.originalValue = originalValue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.depositary_id
	 * @return  the value of asset_list.depositary_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public Integer getDepositaryId() {
		return depositaryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.depositary_id
	 * @param depositaryId  the value for asset_list.depositary_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setDepositaryId(Integer depositaryId) {
		this.depositaryId = depositaryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.keep_unit_id
	 * @return  the value of asset_list.keep_unit_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public Integer getKeepUnitId() {
		return keepUnitId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.keep_unit_id
	 * @param keepUnitId  the value for asset_list.keep_unit_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setKeepUnitId(Integer keepUnitId) {
		this.keepUnitId = keepUnitId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.keep_employee_id
	 * @return  the value of asset_list.keep_employee_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public Integer getKeepEmployeeId() {
		return keepEmployeeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.keep_employee_id
	 * @param keepEmployeeId  the value for asset_list.keep_employee_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setKeepEmployeeId(Integer keepEmployeeId) {
		this.keepEmployeeId = keepEmployeeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.asset_state_id
	 * @return  the value of asset_list.asset_state_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public Integer getAssetStateId() {
		return assetStateId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.asset_state_id
	 * @param assetStateId  the value for asset_list.asset_state_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setAssetStateId(Integer assetStateId) {
		this.assetStateId = assetStateId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.asset_kind_id
	 * @return  the value of asset_list.asset_kind_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public Integer getAssetKindId() {
		return assetKindId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.asset_kind_id
	 * @param assetKindId  the value for asset_list.asset_kind_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setAssetKindId(Integer assetKindId) {
		this.assetKindId = assetKindId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.account_id
	 * @return  the value of asset_list.account_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public Integer getAccountId() {
		return accountId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.account_id
	 * @param accountId  the value for asset_list.account_id
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.asset_is_enabled
	 * @return  the value of asset_list.asset_is_enabled
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public String getAssetIsEnabled() {
		return assetIsEnabled;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.asset_is_enabled
	 * @param assetIsEnabled  the value for asset_list.asset_is_enabled
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setAssetIsEnabled(String assetIsEnabled) {
		this.assetIsEnabled = assetIsEnabled;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.asset_is_visible
	 * @return  the value of asset_list.asset_is_visible
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public String getAssetIsVisible() {
		return assetIsVisible;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.asset_is_visible
	 * @param assetIsVisible  the value for asset_list.asset_is_visible
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setAssetIsVisible(String assetIsVisible) {
		this.assetIsVisible = assetIsVisible;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.asset_create_date
	 * @return  the value of asset_list.asset_create_date
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
    @JsonSerialize(using = CustomDateSerializer.class)
	public Date getAssetCreateDate() {
		return assetCreateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.asset_create_date
	 * @param assetCreateDate  the value for asset_list.asset_create_date
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setAssetCreateDate(Date assetCreateDate) {
		this.assetCreateDate = assetCreateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.asset_create_man
	 * @return  the value of asset_list.asset_create_man
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public String getAssetCreateMan() {
		return assetCreateMan;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.asset_create_man
	 * @param assetCreateMan  the value for asset_list.asset_create_man
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setAssetCreateMan(String assetCreateMan) {
		this.assetCreateMan = assetCreateMan;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.asset_modify_date
	 * @return  the value of asset_list.asset_modify_date
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
    @JsonSerialize(using = CustomDateSerializer.class)
	public Date getAssetModifyDate() {
		return assetModifyDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.asset_modify_date
	 * @param assetModifyDate  the value for asset_list.asset_modify_date
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setAssetModifyDate(Date assetModifyDate) {
		this.assetModifyDate = assetModifyDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.asset_modify_man
	 * @return  the value of asset_list.asset_modify_man
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public String getAssetModifyMan() {
		return assetModifyMan;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.asset_modify_man
	 * @param assetModifyMan  the value for asset_list.asset_modify_man
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setAssetModifyMan(String assetModifyMan) {
		this.assetModifyMan = assetModifyMan;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column asset_list.asset_explain_info
	 * @return  the value of asset_list.asset_explain_info
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public String getAssetExplainInfo() {
		return assetExplainInfo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column asset_list.asset_explain_info
	 * @param assetExplainInfo  the value for asset_list.asset_explain_info
	 * @mbggenerated  Mon Dec 15 15:51:52 CST 2014
	 */
	public void setAssetExplainInfo(String assetExplainInfo) {
		this.assetExplainInfo = assetExplainInfo;
	}

	@Override
	public String toString() {
		return "AssetList [assetId=" + assetId + ", assetPid=" + assetPid
				+ ", assetOrganId=" + assetOrganId + ", assetNo=" + assetNo
				+ ", assetBarcode=" + assetBarcode + ", machineNo=" + machineNo
				+ ", assetClassId=" + assetClassId + ", assetName=" + assetName
				+ ", assistantSign=" + assistantSign + ", assetBrand="
				+ assetBrand + ", specModel=" + specModel + ", purchaseId="
				+ purchaseId + ", scrapTypeId=" + scrapTypeId
				+ ", purchaseDate=" + purchaseDate + ", warrantyPeriod="
				+ warrantyPeriod + ", serviceLife=" + serviceLife
				+ ", quantityNum=" + quantityNum + ", measurementUnit="
				+ measurementUnit + ", originalValue=" + originalValue
				+ ", depositaryId=" + depositaryId + ", keepUnitId="
				+ keepUnitId + ", keepEmployeeId=" + keepEmployeeId
				+ ", assetStateId=" + assetStateId + ", assetKindId="
				+ assetKindId + ", accountId=" + accountId
				+ ", assetIsEnabled=" + assetIsEnabled + ", assetIsVisible="
				+ assetIsVisible + ", assetCreateDate=" + assetCreateDate
				+ ", assetCreateMan=" + assetCreateMan + ", assetModifyDate="
				+ assetModifyDate + ", assetModifyMan=" + assetModifyMan
				+ ", assetExplainInfo=" + assetExplainInfo + "]";
	}

    
    
}