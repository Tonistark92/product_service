package com.iscoding.product.product.product_service;


import com.iscoding.product.product.product_service.service.ProductServiceRest;
import com.iscoding.product.product.product_service.service.ProductServiceWeb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductServiceRest restService;

    @Autowired
    private ProductServiceWeb webService;

    // the RestClient endpoint
    @GetMapping("/rest/{code}")
    public ProductResponse getWithRest(@PathVariable String code) {
        return restService.getProduct(code);
    }

    // the WebClient endpoint
    @GetMapping("/web/{code}")
    public ProductResponse getWithWeb(@PathVariable String code) {
        return webService.getProduct(code);
    }
}
