package com.edu.utp.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.utp.models.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{
    
}
