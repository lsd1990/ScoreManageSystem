package com.demo.service;

import com.demo.entity.Course;

import java.util.List;
/**
 * 课程类服务层
 * Created by nhsoft.cyf on 2019-01-19 14:55
 */
public interface CourseService {
    /**
     * 保存课程
     * @param course
     */
    void saveCourse(Course course);

    /**
     * 查询所有课程
     * @return 所有课程
     */
    List<Course> listCourse();

    /**
     * 根据课程号删除课程
     * @param courseNum 课程号
     */
    void deleteCourse(Integer courseNum);

    /**
     * 更新课程
     * @param course 课程
     */
    void updateCourse(Course course);
}
