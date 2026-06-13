package com.papaskripto.studentportal.web.controller;

import com.papaskripto.studentportal.service.SubjectService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping ("/subjects")

public class SubjectController {

    private final SubjectService subjectService;

    public SubjectController (SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    public String subjectsPage (Model model) {
        model.addAttribute("subjects", this.subjectService.listAllSubjects());
        return "subjects";
    }
}
