package com.demo.service.impl;

import com.demo.dao.TeacherDao;
import com.demo.entity.Teacher;
import com.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 教师类服务层实现类
 * Created by nhsoft.cyf on 2019-01-21 16:26
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;


    @Override
    public void saveTeacher(Teacher teacher) {
        teacherDao.saveTeacher(teacher);
    }

    @Override
    public List<Teacher> listTeacher() {
        return teacherDao.listTeacher();
    }

    @Override
    public void deleteTeacher(Integer teacherNum) {
        teacherDao.deleteTeacher(teacherNum);
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        teacherDao.updateTeacher(teacher);
    }
}