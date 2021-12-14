package com.studentJpa.project.controller;

import com.studentJpa.project.model.StudentModel;
import com.studentJpa.project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add-Students")
    public void  add(@RequestBody StudentModel newStudent) {studentService.addStudents(newStudent);}

    @RequestMapping("/get-all-students")
    public List<StudentModel> getStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/get-student-byId")
    public StudentModel getStudentById(@PathVariable Long id){
        return studentService.getById(id);
    }
}
