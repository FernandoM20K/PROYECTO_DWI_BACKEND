package com.edu.utp.repositorys;

import com.edu.utp.models.Mensaje;
import com.edu.utp.models.Usuario;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MensajeRepository extends JpaRepository<Mensaje,Long> {

    Set<Mensaje> findByUsuarioEnvio(Usuario usuario);
    Set<Mensaje> findByUsuarioRecepcion(Usuario usuario);
    
}