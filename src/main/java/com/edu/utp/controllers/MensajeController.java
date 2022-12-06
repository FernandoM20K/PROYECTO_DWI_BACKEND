package com.edu.utp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.utp.models.Mensaje;
import com.edu.utp.models.Usuario;
import com.edu.utp.services.MensajeService;

@RestController
@RequestMapping("/mensaje")
@CrossOrigin("*")
public class MensajeController {

    @Autowired
    private MensajeService mensajeService;

    @PostMapping("/")
    public ResponseEntity<Mensaje> guardarMensaje(@RequestBody Mensaje mensaje) {
        return ResponseEntity.ok(mensajeService.agregarMensaje(mensaje));
    }

    @GetMapping("/")
    public ResponseEntity<?> listarMensajes() {
        return ResponseEntity.ok(mensajeService.obtenerMensajes());
    }

    @GetMapping("/recibidos/{usuarioId}")
    public ResponseEntity<?> listarMensajesRecibidosXUsuario(@PathVariable("usuarioId") Long usuarioId) {
        Usuario usuario = new Usuario();
        usuario.setUsuarioId(usuarioId);
        return ResponseEntity.ok(mensajeService.obtnerMensajesRecibidosXUsuario(usuario));
    }

    @GetMapping("/enviados/{usuarioId}")
    public ResponseEntity<?> listarMnesajesEnviadosXUsuario(@PathVariable("usuarioId") Long usuarioId) {
        Usuario usuario = new Usuario();
        usuario.setUsuarioId(usuarioId);
        return ResponseEntity.ok(mensajeService.obtnerMensajesEnviadosXUsuario(usuario));
    }
    
}
