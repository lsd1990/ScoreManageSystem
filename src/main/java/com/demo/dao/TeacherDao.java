package com.demo.dao;

import com.demo.entity.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * 教师类dao层
 * Created by nhsoft.cyf on 2019-01-21 15:46
 */
@Repository
public interface TeacherDao {

    /**
     * 保存教师
     * @param teacher 教师
     */
    void saveTeacher(Teacher teacher);


    /**
     * 查询所有教师
     * @return 所有教师
     */
    List<Teacher> listTeacher();

    /**
     * 根据教师号删除教师
     * @param teacherNum 教师号
     */
    void deleteTeacher(Integer teacherNum);

    /**
     * 修改教师
     * @param  teacher 教师
     */
    void updateTeacher(Teacher teacher);

}
