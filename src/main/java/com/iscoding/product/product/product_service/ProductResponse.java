package com.iscoding.product.product.product_service;

public class ProductResponse {

    private String name;
    private String code;
    private boolean inStock;

    public ProductResponse(String name, String code, boolean inStock) {
        this.name = name;
        this.code = code;
        this.inStock = inStock;
    }
}