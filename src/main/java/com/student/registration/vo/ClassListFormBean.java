package com.student.registration.vo;

import com.student.registration.model.ClassList;

import java.util.List;

public class ClassListFormBean {
	private List<ClassList> classLists;   //classlist结果集
	private String className;
	private String createMan;

	@Override
	public String toString() {
		return "ClassListFormBean{" +
				"classLists=" + classLists +
				", className='" + className + '\'' +
				", createMan='" + createMan + '\'' +
				'}';
	}

	public List<ClassList> getClassLists() {
		return classLists;
	}

	public void setClassLists(List<ClassList> classLists) {
		this.classLists = classLists;
	}

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
}
