package com.edu.utp.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

// import com.edu.utp.models.Estudiante;
import com.edu.utp.models.Nota;

public interface NotaRepository extends JpaRepository<Nota, Long>{

    //Nota findByEstudiante(Estudiante estudiante);
    
}
