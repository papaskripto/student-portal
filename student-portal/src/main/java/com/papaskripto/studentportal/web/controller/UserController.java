package com.papaskripto.studentportal.web.controller;

import com.papaskripto.studentportal.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/users")

public class UserController {

    private final UserService userService;

    public UserController (UserService userService) {
        this.userService = userService;
    }

    public String usersPage (Model model) {
        model.addAttribute("users", this.userService.listAllUsers());
        return "users";
    }
}
