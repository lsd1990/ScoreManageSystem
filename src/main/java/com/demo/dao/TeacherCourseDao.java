package com.demo.dao;

import com.demo.entity.TeacherCourse;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * 教师课程类dao层
 * Created by nhsoft.cyf on 2019-01-23 09:34
 */
@Repository
public interface TeacherCourseDao {

    /**
     * 插入教师课程信息
     * @param teacherCourse 教师课程信息
     */
    void saveTeacherCourse(TeacherCourse teacherCourse);

    /**
     * 查询所有教师课程信息
     * @return 所有教师课程信息
     */
    List<TeacherCourse> listTeacherCourse();

    /**
     * 根据教师号查询对应课程信息
     * @param teacherNum 教师号
     * @return  对应课程信息
     */
    List<TeacherCourse> listTeacherCourseByTeacherNum(Integer teacherNum);

    /**
     * 删除教师课程信息
     * @param teacherCourse 教师课程信息
     */
    void deleteTeacherCourse(TeacherCourse teacherCourse);

    /**
     * 修改教师课程信息
     * @param teacherCourse 需要修改的信息
     * @param teacherNum_before 修改前教师号
     * @param courseNum_before 修改前课程号
     * @param classroom_before 修改前班级
     */
    void updateTeacherCourse(TeacherCourse teacherCourse,
         Integer teacherNum_before,Integer courseNum_before,Integer classroom_before);


}
