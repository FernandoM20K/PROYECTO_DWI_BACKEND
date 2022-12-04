package com.edu.utp.services;

import java.util.Set;

import com.edu.utp.models.Profesor;
import com.edu.utp.models.Sede;

public interface ProfesorService {
    Profesor agregarProfesor(Profesor profesor);
    Profesor actualizarProfesor(Profesor profesor);
    Set<Profesor> obtenerProfesores();
    Profesor obtenerProfesor(Long profesorId);
    Set<Profesor> obtenerProfesoresPorSede(Sede sede);
    void eliminarProfesor(Long profesorId);
}
