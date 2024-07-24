package com.Server.GrpcJava.controllers;

import com.Server.GrpcJava.models.ProductoModel;
import com.Server.GrpcJava.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    ProductoService productoService;

    @GetMapping()
    public ArrayList<ProductoModel> obtenerProductos()
    {
        return  productoService.obtenerProductos();
    }

    @PostMapping
    public ProductoModel crearProducto(@RequestBody ProductoModel producto){
        return this.productoService.crearProducto(producto);
    }

    @DeleteMapping
    public boolean borrarProducto(@RequestBody Integer id){
        return this.productoService.borrarProducto(id);
    }

    @GetMapping("/find")
    public Optional<ProductoModel> encontrarProducto(@RequestBody int id){
        return this.productoService.encontrarProducto(id);
    }
}

