package ServiceTest;

import com.student.registration.model.ClassList;
import com.student.registration.service.ClassListService;
import com.student.registration.service.UserService;
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
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ClassListService classListService = (ClassListService)ctx.getBean("ClassListServiceImpl");

		int count = 100;
		ClassList cl;
		for(int i = 0; i<count; i++)
		{
			Random r = new Random();
            int rand = r.nextInt(1000000);
			cl = new ClassList();
			cl.setClassPid(rand);
			cl.setClassName("名称_" + rand);
			cl.setDefaultStatName("状态名称_" + rand);
			cl.setDefaultIsCheck("1");
			cl.setDefaultUserYear(rand);
			cl.setDeprTypeId(1);
			cl.setCreateMan("创建人_" + rand);
			cl.setModifyMan("修改人_" + rand);
			cl.setClassType("t");
			cl.setCreateDate(new Date());

            System.out.println(cl.getClassPid()+" "+cl.getClassName()+
                    " "+cl.getDefaultStatName()+" "+cl.getDefaultIsCheck()+" "+cl.getCreateMan());

			int res = classListService.addClassList(cl);
            System.out.println("res:"+res);
		}
	}

	@Test
	public void findClassListTest(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ClassListService classListService = (ClassListService)ctx.getBean("ClassListServiceImpl");
		List<ClassList> cl_list = classListService.findClassList();
		System.out.println(cl_list);
//		Iterator itr = cl_list.iterator();
//		while (itr.hasNext()) {
//			ClassList cl = (ClassList) itr.next();
//			System.out.println(cl.getClassName() + " | " + cl.getCreateDate() + " | " + cl.getModifyDate());
//		}



	}
	@Test
	public void Query() throws Exception {
//		String username = "username_2";
//		String password = "password_2";
//		UserService um = new UserServiceImpl();
//		User u = new User();
//		u.setUsername(username);
//		u.setPassword(password);
//		if(!um.exists(u)){
//			um.add(u);
//			u.setUsername(username);
//			u.setPassword(password);
//			boolean exists = um.exists(u);
//			Assert.assertEquals(true,exists);   //执行测试的预期结果与实际结果是否符合
//		}
//		else
//			Assert.fail("not added");
//		//fail("Not yet implemented");

		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserService userService = (UserService)ctx.getBean("UserServiceImpl");

//		userService.query();

	}
}
