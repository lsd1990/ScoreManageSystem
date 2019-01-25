package com.demo.service;

import com.demo.entity.StudentCourse;

import java.util.List;
/**
 * 学生课程类服务层
 * Created by nhsoft.cyf on 2019-01-22 11:09
 */
public interface StudentCourseService {

    /**
     * 查询所有人的学科成绩
     * @return 所有人的学科成绩
     */
    List<StudentCourse> listStudentCourse();

    /**
     * 学生查询本人各学科成绩
     * @param studentNum 学生号
     * @return 各学科成绩
     */
    List<StudentCourse> listStudentCourseByStudentNum(Integer studentNum);

    /**
     * 插入学生的选修学科
     * @param studentCourse 选修学科
     */
    void saveStudentCourseWithoutScore(StudentCourse studentCourse);

    /**
     * 修改学生的选修学科
     * @param studentCourse 选修学科
     * @param courseNum_before 选修前的课程号
     */
    void updateStudentCourseWithoutScore(StudentCourse studentCourse,Integer courseNum_before);

    /**
     * 删除学生的选修学科
     * @param studentCourse 选修学科
     */
    void deleteStudentCourse(StudentCourse studentCourse);

    /**
     * 更新学生分数
     * @param studentCourse 选修学科
     */
    void saveOrUpdateStudentCourseScore(StudentCourse studentCourse);

    /**
     * 教学处主任查询学科平均成绩
     * @param courseName 学科名
     * @param term 学期
     * @return 平均成绩
     */
    Double getAvg(String courseName,String term);


    /**
     * 教学处主任查询学科最高分
     * @param courseName 学科名
     * @param term 学期
     * @return 学科最高分
     */
    Double getMax(String courseName,String term);


    /**
     * 教学处主任查询学科最低分
     * @param courseName 学科名
     * @param term 学期
     * @return 学科最低分
     */
    Double getMin(String courseName,String term);

    /**
     * 教学处主任查询某学年教师-学科平均成绩,教师查询本人某学年，学科平均成绩
     * @param teacherNum 教师号
     * @param courseNum 课程号
     * @param term 学期
     * @return 教师-学科平均成绩
     */
    Double getAvgByTeacherNumAndTerm(Integer teacherNum,Integer courseNum,String term);

    /**
     * 教学处主任查询某学年教师-学科最高分,教师查询本人某学年，学科最高分
     * @param teacherNum 教师号
     * @param courseNum 课程号
     * @param term 学期
     * @return 教师-学科最高分
     */
    Double getMaxByTeacherNumAndTerm(Integer teacherNum,Integer courseNum,String term);

    /**
     * 教学处主任查询某学年教师-学科最低分,教师查询本人某学年，学科最低分
     * @param teacherNum 教师号
     * @param courseNum 课程号
     * @param term 学期
     * @return 教师-学科最低分
     */
    Double getMinByTeacherNumAndTerm(Integer teacherNum,Integer courseNum,String term);

}
