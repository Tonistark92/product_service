package com.iscoding.product.product.product_service.service;

import com.iscoding.product.product.product_service.ProductEntity;
import com.iscoding.product.product.product_service.ProductRepository;
import com.iscoding.product.product.product_service.ProductResponse;
import com.iscoding.product.product.restclient.InventoryRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceRest {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private InventoryRestClient inventoryClient;

    public ProductResponse getProduct(String code) {

        ProductEntity product = repository.findByCode(code)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        boolean inStock = inventoryClient.isInStock(code);

        return new ProductResponse(
                product.getName(),
                product.getCode(),
                inStock
        );
    }
}
