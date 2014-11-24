package util;

import com.student.registration.util.UtilMethod;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by haluomao on 14/11/19.
 */
public class UtilTest {
    @Test
    public void testClassMakeup(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "");
        map.put("code", null);
        map.put("num", 5);

        TestB testB = UtilMethod.ClassMakeup(TestB.class, map);
        System.out.println(testB.toString());

    }
}
