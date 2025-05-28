package com.example.api_products.dto;

import com.example.api_products.model.product;

public record ProductResponseDTO(
        String id,
        String name,
        Integer price
) {
    public ProductResponseDTO(product product) {
        this(product.getId(), product.getName(), product.getPrice());
    }
}
