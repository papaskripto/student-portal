package com.papaskripto.studentportal.web.controller;

import com.papaskripto.studentportal.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/students")

public class StudentController {

    private final StudentService studentService;

    public StudentController (StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public String studentsPage (Model model) {
        model.addAttribute("students", this.studentService.listAllStudents());
        return "students";
    }
}
