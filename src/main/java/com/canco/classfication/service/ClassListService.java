package com.canco.classfication.service;

import com.canco.classfication.model.ClassList;
import com.canco.classfication.vo.ClassListFormBean;
import com.canco.classfication.vo.PageBean;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2014/10/30.
 */
public interface ClassListService {

	public List<ClassList> findClassList();

	public int add(ClassList entity);
    public int delete(Integer id);
    public int update(ClassList entity);
    public ClassList selectById(Integer id);


    public int addClassList(ClassList cl);
    public int modifyOneRecord(ClassList classList);
    /**
     * 返回从begin开始，个数为offset的对象列表，type 0表示正序，1表示逆序。
     * @param begin
     * @param offset
     * @param type
     * @return
     */
    public List<ClassList> listByLimit(int begin, int offset, int type);

    /**
     * 查询名字为name的对象列表，可以模糊搜索。
     * @param name
     * @return
     */
    public List<ClassList> selectByClassName(String name);

	public int deleteByClassId(int classId);

    public ClassList selectByClassId(int classId);

	public List<ClassList> selectByClassNameAndCreateManAndLimit(ClassListFormBean classListFormBean, PageBean pageBean);

	public int countClassList();

	public int countClassListByClassNameAndCreateMan(ClassListFormBean classListFormBean);

    public int count(Map<String, Object> map, ClassList entity);

    public List<ClassList> select(Map<String, Object> map, ClassList entity, String orderByClause, int start, int limit);
}
