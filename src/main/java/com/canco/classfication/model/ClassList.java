package com.canco.classfication.model;


import com.canco.common.util.CustomDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassList implements Serializable {

    //手动添加或生成
    public ClassList(){
        setDefaultIsCheck("1");
        setDefaultUserYear(2014);
        setDeprTypeId(1);
        setModifyMan("修改人_" + 2014);
        setClassType("t");
        setCreateDate(new Date());
    }

    public void setId(Integer id){
        this.classId = id;
    }
    public Integer getId(){
        return this.classId;
    }
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_list.CLASS_ID
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	private Integer classId;
	/**
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_list.CLASS_PID
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	private Integer classPid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_list.CLASS_CODE
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	private String classCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_list.CLASS_NO
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	private String classNo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_list.CLASS_NAME
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	private String className;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_list.ASSISTANT_SIGN
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	private String assistantSign;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_list.DEFAULT_STAT_NAME
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	private String defaultStatName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_list.DEFAULT_IS_CHECK
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	private String defaultIsCheck;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_list.DEFAULT_USER_YEAR
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	private Integer defaultUserYear;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_list.DEFAULT_IS_DEP
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	private String defaultIsDep;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_list.DEFAULT_REMAIN_VALUE
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	private Integer defaultRemainValue;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_list.DEFAULT_ASSET_KIND_ID
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	private Integer defaultAssetKindId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_list.DEPR_TYPE_ID
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	private Integer deprTypeId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_list.IS_ENABLED
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	private String isEnabled;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_list.CREATE_DATE
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	private Date createDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_list.CREATE_MAN
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	private String createMan;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_list.MODIFY_DATE
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	private Date modifyDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_list.MODIFY_MAN
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	private String modifyMan;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_list.EXPLAINATION
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	private String explaination;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_list.SORT
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	private Integer sort;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_list.IS_MEASURE
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	private String isMeasure;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_list.IS_MAINTAIN
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	private String isMaintain;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_list.IS_OVERHAUL
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	private String isOverhaul;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_list.IS_YEAR_CHECK
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	private String isYearCheck;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column class_list.CLASS_TYPE
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	private String classType;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_list.CLASS_ID
	 * @return  the value of class_list.CLASS_ID
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public Integer getClassId() {
		return classId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_list.CLASS_ID
	 * @param classId  the value for class_list.CLASS_ID
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_list.CLASS_PID
	 * @return  the value of class_list.CLASS_PID
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public Integer getClassPid() {
		return classPid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_list.CLASS_PID
	 * @param classPid  the value for class_list.CLASS_PID
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public void setClassPid(Integer classPid) {
		this.classPid = classPid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_list.CLASS_CODE
	 * @return  the value of class_list.CLASS_CODE
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public String getClassCode() {
		return classCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_list.CLASS_CODE
	 * @param classCode  the value for class_list.CLASS_CODE
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_list.CLASS_NO
	 * @return  the value of class_list.CLASS_NO
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public String getClassNo() {
		return classNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_list.CLASS_NO
	 * @param classNo  the value for class_list.CLASS_NO
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_list.CLASS_NAME
	 * @return  the value of class_list.CLASS_NAME
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_list.CLASS_NAME
	 * @param className  the value for class_list.CLASS_NAME
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_list.ASSISTANT_SIGN
	 * @return  the value of class_list.ASSISTANT_SIGN
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public String getAssistantSign() {
		return assistantSign;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_list.ASSISTANT_SIGN
	 * @param assistantSign  the value for class_list.ASSISTANT_SIGN
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public void setAssistantSign(String assistantSign) {
		this.assistantSign = assistantSign;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_list.DEFAULT_STAT_NAME
	 * @return  the value of class_list.DEFAULT_STAT_NAME
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public String getDefaultStatName() {
		return defaultStatName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_list.DEFAULT_STAT_NAME
	 * @param defaultStatName  the value for class_list.DEFAULT_STAT_NAME
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public void setDefaultStatName(String defaultStatName) {
		this.defaultStatName = defaultStatName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_list.DEFAULT_IS_CHECK
	 * @return  the value of class_list.DEFAULT_IS_CHECK
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public String getDefaultIsCheck() {
		return defaultIsCheck;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_list.DEFAULT_IS_CHECK
	 * @param defaultIsCheck  the value for class_list.DEFAULT_IS_CHECK
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public void setDefaultIsCheck(String defaultIsCheck) {
		this.defaultIsCheck = defaultIsCheck;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_list.DEFAULT_USER_YEAR
	 * @return  the value of class_list.DEFAULT_USER_YEAR
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public Integer getDefaultUserYear() {
		return defaultUserYear;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_list.DEFAULT_USER_YEAR
	 * @param defaultUserYear  the value for class_list.DEFAULT_USER_YEAR
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public void setDefaultUserYear(Integer defaultUserYear) {
		this.defaultUserYear = defaultUserYear;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_list.DEFAULT_IS_DEP
	 * @return  the value of class_list.DEFAULT_IS_DEP
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public String getDefaultIsDep() {
		return defaultIsDep;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_list.DEFAULT_IS_DEP
	 * @param defaultIsDep  the value for class_list.DEFAULT_IS_DEP
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public void setDefaultIsDep(String defaultIsDep) {
		this.defaultIsDep = defaultIsDep;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_list.DEFAULT_REMAIN_VALUE
	 * @return  the value of class_list.DEFAULT_REMAIN_VALUE
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public Integer getDefaultRemainValue() {
		return defaultRemainValue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_list.DEFAULT_REMAIN_VALUE
	 * @param defaultRemainValue  the value for class_list.DEFAULT_REMAIN_VALUE
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public void setDefaultRemainValue(Integer defaultRemainValue) {
		this.defaultRemainValue = defaultRemainValue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_list.DEFAULT_ASSET_KIND_ID
	 * @return  the value of class_list.DEFAULT_ASSET_KIND_ID
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public Integer getDefaultAssetKindId() {
		return defaultAssetKindId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_list.DEFAULT_ASSET_KIND_ID
	 * @param defaultAssetKindId  the value for class_list.DEFAULT_ASSET_KIND_ID
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public void setDefaultAssetKindId(Integer defaultAssetKindId) {
		this.defaultAssetKindId = defaultAssetKindId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_list.DEPR_TYPE_ID
	 * @return  the value of class_list.DEPR_TYPE_ID
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public Integer getDeprTypeId() {
		return deprTypeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_list.DEPR_TYPE_ID
	 * @param deprTypeId  the value for class_list.DEPR_TYPE_ID
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public void setDeprTypeId(Integer deprTypeId) {
		this.deprTypeId = deprTypeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_list.IS_ENABLED
	 * @return  the value of class_list.IS_ENABLED
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public String getIsEnabled() {
		return isEnabled;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_list.IS_ENABLED
	 * @param isEnabled  the value for class_list.IS_ENABLED
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_list.CREATE_DATE
	 * @return  the value of class_list.CREATE_DATE
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */

    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getCreateDate() {
		return createDate;
	}
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_list.CREATE_DATE
	 * @param createDate  the value for class_list.CREATE_DATE
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_list.CREATE_MAN
	 * @return  the value of class_list.CREATE_MAN
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public String getCreateMan() {
		return createMan;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_list.CREATE_MAN
	 * @param createMan  the value for class_list.CREATE_MAN
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public void setCreateMan(String createMan) {
		this.createMan = createMan;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_list.MODIFY_DATE
	 * @return  the value of class_list.MODIFY_DATE
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public Date getModifyDate() {
		return modifyDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_list.MODIFY_DATE
	 * @param modifyDate  the value for class_list.MODIFY_DATE
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_list.MODIFY_MAN
	 * @return  the value of class_list.MODIFY_MAN
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public String getModifyMan() {
		return modifyMan;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_list.MODIFY_MAN
	 * @param modifyMan  the value for class_list.MODIFY_MAN
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public void setModifyMan(String modifyMan) {
		this.modifyMan = modifyMan;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_list.EXPLAINATION
	 * @return  the value of class_list.EXPLAINATION
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public String getExplaination() {
		return explaination;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_list.EXPLAINATION
	 * @param explaination  the value for class_list.EXPLAINATION
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public void setExplaination(String explaination) {
		this.explaination = explaination;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_list.SORT
	 * @return  the value of class_list.SORT
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public Integer getSort() {
		return sort;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_list.SORT
	 * @param sort  the value for class_list.SORT
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_list.IS_MEASURE
	 * @return  the value of class_list.IS_MEASURE
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public String getIsMeasure() {
		return isMeasure;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_list.IS_MEASURE
	 * @param isMeasure  the value for class_list.IS_MEASURE
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public void setIsMeasure(String isMeasure) {
		this.isMeasure = isMeasure;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_list.IS_MAINTAIN
	 * @return  the value of class_list.IS_MAINTAIN
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public String getIsMaintain() {
		return isMaintain;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_list.IS_MAINTAIN
	 * @param isMaintain  the value for class_list.IS_MAINTAIN
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public void setIsMaintain(String isMaintain) {
		this.isMaintain = isMaintain;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_list.IS_OVERHAUL
	 * @return  the value of class_list.IS_OVERHAUL
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public String getIsOverhaul() {
		return isOverhaul;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_list.IS_OVERHAUL
	 * @param isOverhaul  the value for class_list.IS_OVERHAUL
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public void setIsOverhaul(String isOverhaul) {
		this.isOverhaul = isOverhaul;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_list.IS_YEAR_CHECK
	 * @return  the value of class_list.IS_YEAR_CHECK
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public String getIsYearCheck() {
		return isYearCheck;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_list.IS_YEAR_CHECK
	 * @param isYearCheck  the value for class_list.IS_YEAR_CHECK
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public void setIsYearCheck(String isYearCheck) {
		this.isYearCheck = isYearCheck;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column class_list.CLASS_TYPE
	 * @return  the value of class_list.CLASS_TYPE
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public String getClassType() {
		return classType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column class_list.CLASS_TYPE
	 * @param classType  the value for class_list.CLASS_TYPE
	 * @mbggenerated  Mon Nov 03 12:57:56 CST 2014
	 */
	public void setClassType(String classType) {
		this.classType = classType;
	}

    @Override
    public String toString() {
        return "ClassList{" +
                "classId=" + classId +
                ", classPid=" + classPid +
                ", classCode='" + classCode + '\'' +
                ", classNo='" + classNo + '\'' +
                ", className='" + className + '\'' +
                ", assistantSign='" + assistantSign + '\'' +
                ", defaultStatName='" + defaultStatName + '\'' +
                ", defaultIsCheck='" + defaultIsCheck + '\'' +
                ", defaultUserYear=" + defaultUserYear +
                ", defaultIsDep='" + defaultIsDep + '\'' +
                ", defaultRemainValue=" + defaultRemainValue +
                ", defaultAssetKindId=" + defaultAssetKindId +
                ", deprTypeId=" + deprTypeId +
                ", isEnabled='" + isEnabled + '\'' +
                ", createDate=" + createDate +
                ", createMan='" + createMan + '\'' +
                ", modifyDate=" + modifyDate +
                ", modifyMan='" + modifyMan + '\'' +
                ", explaination='" + explaination + '\'' +
                ", sort=" + sort +
                ", isMeasure='" + isMeasure + '\'' +
                ", isMaintain='" + isMaintain + '\'' +
                ", isOverhaul='" + isOverhaul + '\'' +
                ", isYearCheck='" + isYearCheck + '\'' +
                ", classType='" + classType + '\'' +
                '}';
    }
}