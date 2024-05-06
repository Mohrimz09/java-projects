package com.May.May.controller;


import com.May.May.Entity.Student;
import com.May.May.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/addStudent")
    public Student postDetails(@RequestBody Student student)
    {
        return studentService.saveDetails(student);
    }

}
