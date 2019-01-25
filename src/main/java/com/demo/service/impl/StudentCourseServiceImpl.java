package com.demo.service.impl;

import com.demo.dao.StudentCourseDao;
import com.demo.entity.StudentCourse;
import com.demo.service.StudentCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 学生课程类服务层实现类
 * Created by nhsoft.cyf on 2019-01-22 11:32
 */
@Service
public class StudentCourseServiceImpl implements StudentCourseService {

    @Autowired
    private StudentCourseDao studentCourseDao;


    @Override
    public List<StudentCourse> listStudentCourse() {
        return studentCourseDao.listStudentCourse();
    }

    @Override
    public List<StudentCourse> listStudentCourseByStudentNum(Integer studentNum) {
        return studentCourseDao.listStudentCourseByStudentNum(studentNum);
    }

    @Override
    public void saveStudentCourseWithoutScore(StudentCourse studentCourse) {
        studentCourseDao.saveStudentCourseWithoutScore(studentCourse);
    }

    @Override
    public void updateStudentCourseWithoutScore(StudentCourse studentCourse,Integer courseNum_before) {
        studentCourseDao.updateStudentCourseWithoutScore(studentCourse,courseNum_before);
    }

    @Override
    public void deleteStudentCourse(StudentCourse studentCourse) {
        studentCourseDao.deleteStudentCourse(studentCourse);
    }

    @Override
    public void saveOrUpdateStudentCourseScore(StudentCourse studentCourse) {
        studentCourseDao.saveOrUpdateStudentCourseScore(studentCourse);
    }

    @Override
    public Double getAvg(String courseName,String term) {
        return studentCourseDao.getAvg(courseName,term);
    }

    @Override
    public Double getMax(String courseName,String term) {
        return studentCourseDao.getMax(courseName,term);
    }

    @Override
    public Double getMin(String courseName,String term) {
        return studentCourseDao.getMin(courseName, term);
    }


    @Override
    public Double getAvgByTeacherNumAndTerm(Integer teacherNum,Integer courseNum,String term) {
        return studentCourseDao.getAvgByTeacherNumAndTerm(teacherNum,courseNum,term);
    }

    @Override
    public Double getMaxByTeacherNumAndTerm(Integer teacherNum, Integer courseNum,String term) {
        return studentCourseDao.getMaxByTeacherNumAndTerm(teacherNum,courseNum,term);
    }

    @Override
    public Double getMinByTeacherNumAndTerm(Integer teacherNum, Integer courseNum,String term) {
        return studentCourseDao.getMinByTeacherNumAndTerm(teacherNum,courseNum,term);
    }


}
