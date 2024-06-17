package com.wms.common;

import javax.xml.crypto.Data;

public class Result {
    private int code;
    private String msg;
    private Object data;
    private Long total;

    public static Result fail() {
        return result(400,"失败",null,0L);
    }
    public static Result success(Object  data) {
        return result(200,"处理成功",data,0L);
    }

    public static Result success(Object  data,Long total) {
        return result(200,"处理成功",data,total);
    }

    public static Result result(int code, String msg, Object data , Long total) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        result.setTotal(total);
        return result;

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
