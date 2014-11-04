package com.student.registration.service;

import com.student.registration.model.ClassList;

import java.util.List;

/**
 * Created by Administrator on 2014/10/30.
 */
public interface ClassListService {

	public List<ClassList> findClassList();

	public int addClassList(ClassList cl);

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

	public int modifyOneRecord(ClassList classList);

	public int deleteByClassId(int classId);

	public List<ClassList> selectByClassNameAndCreateMan(String className,String createMan);

	public int countClassList();

}
