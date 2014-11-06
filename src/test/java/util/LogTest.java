package util;

import com.student.registration.service.ClassListService;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by haluomao on 14/11/03.
 */
public class LogTest {
    public static final Logger logger = LoggerFactory.getLogger(LogTest.class);

    @Test
    public void logtest(){
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//		ClassListService classListService = new ClassListServiceImpl();
//		System.out.print(ctx.getBean("ClassListServiceImpl").);

//        ClassListService classListService = (ClassListService)ctx.getBean("ClassListServiceImpl");
//		UserService userService = (UserService) ctx.getBean("UserServiceImpl");

        //PropertyConfigurator.configure("log4j.properties");
        System.setProperty("log4j.configuration", "log4j.properties");

        logger.debug("test start");
        logger.info("test info");
        logger.error("test error");
        logger.warn("test warn");
    }
}
