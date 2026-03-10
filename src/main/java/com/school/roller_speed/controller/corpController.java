package com.school.roller_speed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/corporative")
public class corpController {

    @GetMapping("/mision")
    public String mision() { return "corporative/mision"; }

    @GetMapping("/vision")
    public String vision() { return "corporative/vision"; }

    @GetMapping("/values")
    public String values() { return "corporative/values"; }

    
}