package com.edu.utp.controllers;

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

import com.edu.utp.models.ProfesorCurso;
import com.edu.utp.services.ProfesorCursoService;

@RestController
@RequestMapping("/profesorCurso")
@CrossOrigin("*")
public class ProfesorCursoController {
    
    @Autowired
    private ProfesorCursoService profesorCursoService;

    @PostMapping("/")
    public ResponseEntity<ProfesorCurso> guardarProfesorCurso(@RequestBody ProfesorCurso profesorCurso) {
        return ResponseEntity.ok(profesorCursoService.agregarCursoProfesor(profesorCurso));
    }

    @GetMapping("/")
    public ResponseEntity<?> listarProfesorXCurso() {
        return ResponseEntity.ok(profesorCursoService.obtenerCursosProfesor());
    }

    @GetMapping("/{profesorCursoId}")
    public ProfesorCurso listarProfesorXCursoXId(@PathVariable("profesorCursoId") Long profesorCursoId) {
        return profesorCursoService.obtenerProfesorCurso(profesorCursoId);
    }

    @PutMapping("/")
    public ProfesorCurso actualizarProfesorCurso(@RequestBody ProfesorCurso profesorCurso) {
        return profesorCursoService.actualizarCursoProfesor(profesorCurso);
    }

    @DeleteMapping("/{profesorCursoId}")
    public void eliminarProfesorCurso(@PathVariable("profesorCursoId") Long profesorCursoId) {
        profesorCursoService.eliminarProfesorCurso(profesorCursoId);
    }
}
