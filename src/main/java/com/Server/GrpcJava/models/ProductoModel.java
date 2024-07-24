package com.Server.GrpcJava.models;

import jakarta.persistence.*;

@Entity
@Table(name= "Productos")
public class ProductoModel {
    @Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private int id;
    private String des;

    public int getId() {
        return id;
    }

    public String getDes() {
        return des;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
