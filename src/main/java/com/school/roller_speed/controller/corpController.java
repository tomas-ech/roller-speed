package com.school.roller_speed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@Controller
@RequestMapping("/corporative")
public class corpController {

    @GetMapping("/mision")
    @Operation(summary = "Página para mostrar la misión de la empresa")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operación exitosa"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    public String mision() {
        return "corporative/mision";
    }

    @GetMapping("/vision")
    @Operation(summary = "Página para mostrar la visión de la empresa")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operación exitosa"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    public String vision() {
        return "corporative/vision";
    }

    @GetMapping("/values")
    @Operation(summary = "Página para mostrar los valores de la empresa")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operación exitosa"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    public String values() {
        return "corporative/values";
    }

}