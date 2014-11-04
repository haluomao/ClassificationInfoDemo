package ControllerTest;

import com.student.registration.controller.AccountController;
import com.student.registration.model.ClassList;
import com.student.registration.service.ClassListService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by Administrator on 2014/10/30.
 */
public class AccountControllerTest {

	@Test
	public void pageListTest() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		AccountController accountController = (AccountController)ctx.getBean("AccountController");

		System.out.println(accountController.pageList(-1,10));
	}
}
