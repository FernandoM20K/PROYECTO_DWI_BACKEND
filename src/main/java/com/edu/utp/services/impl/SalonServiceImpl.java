package com.edu.utp.services.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.utp.models.Salon;
import com.edu.utp.models.Sede;
import com.edu.utp.repositorys.SalonRepository;
import com.edu.utp.services.SalonService;

@Service
public class SalonServiceImpl implements SalonService{

    @Autowired
    private SalonRepository salonRepository;

    @Override
    public Salon agregarSalon(Salon salon) {
        return salonRepository.save(salon);
    }

    @Override
    public Salon actualizarSalon(Salon salon) {
        return salonRepository.save(salon);
    }

    @Override
    public Set<Salon> obtenerSalones() {
        return new LinkedHashSet<>(salonRepository.findAll());
    }

    @Override
    public Salon obtenerSalon(Long salonId) {
        return salonRepository.findById(salonId).get();
    }

    
    @Override
    public Set<Salon> obtenerSalonesPordSede(Sede sede) {
        return salonRepository.findBySede(sede);
    }

    @Override
    public void eliminarSalon(Long salonId) {
        Salon salon = new Salon();
        salon.setSalonId(salonId);
        salonRepository.delete(salon);
    }
    
}
