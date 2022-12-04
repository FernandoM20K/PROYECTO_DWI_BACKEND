package com.edu.utp.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.utp.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
    
}
