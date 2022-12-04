package com.edu.utp.repositorys;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.utp.models.Profesor;
import com.edu.utp.models.Sede;

public interface ProfesorRepository extends JpaRepository<Profesor, Long>{

    Set<Profesor> findBySede(Sede sede);
    
}
