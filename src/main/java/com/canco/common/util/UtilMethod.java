package com.canco.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.*;

/**
 * Created by haluomao on 14/11/19.
 */
public class UtilMethod {
    public static final Logger logger = LoggerFactory.getLogger(UtilMethod.class);

    /**
     * 如className -> class_Name
     * @param origin
     * @return
     */
    public static String TurnUpperCase2Underline(String origin){
        if(origin==null || "".equals(origin)) return origin;
        String result="";
        for(int i=0; i<origin.length(); i++){
            char c= origin.charAt(i);
            if(Character.isUpperCase(c)){
                result += "_";
            }
            result +=c;
        }
        return  result;
    }
    /**
     * 如"1,2,3" ->[1,2,3]
     * @param origin
     * @return
     */
    public static Set<Integer> TurnString2Set(String origin){
        if(origin==null || "".equals(origin)) return null;
        Set<Integer> result = new HashSet<Integer>();
        String [] arr = origin.split(",");
        for(int i=0; i<arr.length; i++){
            String obj = arr[i];
            result.add(Integer.valueOf(obj));
        }
        return  result;
    }

    /**
     * 将请求转为<key,value>的map
     * @param req
     * @return
     */
    public static Map TurnRequest2Map(HttpServletRequest req){
        // 参数Map
        Map properties = req.getParameterMap();
        // 返回值Map
        Map returnMap = new HashMap();
        Iterator entries = properties.entrySet().iterator();
        Map.Entry entry;
        String name, value = "";
        while (entries.hasNext()) {
            entry = (Map.Entry) entries.next();
            name = (String) entry.getKey();
            Object valueObj = entry.getValue();
            if(null == valueObj){
                value = "";
            }else if(valueObj instanceof String[]){
                String[] values = (String[])valueObj;
                for(int i=0;i<values.length;i++){
                    value = values[i] + ",";
                }
                value = value.substring(0, value.length()-1);
            }else{
                value = valueObj.toString();
            }
            //in http request
            if("_empty".equals(value)) value="";
            returnMap.put(name, value);
        }
        return returnMap;
    }


    /**
     * The map should be like this:
     * {name="name", code=5}
     * @param map
     * @param <T>
     * @return
     */
    public static <T>  T ClassMakeup(Class<T> tClass, Map<String, Object> map) {
        T entity = null;
        Iterator iterator = map.keySet().iterator();
        Object value =null;
        try {
            entity = tClass.newInstance();
            String key ;
            while (iterator.hasNext()) {
                key = (String) iterator.next();
//                if(key.indexOf('.')!=-1) {
//                    key = key.substring(key.indexOf('.') + 1);
//                }
                value = map.get(key);

                if (entity != null) {
                    Class c = Class.forName(tClass.getName());
                    Method m[] = c.getDeclaredMethods();
                    for (int i = 0; i < m.length; i++) {
                        //Search the setter method like setName()
                        if(key.indexOf('.')!=-1) {
                            key = key.substring(key.indexOf('.') + 1);
                        }
                        if (m[i].getName().equals("set" + key.substring(0, 1).toUpperCase() + key.substring(1))) {
                            logger.info(m[i].getName()+" value:" + value);
                            //There may exist some unexpected errors.
                            Type type=m[i].getParameterTypes()[0];
                            if(type.toString().contains("Integer")||type.toString().contains("int") ) {
                                if("".equals(value)) continue;
                                value = Integer.valueOf(String.valueOf(value));
                            }
                            else if(type.toString().contains("Double")) {
                                value = Double.valueOf(String.valueOf(value));
                            }else {
                                //more type will be checked and added
                            }
                            m[i].invoke(entity, value);
                            break;
                        }
                    }
                }
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {

            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entity;
    }

    /**
     * for test
     * @param args
     */
    public static void main(String []args){
        System.out.println(UtilMethod.TurnUpperCase2Underline("classId"));
        System.out.println(UtilMethod.TurnString2Set("1,2,3"));
    }
}
