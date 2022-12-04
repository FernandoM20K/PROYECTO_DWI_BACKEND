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

import com.edu.utp.models.Profesor;
import com.edu.utp.models.Sede;
import com.edu.utp.services.ProfesorService;

@RestController
@RequestMapping("/profesor")
@CrossOrigin("*")
public class ProfesorController {

    @Autowired
    private ProfesorService profesorService;

    @PostMapping("/")
    public ResponseEntity<Profesor> guardarProfesor(@RequestBody Profesor profesor) {
        return ResponseEntity.ok(profesorService.agregarProfesor(profesor));
    }

    @GetMapping("/")
    public ResponseEntity<?> listarProfesores() {
        return ResponseEntity.ok(profesorService.obtenerProfesores());
    }

    @GetMapping("/{profesorId}")
    public Profesor listarProfesorPorId(@PathVariable("profesorId") Long profesorId) {
        return profesorService.obtenerProfesor(profesorId);
    }

    @PutMapping("/")
    public Profesor actualizarProfesor(@RequestBody Profesor profesor) {
        return profesorService.actualizarProfesor(profesor);
    }

    @DeleteMapping("/{profesorId}")
    public void eliminarProfesor(@PathVariable("profesorId") Long profesorId) {
        profesorService.eliminarProfesor(profesorId);
    }

    @GetMapping("/sede/profesores/{sedeId}")
    public ResponseEntity<?> listarProfesoresPorSede(@PathVariable("sedeId") Long sedeId) {
        Sede sede = new Sede();
        sede.setSedeId(sedeId);
        Set<Profesor> profesores = profesorService.obtenerProfesoresPorSede(sede);
        return ResponseEntity.ok(profesores);
    }
    
}
