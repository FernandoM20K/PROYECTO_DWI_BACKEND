package com.edu.utp.services;

import java.util.Set;

import com.edu.utp.models.Estudiante;
import com.edu.utp.models.Salon;

public interface EstudianteService {
    Estudiante agregarEstudiante(Estudiante estudiante);
    Estudiante actualizarEstudiante(Estudiante estudiante);
    Set<Estudiante> obtenerEstudiantes();
    Estudiante obtenerEstudiante(Long estudianteId);
    Set<Estudiante> obtnerEstudiantesPorSalon(Salon salon);
    void eliminarEstudiante(Long estudianteId);
}
