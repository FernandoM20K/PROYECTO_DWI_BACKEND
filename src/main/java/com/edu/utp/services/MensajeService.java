package com.edu.utp.services;

import java.util.Set;

import com.edu.utp.models.Mensaje;
import com.edu.utp.models.Usuario;

public interface MensajeService {
    Mensaje agregarMensaje(Mensaje mensaje);
    Mensaje actualizarMensaje(Mensaje mensaje);
    Set<Mensaje> obtenerMensajes();
    Set<Mensaje> obtnerMensajesRecibidosXUsuario(Usuario usuario);
    Set<Mensaje> obtnerMensajesEnviadosXUsuario(Usuario usuario);
    Mensaje obtenerMensaje(Long mensajeId);
    void eliminarMensaje(Long mensajeId);
}
