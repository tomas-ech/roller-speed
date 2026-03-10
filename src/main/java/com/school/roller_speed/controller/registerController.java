package com.school.roller_speed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class registerController {

    @GetMapping("/student")
    public String formStudent() {
        return "register/student";
    }

    @GetMapping("/instructor")
    public String formInstructor() {
        return "register/instructor";
    }
    
}
