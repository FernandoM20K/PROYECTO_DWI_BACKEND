package com.edu.utp.repositorys;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.utp.models.Salon;
import com.edu.utp.models.Sede;

public interface SalonRepository extends JpaRepository<Salon, Long>{
    
    Set<Salon> findBySede(Sede sede);

}
