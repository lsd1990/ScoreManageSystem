package com.demo.entity;

import java.io.Serializable;

/**
 * 课程类
 * Created by nhsoft.cyf on 2019-01-19 14:26
 */
public class Course implements Serializable {
    //课程号
    private  Integer courseNum;
    //课程名
    private  String  courseName;

    public Integer getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(Integer courseNum) {
        this.courseNum = courseNum;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "course{" +
                "courseNum=" + courseNum +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
