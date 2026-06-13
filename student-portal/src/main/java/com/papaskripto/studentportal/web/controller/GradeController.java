package com.papaskripto.studentportal.web.controller;

import com.papaskripto.studentportal.service.GradeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping ("/grades")

public class GradeController {

    private final GradeService gradeService;

    public GradeController (GradeService gradeService) {
        this.gradeService = gradeService;
    }

    public String gradesPage (Model model) {
        model.addAttribute("grades", this.gradeService.listAllGrades());
        return "grades";
    }
}
