package com.canco.common.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by haluomao on 14/11/04.
 */

@Deprecated
public class JsonUtil {
    protected static ObjectMapper mapper = new ObjectMapper();

    static {
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
    }
    public static ObjectMapper getMapper() {
        return mapper;
    }

    public static String WriteValueAsString(Object obj) throws JsonProcessingException {
        return mapper.writeValueAsString(obj);
    }
    //////////////// JSON Usage //////////////////////////////
    /* *****************************************************
    mapper.writeValue(new File("result.json"), myResultObject);
    // or:
    byte[] jsonBytes = mapper.writeValueAsBytes(myResultObject);
    // or:
    String jsonString = mapper.writeValueAsString(myResultObject);

    //Read
    Map<String, Integer> scoreByName = mapper.readValue(jsonSource, Map.class);
    List<String> names = mapper.readValue(jsonSource, List.class);

    ******************************************************* */

//    public static void main(String[] args) {
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("key","Object");
//        try {
//            System.out.println(JsonUtil.WriteValueAsString(map));
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
//    }
}
