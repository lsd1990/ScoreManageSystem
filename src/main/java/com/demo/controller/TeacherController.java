package com.demo.controller;

import com.demo.entity.Teacher;
import com.demo.service.TeacherService;
import com.demo.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 教师类控制层
 * Created by nhsoft.cyf on 2019-01-21 16:35
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    /**
     * 查询所有教师
     * @return 所有教师
     */
    @RequestMapping("listTeacher")
    public List<Teacher> listTeacher() {
       return teacherService.listTeacher();
    }

    /**
     * 保存教师
     * @param teacher 教师
     * @return 保存结果
     */
    @RequestMapping("saveTeacher")
    public Result saveTeacher(Teacher teacher) {
        try {
            teacherService.saveTeacher(teacher);
            return new Result(true,"保存成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"保存失败");
        }
    }

    /**
     * 根据教师号删除教师
     * @param teacherNum 教师号
     * @return 删除结果
     */
    @RequestMapping("deleteTeacher")
    public Result deleteTeacher(Integer teacherNum) {
        try {
            teacherService.deleteTeacher(teacherNum);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    /**
     * 修改教师
     * @param teacher 教师
     * @return 修改结果
     */
    @RequestMapping("updateTeacher")
    public Result updateTeacher(Teacher teacher) {
        try {
            teacherService.updateTeacher(teacher);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }

}
