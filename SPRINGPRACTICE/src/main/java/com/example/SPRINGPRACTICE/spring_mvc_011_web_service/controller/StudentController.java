package com.example.SPRINGPRACTICE.spring_mvc_011_web_service.controller;


import com.example.SPRINGPRACTICE.spring_mvc_011_web_service.model.Student;
import com.example.SPRINGPRACTICE.spring_mvc_011_web_service.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@AllArgsConstructor


public class StudentController {


    private StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") int id) {
        studentService.deleteStudent(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable("id") int id) {
        return new ResponseEntity<>(studentService.getStudent(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }

}
