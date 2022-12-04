package com.edu.utp.services;

import java.util.Set;

import com.edu.utp.models.Sede;

public interface SedeService {
    Sede agregarSede(Sede sede);
    Sede actualizarSede(Sede sede);
    Set<Sede> obtenerSedes();
    Sede obtenerSede(Long sedeId);
    void eliminarSede(Long sedeId);
}
