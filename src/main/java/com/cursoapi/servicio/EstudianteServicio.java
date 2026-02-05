package com.cursoapi.servicio;

import com.cursoapi.model.Estudiante;
import org.springframework.stereotype.Service;
import com.cursoapi.repositorio.EstudianteRepositorio;

import java.util.List;

@Service
public class EstudianteServicio {
    private final EstudianteRepositorio estudianteRepositorio;
    public EstudianteServicio(EstudianteRepositorio estudianteRepositorio){
        this.estudianteRepositorio = estudianteRepositorio;

    }
    public List<Estudiante> buscarTodos(){
        return estudianteRepositorio.buscarTodos();
    }
}
