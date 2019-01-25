package com.demo.entity;

import java.io.Serializable;

/**
 * 教师课程类
 * Created by nhsoft.cyf on 2019-01-23 09:16
 */
public class TeacherCourse implements Serializable {
    //教师号
    private  Integer teacherNum;
    //课程号
    private  Integer  courseNum;
    //课程名
    private  String courseName;
    //所带班级
    private  Integer classroom;

    public Integer getTeacherNum() {
        return teacherNum;
    }

    public void setTeacherNum(Integer teacherNum) {
        this.teacherNum = teacherNum;
    }

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

    public Integer getClassroom() {
        return classroom;
    }

    public void setClassroom(Integer classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "TeacherCourse{" +
                "teacherNum=" + teacherNum +
                ", courseNum=" + courseNum +
                ", courseName='" + courseName + '\'' +
                ", classroom=" + classroom +
                '}';
    }
}
