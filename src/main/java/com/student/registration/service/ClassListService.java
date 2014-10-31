package com.student.registration.service;

import com.student.registration.model.ClassList;

import java.util.List;

/**
 * Created by Administrator on 2014/10/30.
 */
public interface ClassListService {

	public List<ClassList> findClassList();

	public void addClassList(ClassList cl);

}
