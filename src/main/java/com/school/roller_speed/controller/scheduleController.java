package com.school.roller_speed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/schedule")
public class scheduleController {

    @GetMapping("/student")
    public String studentSchedule() {
        return "schedule/student";
    }

    @GetMapping("/instructor")
    public String instructorSchedule() {
        return "schedule/instructor";
    }
    
}
