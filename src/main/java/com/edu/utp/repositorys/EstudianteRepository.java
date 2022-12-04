package com.edu.utp.repositorys;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.utp.models.Apoderado;
import com.edu.utp.models.Estudiante;
import com.edu.utp.models.Salon;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long>{

    Set<Estudiante> findBySalon(Salon salon);

    Estudiante findByApoderado(Apoderado apoderado);

    
    
}
