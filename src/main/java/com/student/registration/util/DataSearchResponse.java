package com.student.registration.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * Created by haluomao on 14/11/21.
 */
public class DataSearchResponse<T> {
    public static final Logger logger = LoggerFactory.getLogger(DataSearchResponse.class);
    //显示数据
    private List<T> rows;

    //当前页
    private int currentpage;

    //数据总数
    private int records;

    //可显示的页数
    private int totalpage;

    //自定义数据
    private Map<String, Object> userdata;

    public DataSearchResponse(){
        rows=null;
        currentpage=0;
        records=0;
        totalpage=0;
        userdata=null;
    }

    @Override
    public String toString() {
        return "DataResponse{" +
                "rows=" + rows +
                ", currentpage=" + currentpage +
                ", records=" + records +
                ", totalpage=" + totalpage +
                ", userdata=" + userdata +
                '}';
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public int getCurrentpage() {
        return currentpage;
    }

    public void setCurrentpage(int currentpage) {
        this.currentpage = currentpage;
    }

    public int getRecords() {
        return records;
    }

    public void setRecords(int records) {
        this.records = records;
    }

    public int getTotalpage() {
        return totalpage;
    }

    public void setTotalpage(int totalpage) {
        this.totalpage = totalpage;
    }

    public Map<String, Object> getUserdata() {
        return userdata;
    }

    public void setUserdata(Map<String, Object> userdata) {
        this.userdata = userdata;
    }
}
