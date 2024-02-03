package com.a1dnan.inventoryservice.repository;

import com.a1dnan.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
