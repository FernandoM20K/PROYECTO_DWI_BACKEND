package com.edu.utp.services.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.utp.models.ProfesorCurso;
import com.edu.utp.repositorys.ProfesorCursoRepository;
import com.edu.utp.services.ProfesorCursoService;

@Service
public class ProfesorCursoServiceImpl implements ProfesorCursoService{

    @Autowired
    private ProfesorCursoRepository profesorCursoRepository;

    @Override
    public ProfesorCurso agregarCursoProfesor(ProfesorCurso profesorCurso) {
        return profesorCursoRepository.save(profesorCurso);
    }

    @Override
    public ProfesorCurso actualizarCursoProfesor(ProfesorCurso profesorCurso) {
        return profesorCursoRepository.save(profesorCurso);
    }

    @Override
    public Set<ProfesorCurso> obtenerCursosProfesor() {
        return new LinkedHashSet<>(profesorCursoRepository.findAll());
    }

    @Override
    public ProfesorCurso obtenerProfesorCurso(Long profesorCursoId) {
        return profesorCursoRepository.findById(profesorCursoId).get();
    }

    @Override
    public void eliminarProfesorCurso(Long profesorCursoId) {
        ProfesorCurso profesorCurso = new ProfesorCurso();
        profesorCurso.setProfesorCursoId(profesorCursoId);
        profesorCursoRepository.delete(profesorCurso);
    }
    
}
