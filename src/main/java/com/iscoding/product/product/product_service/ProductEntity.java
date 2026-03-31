package com.iscoding.product.product.product_service;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
public class ProductEntity {

    @Id
    private Long id;
    @Getter
    private String name;
    @Getter
    private String code;
}