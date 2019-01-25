package com.demo.controller;

import com.demo.entity.Course;
import com.demo.service.CourseService;
import com.demo.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 课程类控制层
 * Created by nhsoft.cyf on 2019-01-19 15:26
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    /**
     * 查所有课程
     * @return 所有课程
     */
    @RequestMapping("listCourse")
    public List<Course> listCourse() {
        return  courseService.listCourse();
    }

    /**
     * 保存课程
     * @param course 课程
     * @return 保存结果
     */
    @RequestMapping("saveCourse")
    public Result saveCourse(Course course) {
        try {
            courseService.saveCourse(course);
            return new Result(true,"保存成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"保存失败");
        }
    }

    /**
     * 根据课程号删除课程
     * @param courseNum 课程号
     * @return 删除结果
     */
    @RequestMapping("deleteCourse")
    public Result deleteCourse(Integer courseNum) {
        try {
            courseService.deleteCourse(courseNum);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    /**
     * 更新课程
     * @param course 课程
     * @return 更新结果
     */
    @RequestMapping("updateCourse")
    public Result updateCourse(Course course) {
        try {
            courseService.updateCourse(course);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }

}
