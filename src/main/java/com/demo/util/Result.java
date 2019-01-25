package com.demo.util;
/**
 * 返回结果的封装类
 * Created by nhsoft.cyf on 2019-01-19 15:36
 */
public class Result {
    //状态
    private Boolean status;
    //描述信息
    private String message;

    public Result(Boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    public Result() {
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
