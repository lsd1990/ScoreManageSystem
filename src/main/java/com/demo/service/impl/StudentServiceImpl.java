package com.demo.service.impl;

import com.demo.dao.StudentDao;
import com.demo.entity.Student;
import com.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 学生类服务层实现类
 * Created by nhsoft.cyf on 2019-01-21 14:54
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;


    @Override
    public void saveStudent(Student student) {
        studentDao.saveStudent(student);
    }

    @Override
    public List<Student> listStudent() {
        return studentDao.listStudent();
    }

    @Override
    public void deleteStudent(Integer studentNum) {
        studentDao.deleteStudent(studentNum);
    }

    @Override
    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }
}
