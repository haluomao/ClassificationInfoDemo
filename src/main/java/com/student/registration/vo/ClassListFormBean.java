package com.student.registration.vo;

import com.student.registration.model.ClassList;

import java.util.List;

public class ClassListFormBean {
	private List<ClassList> classLists;   //classlist结果集
	private int offset;   //当前步长
	private int page;    //当前页数
	private boolean hasNext = true;   //是否可以继续访问下一页，即是否末页
	private boolean hasPrev = true;   //是否可以继续访问上一页，即是否首页
	private String classname;
	private String createman;
	private int totalpage;  //根据当前步长计算的页数总数

	@Override
	public String toString() {
		return "ClassListFormBean{" +
				"classLists=" + classLists +
				", offset=" + offset +
				", page=" + page +
				", hasNext=" + hasNext +
				", hasPrev=" + hasPrev +
				", classname='" + classname + '\'' +
				", createman='" + createman + '\'' +
				", totalpage=" + totalpage +
				'}';
	}

	public List<ClassList> getClassLists() {
		return classLists;
	}

	public void setClassLists(List<ClassList> classLists) {
		this.classLists = classLists;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public boolean isHasNext() {
		return hasNext;
	}

	public void setHasNext(boolean hasNext) {
		this.hasNext = hasNext;
	}

	public boolean isHasPrev() {
		return hasPrev;
	}

	public void setHasPrev(boolean hasPrev) {
		this.hasPrev = hasPrev;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getCreateman() {
		return createman;
	}

	public void setCreateman(String createman) {
		this.createman = createman;
	}

	public int getTotalpage() {
		return totalpage;
	}

	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}
}
