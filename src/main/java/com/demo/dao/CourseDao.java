package com.demo.dao;

import com.demo.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * 课程类dao层
 * Created by nhsoft.cyf on 2019-01-19 14:36
 */
@Repository
public interface CourseDao {

    /**
     * 保存课程
     * @param course 课程
     */
    void saveCourse(Course course);

    /**
     * 查询所有课程
     * @return 所有课程的集合
     */
    List<Course> listCourse();

    /**
     * 根据课程号删除课程
     * @param courseNum 课程号
     */
    void deleteCourse(Integer courseNum);

    /**
     * 修改课程
     * @param course 课程
     */
    void updateCourse(Course course);

}
