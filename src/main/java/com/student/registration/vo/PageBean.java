package com.student.registration.vo;

import java.io.Serializable;

/**
 * Created by haluomao on 14/11/04.
 */
public class PageBean {
    private int totalPages;
    private int totalCount;
    private int currentPage;
    private int listCount;
    private int cacheBegin;
    private int cacheSize = 100;

    public PageBean(){
        totalPages=0;
        currentPage=1;
        listCount=10;
        cacheBegin=0;
        totalCount=0;
        cacheSize = 100;
    }

    @Override
    public String toString(){
        return "PageBean{" +
                "totalPages=" + totalPages +
                ", totalCount=" + totalCount +
                ", currentPage=" + currentPage +
                ", listCount=" + listCount +
                ", cacheBegin=" + cacheBegin +
                ", cacheSize=" + cacheSize +
                '}';
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

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}
