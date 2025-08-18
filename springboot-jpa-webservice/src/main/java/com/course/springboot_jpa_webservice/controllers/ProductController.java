package com.course.springboot_jpa_webservice.controllers;

import com.course.springboot_jpa_webservice.entities.Product;
import com.course.springboot_jpa_webservice.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {

        List<Product> list = productService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{productId}")
    public ResponseEntity<Product> findById(@PathVariable Long productId) {

        Product obj = productService.findById(productId);
        return ResponseEntity.ok().body(obj);
    }
}
