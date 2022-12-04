package com.edu.utp.services;

import java.util.Set;

import com.edu.utp.models.ProfesorCurso;

public interface ProfesorCursoService {
    ProfesorCurso agregarCursoProfesor(ProfesorCurso profesorCurso);
    ProfesorCurso actualizarCursoProfesor(ProfesorCurso profesorCurso);
    Set<ProfesorCurso> obtenerCursosProfesor();
    ProfesorCurso obtenerProfesorCurso(Long profesorCursoId);
    void eliminarProfesorCurso(Long profesorCursoId);
}
