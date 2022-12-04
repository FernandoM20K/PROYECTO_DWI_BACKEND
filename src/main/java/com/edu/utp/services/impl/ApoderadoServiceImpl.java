package com.edu.utp.services.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.utp.models.Apoderado;
import com.edu.utp.repositorys.ApoderadoRepository;
import com.edu.utp.services.ApoderadoService;

@Service
public class ApoderadoServiceImpl implements ApoderadoService{

    @Autowired
    private ApoderadoRepository apoderadoRepository;

    @Override
    public Apoderado agregarApoderado(Apoderado apoderado) {
        return apoderadoRepository.save(apoderado);
    }

    @Override
    public Apoderado actualizarApoderado(Apoderado apoderado) {
        return apoderadoRepository.save(apoderado);
    }

    @Override
    public Set<Apoderado> obtenerApoderados() {
        return new LinkedHashSet<>(apoderadoRepository.findAll());
    }

    @Override
    public Apoderado obtenerApoderado(Long apoderadoId) {
        return apoderadoRepository.findById(apoderadoId).get();
    }

    @Override
    public void eliminarApoderado(Long apoderadoId) {
        Apoderado apoderado = new Apoderado();
        apoderado.setApoderadoId(apoderadoId);
        apoderadoRepository.delete(apoderado);
    }
    
}
