package com.a1dnan.inventoryservice.web;

import com.a1dnan.inventoryservice.entities.Product;
import com.a1dnan.inventoryservice.repository.ProductRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestController {
    private ProductRepository productRepository;

    public ProductRestController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @GetMapping("/products")
//    @PreAuthorize("hasAuthority('ADMIN')")
    public List<Product> products(){
        return productRepository.findAll();
    }
}