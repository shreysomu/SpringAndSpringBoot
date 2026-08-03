package com.cruddemo.crudSpringBootDemo.repository;

import com.cruddemo.crudSpringBootDemo.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {
    public Student saveStudent(Student studentReq){
        //save to db

        System.out.println("Inside student repository");
        System.out.println("Exiting student repository");

        return null;
    }
}
