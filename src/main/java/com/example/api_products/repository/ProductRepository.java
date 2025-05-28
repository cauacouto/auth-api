package com.example.api_products.repository;

import com.example.api_products.model.product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<product, String> {

}
