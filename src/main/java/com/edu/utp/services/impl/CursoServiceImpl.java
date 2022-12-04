package com.edu.utp.services.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.utp.models.Curso;
import com.edu.utp.repositorys.CursoRepository;
import com.edu.utp.services.CursoService;

@Service
public class CursoServiceImpl implements CursoService{

    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public Curso agregarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public Curso actualizarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public Set<Curso> obtenerCursos() {
        return new LinkedHashSet<>(cursoRepository.findAll());
    }

    @Override
    public Curso obtenerCurso(Long cursoId) {
        return cursoRepository.findById(cursoId).get();
    }

    @Override
    public void eliminarCurso(Long cursoId) {
        Curso curso = new Curso();
        curso.setCursoId(cursoId);
        cursoRepository.delete(curso);
    }
    
}
