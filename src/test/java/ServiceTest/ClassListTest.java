package ServiceTest;

import com.student.registration.model.ClassList;
import com.student.registration.service.ClassListService;
import com.student.registration.service.UserService;
import com.student.registration.service.impl.ClassListServiceImpl;
import com.student.registration.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Objects;
import java.util.Random;

/**
 * Created by Administrator on 2014/10/30.
 */
public class ClassListTest {

	@Test
	public void addClassListTest(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//		ClassListService classListService = new ClassListServiceImpl();
//		System.out.print(ctx.getBean("ClassListServiceImpl").);

		ClassListService classListService = (ClassListService)ctx.getBean("ClassListServiceImpl");
//		UserService userService = (UserService) ctx.getBean("UserServiceImpl");

		int count = 99;
		ClassList cl;
		for(int i = 0; i<count; i++)
		{
			Random r = new Random();
            int rand = r.nextInt(1000000);
			cl = new ClassList();
			cl.setClassPid(rand);
			cl.setClassName("名称" + rand);
			cl.setDefaultStatName("状态名称" + rand);
			cl.setDefaultIsCheck("1");
			cl.setDefaultUserYear(rand);
			cl.setDeprTypeId(1);
			cl.setCreateMan("创建人" + rand);
			cl.setModifyMan("修改人" + rand);
			cl.setClassType("t");

            System.out.println(cl.getClassPid()+" "+cl.getClassName()+
                    " "+cl.getDefaultStatName()+" "+cl.getDefaultIsCheck()+" "+cl.getCreateMan());

			int res = classListService.addClassList(cl);
            System.out.println("res:"+res);
		}
	}



}
