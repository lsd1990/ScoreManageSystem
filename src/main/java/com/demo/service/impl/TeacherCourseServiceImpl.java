package com.demo.service.impl;

import com.demo.dao.TeacherCourseDao;
import com.demo.entity.TeacherCourse;
import com.demo.service.TeacherCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 教师课程类服务层实现类
 * Created by nhsoft.cyf on 2019-01-23 10:36
 */
@Service
public class TeacherCourseServiceImpl implements TeacherCourseService {
    @Autowired
    private TeacherCourseDao teacherCourseDao;


    @Override
    public void saveTeacherCourse(TeacherCourse teacherCourse) {
        teacherCourseDao.saveTeacherCourse(teacherCourse);

    }

    @Override
    public List<TeacherCourse> listTeacherCourse() {
        return teacherCourseDao.listTeacherCourse();
    }

    @Override
    public List<TeacherCourse> listTeacherCourseByTeacherNum(Integer teacherNum) {
        return teacherCourseDao.listTeacherCourseByTeacherNum(teacherNum);
    }

    @Override
    public void deleteTeacherCourse(TeacherCourse teacherCourse) {
        teacherCourseDao.deleteTeacherCourse(teacherCourse);
    }

    @Override
    public void updateTeacherCourse(TeacherCourse teacherCourse, Integer teacherNum_before, Integer courseNum_before, Integer classroom_before) {
        teacherCourseDao.updateTeacherCourse(teacherCourse,teacherNum_before,courseNum_before,classroom_before);
    }
}
