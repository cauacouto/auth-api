package com.example.api_products.controller;

import com.example.api_products.dto.ProductRequestDto;
import com.example.api_products.dto.ProductResponseDto;
import com.example.api_products.model.product;
import com.example.api_products.repository.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductRepository repository;

    @PostMapping
    public ResponseEntity PostProduct(@RequestBody @Valid ProductRequestDto body) {
        product product = new product(body);
        this.repository.save(product);
        return ResponseEntity.ok().build();

    }

    @GetMapping
    public ResponseEntity GetAllProducts() {
List<ProductResponseDto> products = this.repository.findAll().stream()
                .map(ProductResponseDto::new)
                .toList();
        return ResponseEntity.ok(products);

    }

}
