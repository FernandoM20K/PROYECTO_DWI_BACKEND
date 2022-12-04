package com.edu.utp.services;

import java.util.Set;

import com.edu.utp.models.Salon;
import com.edu.utp.models.Sede;

public interface SalonService {
    Salon agregarSalon(Salon salon);
    Salon actualizarSalon(Salon salon);
    Set<Salon> obtenerSalones();
    Salon obtenerSalon(Long salonId);
    Set<Salon> obtenerSalonesPordSede(Sede sede);
    void eliminarSalon(Long salonId);
}
