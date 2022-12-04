package com.edu.utp.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.utp.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    
}
