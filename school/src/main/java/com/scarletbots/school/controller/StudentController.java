package com.scarletbots.school.controller;

import com.scarletbots.school.model.Course;
import com.scarletbots.school.model.Student;
import com.scarletbots.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students/{studentId}/courses")
    public List<Course> retrieveCoursesOfStudent(@PathVariable String studentId) {
        return studentService.retrieveCourses(studentId);
    }

    @GetMapping("/students/{studentId}")
    public Student retrieveStudent(@PathVariable String studentId) {
        return studentService.retrieveStudent(studentId);
    }

}
