package com.student.registration.util;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by haluomao on 14/11/04.
 */
@Deprecated
public class JsonUtil {
    protected static ObjectMapper mapper = new ObjectMapper();

    public static ObjectMapper getMapper() {
        return mapper;
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
}
