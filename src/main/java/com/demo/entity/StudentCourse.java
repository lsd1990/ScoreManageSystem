package com.demo.entity;

import java.io.Serializable;

/**
 * 学生课程类
 * Created by nhsoft.cyf on 2019-01-22 09:32
 */
public class StudentCourse implements Serializable {
    //学生学号
    private  Integer studentNum;
    //课程号
    private  Integer  courseNum;
    //课程名
    private  String courseName;
    //分数
    private  Integer score;
    //学年
    private  String term;

    public Integer getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(Integer studentNum) {
        this.studentNum = studentNum;
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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    @Override
    public String toString() {
        return "StudentCourse{" +
                "studentNum=" + studentNum +
                ", courseNum=" + courseNum +
                ", courseName='" + courseName + '\'' +
                ", score=" + score +
                ", term='" + term + '\'' +
                '}';
    }
}
