package com.edu.utp.repositorys;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.utp.models.Estudiante;
import com.edu.utp.models.Salon;
import com.edu.utp.models.Usuario;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long>{

    Set<Estudiante> findBySalon(Salon salon);

    Set<Estudiante> findByUsuario(Usuario usuario);
    
}
