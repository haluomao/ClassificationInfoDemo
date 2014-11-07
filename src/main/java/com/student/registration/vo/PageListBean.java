package com.student.registration.vo;

import java.io.Serializable;

/**
 * Created by Administrator on 2014/11/5.
 */
public class PageListBean {
	private int offset;   //当前步长
	private int page;    //当前页数
	private boolean hasNext = true;   //是否可以继续访问下一页，即是否末页
	private boolean hasPrev = true;   //是否可以继续访问上一页，即是否首页
	private int totalPage;  //根据当前步长计算的页数总数
	private int totalCount;

	@Override
	public String toString() {
		return "PageListBean{" +
				"offset=" + offset +
				", page=" + page +
				", hasNext=" + hasNext +
				", hasPrev=" + hasPrev +
				", totalPage=" + totalPage +
				", totalCount=" + totalCount +
				'}';
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

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
}
