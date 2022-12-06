package com.edu.utp.services.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.utp.models.Mensaje;
import com.edu.utp.models.Usuario;
import com.edu.utp.repositorys.MensajeRepository;
import com.edu.utp.services.MensajeService;

@Service
public class MensajeServiceImpl implements MensajeService{

    @Autowired
    private MensajeRepository mensajeRepository;

    @Override
    public Mensaje agregarMensaje(Mensaje mensaje) {
        return mensajeRepository.save(mensaje);
    }

    @Override
    public Mensaje actualizarMensaje(Mensaje mensaje) {
        return mensajeRepository.save(mensaje);
    }

    @Override
    public Set<Mensaje> obtenerMensajes() {
        return new LinkedHashSet<>(mensajeRepository.findAll());
    }

    @Override
    public Mensaje obtenerMensaje(Long mensajeId) {
        return mensajeRepository.findById(mensajeId).get();
    }

    @Override
    public void eliminarMensaje(Long mensajeId) {
        Mensaje mensaje = new Mensaje();
        mensaje.setMensajeId(mensajeId);
        mensajeRepository.delete(mensaje);
    }

    @Override
    public Set<Mensaje> obtnerMensajesRecibidosXUsuario(Usuario usuario) {
        return new LinkedHashSet<>(mensajeRepository.findByUsuarioRecepcion(usuario));
    }

    @Override
    public Set<Mensaje> obtnerMensajesEnviadosXUsuario(Usuario usuario) {
        return new LinkedHashSet<>(mensajeRepository.findByUsuarioEnvio(usuario));
    }
    
}
