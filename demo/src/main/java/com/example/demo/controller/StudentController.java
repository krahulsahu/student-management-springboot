package com.example.demo.controller;


import com.example.demo.enitity.Student;
import com.example.demo.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping()
    public Student createStudentData(@Valid @RequestBody Student student){
        System.out.println("Received student: " + student);
        return studentService.createStudentData(student);
    }

    @GetMapping()
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable String id){
        return studentService.getStudentById(id);
    }
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable String id,@RequestBody Student updatedStudent){
        return studentService.updateStudentById(id, updatedStudent);
    }


    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable String id){
        studentService.deleteStudentById(id);
    }



}
