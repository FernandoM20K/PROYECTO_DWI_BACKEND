package com.edu.utp.services;

import java.util.Set;

import com.edu.utp.models.Apoderado;

public interface ApoderadoService {
    Apoderado agregarApoderado(Apoderado apoderado);
    Apoderado actualizarApoderado(Apoderado apoderado);
    Set<Apoderado> obtenerApoderados();
    Apoderado obtenerApoderado(Long apoderadoId);
    void eliminarApoderado(Long apoderadoId);
}
