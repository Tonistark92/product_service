package com.iscoding.product.product.webclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class InventoryWebClient {

    @Autowired
    private WebClient webClient;

    public boolean isInStock(String code) {
        return webClient.get()
                .uri("/api/inventory/{code}", code)
                .retrieve()
                .bodyToMono(Boolean.class)
                .block();
    }
}