package com.edu.utp.services;

import java.util.Set;

import com.edu.utp.models.Estudiante;
import com.edu.utp.models.Salon;
import com.edu.utp.models.Usuario;

public interface EstudianteService {
    Estudiante agregarEstudiante(Estudiante estudiante);
    Estudiante actualizarEstudiante(Estudiante estudiante);
    Set<Estudiante> obtenerEstudiantes();
    Estudiante obtenerEstudiante(Long estudianteId);
    Set<Estudiante> obtnerEstudiantesPorSalon(Salon salon);
    Set<Estudiante> obtnerEstudiantesPorApoderado(Usuario usuario);
    void eliminarEstudiante(Long estudianteId);
}
