package com.iscoding.product.product.product_service.restclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class InventoryRestClient {

    @Autowired
    private RestClient restClient;

    public boolean isInStock(String code) {
        return restClient.get()
                .uri("/api/inventory/{code}", code)
                .retrieve()
                .body(Boolean.class);
    }
}
