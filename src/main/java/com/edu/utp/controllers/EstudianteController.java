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

import com.edu.utp.models.Estudiante;
import com.edu.utp.models.Salon;
import com.edu.utp.services.EstudianteService;

@RestController
@RequestMapping("/estudiante")
@CrossOrigin("*")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @PostMapping("/")
    public ResponseEntity<Estudiante> guardarEstudiante(@RequestBody Estudiante estudiante) {
        return ResponseEntity.ok(estudianteService.agregarEstudiante(estudiante));
    }

    @GetMapping("/")
    public ResponseEntity<?> listarEstudiantes() {
        return ResponseEntity.ok(estudianteService.obtenerEstudiantes());
    }

    @GetMapping("/{estudianteId}")
    public Estudiante listarEstudiantePorId(@PathVariable("estudianteId") Long estudianteId) {
        return estudianteService.obtenerEstudiante(estudianteId);
    }

    @PutMapping("/")
    public Estudiante actualizarEstudiante(@RequestBody Estudiante estudiante) {
        return estudianteService.actualizarEstudiante(estudiante);
    }

    @DeleteMapping("/{estudianteId}")
    public void eliminarEstudiante(@PathVariable("estudianteId") Long estudianteId) {
        estudianteService.eliminarEstudiante(estudianteId);
    }
    
    @GetMapping("/salon/estudiantes/{salonId}")
    public ResponseEntity<?> listarEstudiantePorSalon(@PathVariable("salonId") Long salonId) {
        Salon salon = new Salon();
        salon.setSalonId(salonId);
        Set<Estudiante> estudiantes = estudianteService.obtnerEstudiantesPorSalon(salon);
        return ResponseEntity.ok(estudiantes);
    }

}
