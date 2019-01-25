package com.demo.entity;

import java.io.Serializable;

/**
 * 学生类
 * Created by nhsoft.cyf on 2019-01-21 14:01
 */
public class Student implements Serializable {
    //学生学号
    private  Integer studentNum;
    //学生姓名
    private  String  studentName;
    //所属班级
    private  Integer classroom;

    public Integer getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(Integer studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getClassroom() {
        return classroom;
    }

    public void setClassroom(Integer classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNum=" + studentNum +
                ", studentName='" + studentName + '\'' +
                ", classroom=" + classroom +
                '}';
    }
}
