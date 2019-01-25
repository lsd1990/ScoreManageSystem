package com.demo.controller;

import com.demo.entity.Student;
import com.demo.service.StudentService;
import com.demo.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 学生类控制层
 * Created by nhsoft.cyf on 2019-01-21 15:03
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/student")
public class StudentController {


    @Autowired
    private StudentService studentService;

    /**
     * 查询所有学生
     * @return 所有学生
     */
    @RequestMapping("listStudent")
    public List<Student> listStudent() {
       return studentService.listStudent();

    }

    /**
     * 保存学生
     * @param student 学生
     * @return 保存结果
     */
    @RequestMapping("saveStudent")
    public Result saveStudent(Student student) {
        try {
            studentService.saveStudent(student);
            return new Result(true,"保存成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"保存失败");
        }
    }

    /**
     * 根据学生号删除学生
     * @param studentNum 学生号
     * @return 删除结果
     */
    @RequestMapping("deleteStudent")
    public Result deleteStudent(Integer studentNum) {
        try {
            studentService.deleteStudent(studentNum);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    /**
     * 修改学生
     * @param student 学生
     * @return 修改结果
     */
    @RequestMapping("updateStudent")
    public Result updateStudent(Student student) {
        try {
            studentService.updateStudent(student);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }


}
