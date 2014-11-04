package com.student.registration.service.impl;

import com.student.registration.dao.ClassListMapper;
import com.student.registration.model.ClassList;
import com.student.registration.model.ClassListExample;
import com.student.registration.service.ClassListService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
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
		return null;
	}

	@Override
	public int addClassList(ClassList cl) {
		return 0;
	}


//    public List<ClassList> listByLimit(int begin, int offset, int type) {
//		switch(type){
//			case 0:
//				classListExample.setOrderByClause("CLASS_ID");
//			case 1:
//				classListExample.setOrderByClause("CLASS_ID DESC");
//			default:
//				classListExample.setOrderByClause("CLASS_ID");
//		}
//
//		List<ClassList> result = classListMapper.selectByExample(classListExample);
//		List<ClassList> classlist = new ArrayList<ClassList>();
//		int count = 0;
//		if(begin > result.size())  // 如果begin大于记录总数
//			return classlist;
//		for(int i = begin; i<result.size(); i++)
//		{
//			if (count >= offset)
//				break;
//			else{
//				classlist.add(result.get(i));
//				count++;
//			}
//		}
//		classListExample.clear();
//		return classlist;
//    }
	@Override
	public List<ClassList> listByLimit(int begin, int offset, int type) {
		switch(type){
			case 0:
				classListExample.setOrderByClause("CLASS_ID");
			case 1:
				classListExample.setOrderByClause("CLASS_ID DESC");
			default:
				classListExample.setOrderByClause("CLASS_ID");
		}

		classListExample.setLimit(begin);
		classListExample.setOffset(offset);
		List<ClassList> classlist = classListMapper.selectByExampleAndLimit(classListExample);
		return classlist;
	}
 
	@Override
    public List<ClassList> selectByClassName(String name) {
		classListExample.createCriteria().andClassNameLike("%" + name + "%");
		List<ClassList> classlist = classListMapper.selectByExample(classListExample);
		classListExample.clear();
        return classlist;
    }

	@Override
	public int modifyOneRecord(ClassList classList) {
		return classListMapper.updateByPrimaryKey(classList);
	}

	@Override
	public int deleteByClassId(int classId) {
		return classListMapper.deleteByPrimaryKey(classId);
	}

	@Override
	public List<ClassList> selectByClassNameAndCreateMan(String classname,String createman) {
		classListExample.createCriteria().andClassNameLike("%" + classname + "%").andCreateManLike("%" + createman + "%");
		List<ClassList> classlist = classListMapper.selectByExample(classListExample);
		classListExample.clear();
		return classlist;
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