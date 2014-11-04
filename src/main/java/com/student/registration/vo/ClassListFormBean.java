package com.student.registration.vo;

import com.student.registration.model.ClassList;

import java.util.List;

public class ClassListFormBean {
	private List<ClassList> classLists;   //classlist结果集
	private int offset;   //当前步长
	private int currentpage;    //当前页数
	private boolean hasNext = true;   //是否可以继续访问下一页，即是否末页
	private boolean hasPrev = true;   //是否可以继续访问上一页，即是否首页

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

	public int getCurrentpage() {
		return currentpage;
	}

	public void setCurrentpage(int currentpage) {
		this.currentpage = currentpage;
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

	@Override
	public String toString() {
		return "ClassListFormBean{" +
				"classLists=" + classLists +
				", offset=" + offset +
				", currentpage=" + currentpage +
				", hasNext=" + hasNext +
				", hasPrev=" + hasPrev +
				'}';
	}
}
