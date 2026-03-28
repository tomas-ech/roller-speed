package com.school.roller_speed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.school.roller_speed.model.StudentModel;
import com.school.roller_speed.service.StudentService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@Controller
@RequestMapping("/register")
public class registerController {

     @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    public String formStudent(Model model) {
        model.addAttribute("student", new StudentModel());
        return "register/student";
    }

    @GetMapping("/instructor")
    public String formInstructor() {
        return "register/instructor";
    }

    @PostMapping("/createStudent")
    @Operation(summary = "Crear un estudiante", description = "Permite crear un nuevo estudiante con la información suministrada")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operación exitosa"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    public String createStudent(@ModelAttribute StudentModel student){
        studentService.createStudent(student);
       return "redirect:/lists/students";
    }

    
}
