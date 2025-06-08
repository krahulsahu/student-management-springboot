package com.example.demo.service;


import com.example.demo.enitity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private final StudentRepository s;

    public StudentService(StudentRepository s) {
        this.s = s;
    }

    public Student createStudentData(Student student) {
        return s.save(student);
    }
    public List<Student> getAllStudent() {
        return s.findAll();
    }

    public Student getStudentById(String id) {
        return s.findById(id).orElse(null);
    }


    public void deleteStudentById(String id) {
        s.deleteById(id);
    }


    public Student updateStudentById(String id, Student updatedStudent) {
        Student existingStudent = s.findById(id).orElse(null);
        if (existingStudent != null) {
            existingStudent.setName(updatedStudent.getName());
            existingStudent.setAge(updatedStudent.getAge());
            existingStudent.setEmail(updatedStudent.getEmail());
            existingStudent.setCourse(updatedStudent.getCourse());
            return s.save(existingStudent);
        }
        return null;
    }
}
