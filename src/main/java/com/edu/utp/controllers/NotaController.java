package com.edu.utp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.utp.models.Estudiante;
import com.edu.utp.models.Nota;
import com.edu.utp.models.ProfesorCurso;
import com.edu.utp.services.NotaService;

@RestController
@RequestMapping("/nota")
@CrossOrigin("*")
public class NotaController {
    
    @Autowired
    private NotaService notaService;

    @GetMapping("/")
    public ResponseEntity<?> listarNotas() {
        return ResponseEntity.ok(notaService.obtenerNotas());
    }

    @GetMapping("/cursos/{estudianteId}")
    public ResponseEntity<?> listarNotasPorEstudiante(@PathVariable("estudianteId") Long estudianteId) {
        Estudiante estudiante = new Estudiante();
        estudiante.setEstudianteId(estudianteId);
        return ResponseEntity.ok(notaService.obtenerNotasPorEstudiante(estudiante));
    }

    @GetMapping("/{notaId}")
    public Nota listarNotaXId(@PathVariable("notaId") Long notaId) {
        return notaService.obtenerNota(notaId);
    }

    @GetMapping("/{estudianteId}/{profesorCursoId}")
    public Nota listarNotaXEstudianteAndCurso(@PathVariable("estudianteId") Long estudianteId, @PathVariable("profesorCursoId") Long profesorCursoId) {
        Estudiante estudiante = new Estudiante();
        estudiante.setEstudianteId(estudianteId);
        ProfesorCurso profesorCurso = new ProfesorCurso();
        profesorCurso.setProfesorCursoId(profesorCursoId);
        return notaService.obtenerNotaXEstuddianteAndCurso(estudiante, profesorCurso);
    }

    @PostMapping("/")
    public ResponseEntity<Nota> guardarNotas(@RequestBody Nota nota) {
        return ResponseEntity.ok(notaService.agregarNota(nota));
    }

    @PutMapping("/")
    public Nota actualizarNota(@RequestBody Nota nota) {
        return notaService.actualizarNota(nota);
    }
}
