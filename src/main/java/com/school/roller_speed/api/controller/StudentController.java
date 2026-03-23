package com.school.roller_speed.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.roller_speed.model.StudentModel;
import com.school.roller_speed.service.StudentService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("api/students")
@Tag(name = "Students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @Operation(summary = "Obtener todos los estudiantes", description = "Retorna una lista completa de los alumnos registrados")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operación exitosa"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    @GetMapping
    public List<StudentModel> list() {
        return studentService.getAllStudents();
    }

    @PostMapping
    public ResponseEntity<StudentModel> create(@RequestBody StudentModel student) {
        return ResponseEntity.ok(studentService.createStudent(student));
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentModel> get(@PathVariable Long id) {
        return studentService.getStudentById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }

}
