package com.demo.controller;

import com.demo.entity.TeacherCourse;
import com.demo.service.TeacherCourseService;
import com.demo.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 教师课程类控制层
 * Created by nhsoft.cyf on 2019-01-23 11:27
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("teacherCourse")
public class TeacherCourseController {

    @Autowired
    private TeacherCourseService teacherCourseService;

    /**
     * 插入教师课程信息
     * @param teacherCourse 教师课程信息
     * @return 插入结果
     */
    @RequestMapping("saveTeacherCourse")
    public Result saveTeacherCourse(TeacherCourse teacherCourse) {
        try {
            teacherCourseService.saveTeacherCourse(teacherCourse);
            return new Result(true,"插入教师课程信息成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"插入教师课程信息失败");
        }
    }

    /**
     * 查询所有教师课程信息
     * @return 所有教师课程信息
     */
    @RequestMapping("listTeacherCourse")
    public List<TeacherCourse> listTeacherCourse() {
        return teacherCourseService.listTeacherCourse();
    }

    /**
     * 根据教师号查询对应课程信息
     * @param teacherNum 教师号
     * @return 对应课程信息
     */
    @RequestMapping("listTeacherCourseByTeacherNum")
    public List<TeacherCourse> listTeacherCourseByTeacherNum(Integer teacherNum) {
        return teacherCourseService.listTeacherCourseByTeacherNum(teacherNum);
    }

    /**
     * 删除教师课程信息
     * @param teacherCourse 教师课程信息
     * @return 删除结果
     */
    @RequestMapping("deleteTeacherCourse")
    @ResponseBody
    public Result deleteTeacherCourse(TeacherCourse teacherCourse) {
        try {
            teacherCourseService.deleteTeacherCourse(teacherCourse);
            return new Result(true,"删除教师课程信息成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除教师课程信息失败");
        }
    }

    /**
     * 修改教师课程信息
     * @param teacherCourse 需要修改的信息
     * @param teacherNum_before 修改前教师号
     * @param courseNum_before 修改前课程号
     * @param classroom_before 修改前班级
     * @return 修改结果
     */
    @RequestMapping("updateTeacherCourse")
    @ResponseBody
    public Result updateTeacherCourse(@Param("teacherCourse") TeacherCourse teacherCourse, @Param("teacherNum_before")Integer teacherNum_before,
           @Param("courseNum_before") Integer courseNum_before, @Param("classroom_before") Integer classroom_before) {
        try {
            teacherCourseService.updateTeacherCourse(teacherCourse,teacherNum_before,courseNum_before,classroom_before);
            return new Result(true,"修改教师课程信息成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改教师课程信息失败");
        }
    }
}
