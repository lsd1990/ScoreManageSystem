package com.demo.service;

import com.demo.entity.Student;

import java.util.List;
/**
 * 学生类服务层
 * Created by nhsoft.cyf on 2019-01-21 14:36
 */
public interface StudentService {
    /**
     * 保存学生
     * @param student 学生
     */
    void saveStudent(Student student);


    /**
     * 查询所有学生
     * @return 所有学生
     */
    List<Student> listStudent();

    /**
     * 根据学生号删除学生
     * @param studentNum 学生号
     */
    void deleteStudent(Integer studentNum);

    /**
     * 修改学生
     * @param  student 学生
     */
    void updateStudent(Student student);

}
