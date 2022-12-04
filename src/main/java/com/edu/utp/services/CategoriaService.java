package com.edu.utp.services;

import java.util.Set;

import com.edu.utp.models.Categoria;

public interface CategoriaService {
    Categoria agregarCategoria(Categoria categoria);
    Categoria actualizarCategoria(Categoria categoria);
    Set<Categoria> obtenerCategorias();
    Categoria obtenerCategoria(Long categoriaId);
    void eliminarCategoria(Long categoriaId);
}
