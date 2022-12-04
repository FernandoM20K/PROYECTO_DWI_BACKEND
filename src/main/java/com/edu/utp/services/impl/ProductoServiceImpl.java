package com.edu.utp.services.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.utp.models.Producto;
import com.edu.utp.repositorys.ProductoRepository;
import com.edu.utp.services.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    ProductoRepository productoRepository;

    @Override
    public Producto agregarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto actualizarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Set<Producto> obtenerProductos() {
        return new LinkedHashSet<>(productoRepository.findAll());
    }

    @Override
    public Producto obtenerProducto(Long productoId) {
        return productoRepository.findById(productoId).get();
    }

    @Override
    public void eliminarProducto(Long ProductoId) {
        Producto producto = new Producto();
        producto.setProductoId(ProductoId);
        productoRepository.delete(producto);
    }
    
}
