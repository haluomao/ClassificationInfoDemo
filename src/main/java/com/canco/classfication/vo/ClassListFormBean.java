package com.canco.classfication.vo;

import com.canco.classfication.model.ClassList;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

public class ClassListFormBean{
    private List<ClassList> classLists;   //classlist结果集
//    private int offset;   //当前步长
//    private int page;    //当前页数
//    private boolean hasNext = true;   //是否可以继续访问下一页，即是否末页
//    private boolean hasPrev = true;   //是否可以继续访问上一页，即是否首页

    public ClassListFormBean(){
        className="";
        createMan="";
    }
    @NotNull
    @Length(max=1024)
    private String className;

    @Length(max=512)
    private String createMan;
//    private int totalPage;  //根据当前步长计算的页数总数
//    private int totalCount;

//    private PageBean pageBean;

//    public void mapPageList2Vars(){
//        offset= pageBean.getCacheSize();
//        page= pageBean.getCacheBegin();
//        totalCount= pageBean.getTotalPages();
//    }
//    public void mapPageListFromVars(){
//        pageBean.setCacheBegin(page);
//        //pageBean.setCurrentPage(page);
//        pageBean.setTotalPages(totalCount);
//    }

    @Override
    public String toString() {
        return "ClassListFormBean{" +
                "classLists=" + classLists +
//                ", offset=" + offset +
//                ", page=" + page +
//                ", hasNext=" + hasNext +
//                ", hasPrev=" + hasPrev +
                ", className='" + className + '\'' +
                ", createMan='" + createMan + '\'' +
//                ", totalPage=" + totalPage +
//                ", totalCount=" + totalCount +
//                ", pageBean=" + pageBean +
                '}';
    }

//    public PageBean getPageBean(){return pageBean;}
//
//    public void setPageBean(PageBean pageBean){this.pageBean = pageBean;}

    public List<ClassList> getClassLists() {
        return classLists;
    }

    public void setClassLists(List<ClassList> classLists) {
        this.classLists = classLists;
    }

//    public int getOffset() {
//        return offset;
//    }
//
//    public void setOffset(int offset) {
//        this.offset = offset;
//    }
//
//    public int getPage() {
//        return page;
//    }
//
//    public void setPage(int page) {
//        this.page = page;
//    }
//
//    public boolean isHasNext() {
//        return hasNext;
//    }
//
//    public void setHasNext(boolean hasNext) {
//        this.hasNext = hasNext;
//    }
//
//    public boolean isHasPrev() {
//        return hasPrev;
//    }
//
//    public void setHasPrev(boolean hasPrev) {
//        this.hasPrev = hasPrev;
//    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getCreateMan() {
        return createMan;
    }

    public void setCreateMan(String createMan) {
        this.createMan = createMan;
    }

//    public int getTotalPage() {
//        return totalPage;
//    }
//
//    public void setTotalPage(int totalPage) {
//        this.totalPage = totalPage;
//    }
//
//    public int getTotalCount() {
//        return totalCount;
//    }
//
//    public void setTotalCount(int totalCount) {
//        this.totalCount = totalCount;
//    }
}