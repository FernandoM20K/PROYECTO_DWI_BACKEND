package com.edu.utp.services;

import com.edu.utp.models.Usuario;
import com.edu.utp.models.UsuarioRol;

import java.util.Set;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String username);

    Set<Usuario> obtenerUsuariosPorFuncion(String funcion);

    public void eliminarUsuario(Long usuarioId);
}
