package com.edu.utp.repositorys;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.utp.models.Estudiante;
import com.edu.utp.models.Nota;
import com.edu.utp.models.ProfesorCurso;

public interface NotaRepository extends JpaRepository<Nota, Long>{

    Nota findByEstudianteAndProfesorCurso(Estudiante estudiante, ProfesorCurso profesorCurso);

    Set<Nota> findByEstudiante(Estudiante estudiante);
    
}
