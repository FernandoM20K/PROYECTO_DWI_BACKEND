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

import com.edu.utp.models.Apoderado;
import com.edu.utp.services.ApoderadoService;

@RestController
@RequestMapping("/apoderado")
@CrossOrigin("*")
public class ApoderadoController {

    @Autowired
    private ApoderadoService apoderadoService;

    @PostMapping("/")
    public ResponseEntity<Apoderado> guardarApoderado(@RequestBody Apoderado apoderado) {
        return ResponseEntity.ok(apoderadoService.agregarApoderado(apoderado));
    }

    @GetMapping("/")
    public ResponseEntity<?> listarApoderados() {
        return ResponseEntity.ok(apoderadoService.obtenerApoderados());
    }

    @GetMapping("/{apoderadoId}")
    public Apoderado listarApoderadoPorId(@PathVariable("apoderadoId") Long apoderadoId) {
        return apoderadoService.obtenerApoderado(apoderadoId);
    }

    @PutMapping("/")
    public Apoderado actualizarApoderado(@RequestBody Apoderado apoderado) {
        return apoderadoService.actualizarApoderado(apoderado);
    }

    @DeleteMapping("/{apoderadoId}")
    public void eliminarApoderado(@PathVariable("apoderadoId") Long apoderadoId) {
        apoderadoService.eliminarApoderado(apoderadoId);
    }

}
