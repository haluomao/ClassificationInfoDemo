package com.student.registration.vo;

/**
 * Created by haluomao on 14/11/04.
 */
public class PageListBean {
    private int totalPages;
    private int currentPage;
    private int listCount;
    private int cacheBegin;
    private int cacheSize = 100;

    public PageListBean(){
        totalPages=0;
        currentPage=1;
        listCount=20;
        cacheBegin=0;
    }
    public int getCacheSize() {
        return cacheSize;
    }

    public void setCacheSize(int cacheSize) {
        this.cacheSize = cacheSize;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getListCount() {
        return listCount;
    }

    public void setListCount(int listCount) {
        this.listCount = listCount;
    }

    public int getCacheBegin() {
        return cacheBegin;
    }

    public void setCacheBegin(int cacheBegin) {
        this.cacheBegin = cacheBegin;
    }




}
