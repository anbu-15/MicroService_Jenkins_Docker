package com.example.productservice.serviceclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.productservice.Model.Product;

@FeignClient(name = "productservice")
public interface ProductServiceClient {
    
    @GetMapping("/products")
    List<Product> getProducts();
}
