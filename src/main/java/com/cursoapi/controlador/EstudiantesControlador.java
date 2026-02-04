package com.cursoapi.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudiantes") //define la base del endpoint
public class EstudiantesControlador {

    @GetMapping
    String getEstudiantes(){
        return "Hola estudiantes";
    }
}
