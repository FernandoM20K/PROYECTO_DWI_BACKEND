package com.edu.utp.repositorys;

import com.edu.utp.models.Usuario;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    public Usuario findByUsername(String username);

    //TODO: VERIFICAR
    Set<Usuario> findByFuncion(String funcion);

}
