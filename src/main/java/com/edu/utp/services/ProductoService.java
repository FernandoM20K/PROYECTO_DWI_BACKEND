package com.edu.utp.services;

import java.util.Set;

import com.edu.utp.models.Producto;

public interface ProductoService {
    Producto agregarProducto(Producto producto);
    Producto actualizarProducto(Producto producto);
    Set<Producto> obtenerProductos();
    Producto obtenerProducto(Long productoId);
    void eliminarProducto(Long ProductoId);
}
