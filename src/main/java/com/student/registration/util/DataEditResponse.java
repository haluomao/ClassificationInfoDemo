package com.student.registration.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

/**
 * Created by haluomao on 14/11/22.
 */
public class DataEditResponse {
    public static final Logger logger = LoggerFactory.getLogger(DataEditResponse.class);
    private String status;
    private String message;
    private Set<Integer> idset;

    public DataEditResponse(){
        status ="error";
        message="failed";
        idset=null;
    }

    @Override
    public String toString() {
        return "DataBack{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", idset=" + idset +
                '}';
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Set<Integer> getIdset() {
        return idset;
    }

    public void setIdset(Set<Integer> idset) {
        this.idset = idset;
    }
}
