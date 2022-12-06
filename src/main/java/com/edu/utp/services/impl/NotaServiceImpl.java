package com.edu.utp.services.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.utp.models.Estudiante;
import com.edu.utp.models.Nota;
import com.edu.utp.models.ProfesorCurso;
import com.edu.utp.repositorys.NotaRepository;
import com.edu.utp.services.NotaService;

@Service
public class NotaServiceImpl implements NotaService{

    @Autowired
    private NotaRepository notaRepository;

    @Override
    public Nota agregarNota(Nota nota) {
        return notaRepository.save(nota);
    }

    @Override
    public Nota actualizarNota(Nota nota) {
        return notaRepository.save(nota);
    }

    
    @Override
    public Nota obtenerNota(Long notaId) {
        return notaRepository.findById(notaId).get();
    }

    @Override
    public Set<Nota> obtenerNotas() {
        return new LinkedHashSet<>(notaRepository.findAll());
    }

    @Override
    public Nota obtenerNotaXEstuddianteAndCurso(Estudiante estudiante, ProfesorCurso profesorCurso) {
        return notaRepository.findByEstudianteAndProfesorCurso(estudiante, profesorCurso);
    }

    @Override
    public Set<Nota> obtenerNotasPorEstudiante(Estudiante estudiante) {
        return new LinkedHashSet<>(notaRepository.findByEstudiante(estudiante));
    }
    
}
