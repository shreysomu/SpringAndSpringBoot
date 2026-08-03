package com.cruddemo.crudSpringBootDemo.service;

import com.cruddemo.crudSpringBootDemo.entity.Student;
import com.cruddemo.crudSpringBootDemo.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    public Student createStudent(Student studentReq){
        //business logic
        //store to db

        System.out.println("Inside student service");
        Student studentResp = studentRepository.saveStudent(studentReq);
        System.out.println("Exiting student service");
        return studentResp;
    }
}
