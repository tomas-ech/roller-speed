package com.school.roller_speed.controller;

import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.beans.factory.annotation.Autowired;

import com.school.roller_speed.service.StudentService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;


@Controller
@RequestMapping("/lists")
@Tag(name = "Estudiantes", description = "Información relacionada a todos los estudiantes de la academia")
public class studentsController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    @Operation(summary = "Obtener todos los estudiantes", description = "Retorna una lista completa de los alumnos registrados")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operación exitosa"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    public String studentAtendance(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "lists/students";
    }

}
