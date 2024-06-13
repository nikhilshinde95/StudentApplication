package com.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dao.StudentDao;
import com.org.entities.Student;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> getAllStudent(){
        
        return studentDao.findAll();
    }


    @Override
    public Student getStudent(long studentid){

        return studentDao.findById(studentid).get();
    }

    @Override
    public Student addStudent(Student student){
        
        studentDao.save(student);

        return student;
    }


    @Override
    public Student updateStudent(Student student){
        studentDao.save(student);
        return student;
    }

    @Override
    public void deleteStudent(long studentid){
        studentDao.deleteById(studentid);
    }

    
}
