package com.demo.entity;

import java.io.Serializable;

/**
 * 教师类
 * Created by nhsoft.cyf on 2019-01-21 15:34
 */
public class Teacher implements Serializable {
    //教师号
    private Integer teacherNum;
    //教师姓名
    private String teacherName;

    public Integer getTeacherNum() {
        return teacherNum;
    }

    public void setTeacherNum(Integer teacherNum) {
        this.teacherNum = teacherNum;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherNum=" + teacherNum +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}