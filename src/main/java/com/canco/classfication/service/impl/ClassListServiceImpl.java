package com.canco.classfication.service.impl;

import com.canco.classfication.dao.ClassListMapper;
import com.canco.classfication.model.ClassList;
import com.canco.classfication.model.ClassListExample;
import com.canco.classfication.service.ClassListService;
import com.canco.classfication.vo.ClassListFormBean;
import com.canco.classfication.vo.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by BakerCxy on 2014/10/30.
 */

//@Component("ClassListServiceImpl")
@Service
public class ClassListServiceImpl implements ClassListService{

	ClassListExample classListExample;
	ClassListMapper classListMapper;

    @Override
    public int add(ClassList classList){
        return classListMapper.insert(classList);
    }

    @Override
    public int delete(Integer id){
        return classListMapper.deleteByPrimaryKey(id);
    }
    @Override
    public int update(ClassList classList){
        return classListMapper.updateByPrimaryKey(classList);
    }
    @Override
    public ClassList selectById(Integer id){
        return classListMapper.selectByPrimaryKey(id);
    }

    //更新查询条件
    private void updateExample(Map<String, Object> map, ClassList entity){
        ClassListExample.Criteria criteria = classListExample.createCriteria();
        if(entity.getClassName()!=null && !"".equals(entity.getClassName()))
            criteria.andClassNameLike("%"+entity.getClassName()+ "%");
        if(entity.getCreateMan()!=null && !"".equals(entity.getCreateMan()))
            criteria.andCreateManLike("%"+entity.getCreateMan()+ "%");
    }

    @Override
    public int count(Map<String, Object> map, ClassList entity) {
        //动态生成Criteria，依据是map里面出现了entity里面的属性
        updateExample(map, entity);
        return classListMapper.countByExample(classListExample);
    }


    @Override
    public List<ClassList> select(Map<String, Object> map, ClassList entity, String orderByClause, int start, int limit) {
        classListExample = new ClassListExample();

        //动态生成Criteria，依据是map里面出现了entity里面的属性
        updateExample(map, entity);

        classListExample.setOrderByClause(orderByClause);
        classListExample.setStart(start);
        classListExample.setOffset(limit);

        List<ClassList> list = classListMapper.selectByExampleAndLimit(classListExample);
        classListExample.clear();

        return list;
    }

	@Override
	public List<ClassList> findClassList() {
		return null;
	}

	@Override
	public int countClassList() {
		return classListMapper.countByExample(classListExample);
	}

	@Override
	public int countClassListByClassNameAndCreateMan(ClassListFormBean classListFormBean) {
		if(classListFormBean.getClassName() == null)
			classListFormBean.setClassName("");
		if(classListFormBean.getCreateMan() == null)
			classListFormBean.setCreateMan("");
		classListExample.createCriteria().andClassNameLike("%" + classListFormBean.getClassName() + "%").andCreateManLike("%" + classListFormBean.getCreateMan() + "%");
        int count = classListMapper.countByExample(classListExample);
        classListExample.clear();
        return count;
	}



    @Override
	public int addClassList(ClassList cl) {
		return classListMapper.insert(cl);
	}


//
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

		classListExample.setStart(begin);
		classListExample.setOffset(offset);
		List<ClassList> classlist = classListMapper.selectByExampleAndLimit(classListExample);
        classListExample.clear();
		return classlist;
	}

	@Override
    public List<ClassList> selectByClassName(String classname) {
		if(classname == null)
			classname = "";
		classListExample.createCriteria().andClassNameLike("%" + classname + "%");
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
    public ClassList selectByClassId(int classId) {
        return classListMapper.selectByPrimaryKey(classId);
    }

	@Override
	public List<ClassList> selectByClassNameAndCreateManAndLimit(ClassListFormBean classListFormBean ,PageBean pageBean) {
		if(classListFormBean.getClassName() == null)
			classListFormBean.setClassName("");
		if(classListFormBean.getCreateMan() == null)
			classListFormBean.setCreateMan("");
		//classListExample.setLimit((classListFormBean.getPage()-1) * classListFormBean.getOffset());
        //classListExample.setOffset(classListFormBean.getOffset());
        classListExample.setStart(pageBean.getCacheBegin());
        classListExample.setOffset(pageBean.getCacheSize());
		classListExample.createCriteria().andClassNameLike("%" + classListFormBean.getClassName() + "%").andCreateManLike("%" + classListFormBean.getCreateMan() + "%");
		List<ClassList> classlist = classListMapper.selectByExampleAndLimit(classListExample);
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