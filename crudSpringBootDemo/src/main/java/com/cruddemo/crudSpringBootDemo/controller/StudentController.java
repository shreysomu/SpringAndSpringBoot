package com.cruddemo.crudSpringBootDemo.controller;


import com.cruddemo.crudSpringBootDemo.entity.Student;
import com.cruddemo.crudSpringBootDemo.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    //create Student
    @PostMapping("/create")
    public String  createStudent(@RequestBody Student student){
        System.out.println("Inside student controller");
        Student createStudent = studentService.createStudent(student);
        System.out.println("Exiting student controller");
        return "Student created";
    }

//    public Void(){
//
//    }

    //read Student


    //update Student


    //delete student
}
