package com.example.api_products.controller;

import com.example.api_products.dto.ProductRequestDto;
import com.example.api_products.dto.ProductResponseDTO;
import com.example.api_products.model.product;
import com.example.api_products.repository.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductRepository repository;

    @PostMapping
    public ResponseEntity PostProduct(@RequestBody @Valid ProductRequestDto body) {
        product newproduct = new product(body);
        this.repository.save(newproduct);
        return ResponseEntity.ok().build();

    }

    @GetMapping
    public ResponseEntity getAllProducts(){
        List<ProductResponseDTO> productList = this.repository.findAll().stream().map(ProductResponseDTO::new).toList();

        return ResponseEntity.ok(productList);
    }

}
