package com.edu.utp.services.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.utp.models.Profesor;
import com.edu.utp.models.Sede;
import com.edu.utp.repositorys.ProfesorRepository;
import com.edu.utp.services.ProfesorService;

@Service
public class ProfesorServiceImpl implements ProfesorService{

    @Autowired
    private ProfesorRepository profesorRepository;

    @Override
    public Profesor agregarProfesor(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    @Override
    public Profesor actualizarProfesor(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    @Override
    public Set<Profesor> obtenerProfesores() {
        return new LinkedHashSet<>(profesorRepository.findAll());
    }

    @Override
    public Profesor obtenerProfesor(Long profesorId) {
        return profesorRepository.findById(profesorId).get();
    }

    @Override
    public Set<Profesor> obtenerProfesoresPorSede(Sede sede) {
        return profesorRepository.findBySede(sede);
    }

    @Override
    public void eliminarProfesor(Long profesorId) {
        Profesor profesor= new Profesor();
        profesor.setProfesorId(profesorId);
        profesorRepository.delete(profesor);
    }
    
}
