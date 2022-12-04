package com.edu.utp.services;

import java.util.Set;

import com.edu.utp.models.Curso;

public interface CursoService {
    Curso agregarCurso(Curso curso);
    Curso actualizarCurso(Curso curso);
    Set<Curso> obtenerCursos();
    Curso obtenerCurso(Long cursoId);
    void eliminarCurso(Long cursoId);
}
