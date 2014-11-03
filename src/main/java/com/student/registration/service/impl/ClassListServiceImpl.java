package com.student.registration.service.impl;

import com.student.registration.dao.ClassListMapper;
import com.student.registration.model.ClassList;
import com.student.registration.model.ClassListExample;
import com.student.registration.service.ClassListService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by BakerCxy on 2014/10/30.
 */

@Component("ClassListServiceImpl")
public class ClassListServiceImpl implements ClassListService{

	ClassListExample classListExample;
	ClassListMapper classListMapper;

	@Override
	public List<ClassList> findClassList() {
		List<ClassList> cl_list = classListMapper.selectByExample(classListExample);
		classListExample.clear();
		return cl_list;
	}

	@Override
	public void addClassList(ClassList cl) {
		classListMapper.insert(cl);
	}


	public ClassListExample getClassListExample() {
		return classListExample;
	}

	@Resource(name = "ClassListExample")
	public void setClassListExample(ClassListExample classListExample) {
		this.classListExample = classListExample;
	}

	public ClassListMapper getClassListMapper() {
		return classListMapper;
	}

	@Resource(name = "ClassListMapper")
	public void setClassListMapper(ClassListMapper classListMapper) {
		this.classListMapper = classListMapper;
	}
}