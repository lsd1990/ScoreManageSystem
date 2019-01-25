package com.demo.service.impl;

import com.demo.dao.CourseDao;
import com.demo.entity.Course;
import com.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 课程类服务层实现类
 * Created by nhsoft.cyf on 2019-01-19 15:19
 */
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;


    @Override
    public void saveCourse(Course course) {
        courseDao.saveCourse(course);
    }


    @Override
    public List<Course> listCourse() {
        return courseDao.listCourse();
    }

    @Override
    public void deleteCourse(Integer courseNum) {
        courseDao.deleteCourse(courseNum);
    }

    @Override
    public void updateCourse(Course course) {
        courseDao.updateCourse(course);
    }

}
