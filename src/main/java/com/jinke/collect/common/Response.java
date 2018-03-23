package com.jinke.collect.common;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Response {

    private Integer code = 0;
    private String message = "";
    private Map data = new HashMap<String, Object>();

    public Response setCode(Integer code) {
        this.code = code;
        return this;
    }


    public Response setMessage(String message) {
        this.message = message;
        return this;
    }

    public Response setData(Map data) {
        this.data = data;
        return this;
    }

    public Response put(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

}
