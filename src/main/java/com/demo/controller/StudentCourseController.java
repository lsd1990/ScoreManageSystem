package com.demo.controller;

import com.demo.entity.StudentCourse;
import com.demo.service.StudentCourseService;
import com.demo.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.DoubleSummaryStatistics;
import java.util.List;

/**
 * 学生课程类控制层
 * Created by nhsoft.cyf on 2019-01-22 11:52
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("studentCourse")
public class StudentCourseController {

    @Autowired
    private StudentCourseService studentCourseService;

    /**
     * 查询所有人的学科成绩
     * @return 所有人的学科成绩
     */
    @RequestMapping("listStudentCourse")
    public List<StudentCourse> listStudentCourse() {
        return studentCourseService.listStudentCourse();
    }

    /**
     * 学生查询本人各学科成绩
     * @param studentNum 学生号
     * @return 各学科成绩
     */
    @RequestMapping("listStudentCourseByStudentNum")
    public List<StudentCourse> listStudentCourseByStudentNum(Integer studentNum) {
        return studentCourseService.listStudentCourseByStudentNum(studentNum);
    }

    /**
     * 插入学生的选修学科
     * @param studentCourse 选修学科
     * @return 插入结果
     */
    @RequestMapping("saveStudentCourseWithoutScore")
    public Result saveStudentCourseWithoutScore(StudentCourse studentCourse) {
        try {
            studentCourseService.saveStudentCourseWithoutScore(studentCourse);
            return new Result(true,"插入选修学科成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"插入选修学科失败");
        }
    }

    /**
     * 修改学生的选修学科
     * @param studentCourse  学生的选修学科
     * @param courseNum_before 修改前课程号
     * @return 修改结果
     */
    @RequestMapping("updateStudentCourseWithoutScore")
    public Result updateStudentCourseWithoutScore(@Param("studentCourse") StudentCourse studentCourse, @Param("courseNum_before")Integer courseNum_before) {
        try {
            studentCourseService.updateStudentCourseWithoutScore(studentCourse,courseNum_before);
            return new Result(true,"修改选修学科成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改选修学科失败");
        }
    }

    /**
     * 删除学生的选修学科
     * @param studentCourse 学生的选修学科
     * @return 删除结果
     */
    @RequestMapping("deleteStudentCourse")
    public Result deleteStudentCourse(StudentCourse studentCourse) {
        try {
            studentCourseService.deleteStudentCourse(studentCourse);
            return new Result(true,"删除选修学科成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除选修学科失败");
        }
    }

    /**
     * 更新学生分数
     * @param studentCourse 学生的选修学科
     * @return 更新结果
     */
    @RequestMapping("saveOrUpdateStudentCourseScore")
    public Result saveOrUpdateStudentCourseScore(StudentCourse studentCourse) {
        try {
            studentCourseService.saveOrUpdateStudentCourseScore(studentCourse);
            return new Result(true,"更新分数成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"更新分数失败");
        }
    }

    /**
     * 教学处主任查询学科平均成绩
     * @param courseName 课程名称
     * @param term 学期
     * @return 学科平均成绩
     */
    @RequestMapping("readAvg")
    public Double getAvg(@Param("courseName") String courseName,@Param("term")String term) {
        return studentCourseService.getAvg(courseName,term);
    }

    /**
     * 教学处主任查询学科最高分
     * @param courseName 课程名称
     * @param term 学期
     * @return 学科最高分
     */
    @RequestMapping("readMax")
    public Double getMax(@Param("courseName") String courseName,@Param("term")String term) {
        return studentCourseService.getMax(courseName,term);
    }

    /**
     * 教学处主任查询学科最低分
     * @param courseName 课程名称
     * @param term 学期
     * @return 学科最低分
     */
    @RequestMapping("readMin")
    public Double getMin(@Param("courseName") String courseName,@Param("term")String term) {
        return studentCourseService.getMin(courseName,term);
    }

    /**
     * 教学处主任查询某学年教师-学科平均成绩,教师查询本人某学年，学科平均成绩
     * @param teacherNum 教师号
     * @param courseNum 课程号
     * @param term 学期
     * @return 某学年教师-学科平均成绩
     */
    @RequestMapping("readAvgByTeacherNumAndTerm")
    public Double getAvgByTeacherNumAndTerm(@Param("teacherNum") Integer teacherNum,@Param("courseNum")Integer courseNum,@Param("term")String term) {
        return studentCourseService.getAvgByTeacherNumAndTerm(teacherNum,courseNum,term);
    }

    /**
     *教学处主任查询某学年教师-学科最高分,教师查询本人某学年，学科最高分
     * @param teacherNum 教师号
     * @param courseNum 课程号
     * @param term 学期
     * @return 某学年教师-学科最高分
     */
    @RequestMapping("readMaxByTeacherNumAndTerm")
    public Double getMaxByTeacherNumAndTerm(@Param("teacherNum") Integer teacherNum,@Param("courseNum")Integer courseNum,@Param("term")String term) {
        return studentCourseService.getMaxByTeacherNumAndTerm(teacherNum,courseNum,term);
    }

    /**
     * 教学处主任查询某学年教师-学科最低分,教师查询本人某学年，学科最低分
     * @param teacherNum 教师号
     * @param courseNum 课程号
     * @param term 学期
     * @return 某学年教师-学科最低分
     */
    @RequestMapping("readMinByTeacherNumAndTerm")
    public Double getMinByTeacherNumAndTerm(@Param("teacherNum") Integer teacherNum,@Param("courseNum")Integer courseNum,@Param("term")String term) {
        return studentCourseService.getMinByTeacherNumAndTerm(teacherNum,courseNum,term);
    }
}

