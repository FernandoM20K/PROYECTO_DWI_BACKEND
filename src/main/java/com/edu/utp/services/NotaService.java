package com.edu.utp.services;

import java.util.Set;

import com.edu.utp.models.Estudiante;
import com.edu.utp.models.Nota;
import com.edu.utp.models.ProfesorCurso;

public interface NotaService {
    Nota agregarNota(Nota nota);
    Nota actualizarNota(Nota nota);
    Nota obtenerNota(Long notaId);
    Nota obtenerNotaXEstuddianteAndCurso(Estudiante estudiante, ProfesorCurso profesorCurso);
    Set<Nota> obtenerNotas();
    Set<Nota> obtenerNotasPorEstudiante(Estudiante estudiante);
}
