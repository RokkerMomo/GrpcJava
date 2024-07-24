package com.Server.GrpcJava.services;

import com.Server.GrpcJava.models.ProductoModel;
import com.Server.GrpcJava.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;

    public ArrayList<ProductoModel> obtenerProductos(){
        return (ArrayList<ProductoModel>) productoRepository.findAll();
    }

    public ProductoModel crearProducto(ProductoModel producto){
        return productoRepository.save(producto);
    }

    public Optional <ProductoModel> encontrarProducto(Integer id){
        return productoRepository.findById(id);
    }
    public boolean borrarProducto(Integer id){
        try {
            productoRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}
