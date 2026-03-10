package com.school.roller_speed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class studentsController {

    @GetMapping("/atendance")
    public String atendance() {
        return "students/atendance";
    }
    
}
