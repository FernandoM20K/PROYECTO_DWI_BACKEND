package com.edu.utp.controllers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.utp.models.Salon;
import com.edu.utp.models.Sede;
import com.edu.utp.services.SalonService;

@RestController
@RequestMapping("/salon")
@CrossOrigin("*")
public class SalonController {
    
    @Autowired
    private SalonService salonService;

    @PostMapping("/")
    public ResponseEntity<Salon> guardarSalon(@RequestBody Salon salon) {
        return ResponseEntity.ok(salonService.agregarSalon(salon));
    }

    @GetMapping("/")
    public ResponseEntity<?> listarSalons() {
        return ResponseEntity.ok(salonService.obtenerSalones());
    }

    @GetMapping("/{salonId}")
    public Salon listarSalonPorId(@PathVariable("salonId") Long salonId) {
        return salonService.obtenerSalon(salonId);
    }

    @PutMapping("/")
    public Salon actualizarSalon(@RequestBody Salon salon) {
        return salonService.actualizarSalon(salon);
    }

    @GetMapping("/sede/salones/{sedeId}")
    public ResponseEntity<?> listarSalonesPorSede(@PathVariable("sedeId") Long sedeId) {
        Sede sede = new Sede();
        sede.setSedeId(sedeId);
        Set<Salon> salones = salonService.obtenerSalonesPordSede(sede);
        return ResponseEntity.ok(salones);
    }

    @DeleteMapping("/{salonId}")
    public void eliminarSalon(@PathVariable("salonId") Long salonId) {
        salonService.eliminarSalon(salonId);
    }
    
}
