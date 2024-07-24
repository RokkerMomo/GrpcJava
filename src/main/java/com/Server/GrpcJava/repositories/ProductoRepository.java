package com.Server.GrpcJava.repositories;

import com.Server.GrpcJava.models.ProductoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository<ProductoModel, Integer> {

}
