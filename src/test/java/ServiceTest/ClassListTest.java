package ServiceTest;

import com.student.registration.model.ClassList;
import com.student.registration.service.ClassListService;
import com.student.registration.service.UserService;
import com.student.registration.vo.ClassListFormBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

/**
 * Created by Administrator on 2014/10/30.
 */
public class ClassListTest {

	@Test
	public void addClassListTest(){
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//		ClassListService classListService = (ClassListService)ctx.getBean("ClassListServiceImpl");
//
//		int count = 500;
//		ClassList cl;
//		for(int i = 0; i<count; i++)
//		{
//			Random r = new Random();
//            int rand = r.nextInt(100000000);
//			cl = new ClassList();
//			cl.setClassPid(rand);
//			cl.setClassName("名称_" + rand);
//			cl.setDefaultStatName("状态名称_" + rand);
//			cl.setDefaultIsCheck("1");
//			cl.setDefaultUserYear(rand);
//			cl.setDeprTypeId(1);
//			cl.setCreateMan("创建人_" + rand);
//			cl.setModifyMan("修改人_" + rand);
//			cl.setClassType("t");
//			cl.setCreateDate(new Date());

//            classListService.addClassList(cl);
//          System.out.println("res:"+res);
//		}
	}

//	@Test
//	public void findClassListTest(){
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//		ClassListService classListService = (ClassListService)ctx.getBean("ClassListServiceImpl");
//		List<ClassList> cl_list = classListService.findClassList();
//		System.out.println(cl_list);
////		Iterator itr = cl_list.iterator();
////		while (itr.hasNext()) {
////			ClassList cl = (ClassList) itr.next();
////			System.out.println(cl.getClassName() + " | " + cl.getCreateDate() + " | " + cl.getModifyDate());
////		}
//
//	}
//	@Test
//	public void SelectByClassNameTest() throws Exception {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//		ClassListService classListService = (ClassListService)ctx.getBean("ClassListServiceImpl");
//		System.out.println(classListService.selectByClassName("09"));
//	}
//
//	@Test
//	public void listByLimitTest() throws Exception {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//		ClassListService classListService = (ClassListService)ctx.getBean("ClassListServiceImpl");
//		System.out.println(classListService.listByLimit(90, 10, 0));
//	}
//
//	@Test
//	public void modifyOneRecordTest() throws Exception {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//		ClassListService classListService = (ClassListService)ctx.getBean("ClassListServiceImpl");
//		List<ClassList> classList = classListService.selectByClassName("名称_813115");
////		classList.setClassId(16);
//		classList.get(0).setClassPid(111114);
////		classList.setCreateDate(new Date());
//		System.out.println(classList.get(0).getClassPid());
//		System.out.println(classListService.modifyOneRecord(classList.get(0)));
//	}
//
//	@Test
//	public void deleteByClassIdTest() throws Exception {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//		ClassListService classListService = (ClassListService)ctx.getBean("ClassListServiceImpl");
//		System.out.println(classListService.deleteByClassId(24));
//	}
//
//	@Test
//	public void selectByClassNameAndCreateManTest() throws Exception {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//		ClassListService classListService = (ClassListService)ctx.getBean("ClassListServiceImpl");
//
//		ClassListFormBean clfb = new ClassListFormBean();
//		clfb.setCreateman("22");
//		clfb.setClassname("8");
//		clfb.setOffset(10);
//		clfb.setPage(2);
//
//		System.out.println(classListService.selectByClassNameAndCreateManAndLimit(clfb));
//	}
}
