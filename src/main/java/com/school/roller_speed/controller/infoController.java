package com.school.roller_speed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/information")
public class infoController {

    @GetMapping("/services")
    public String services() {
        return "information/services";
    }

    @GetMapping("/events")
    public String events() {
        return "information/events"; 
    }
    
}
