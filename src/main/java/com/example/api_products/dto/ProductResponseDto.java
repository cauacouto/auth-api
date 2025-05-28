package com.example.api_products.dto;

import com.example.api_products.model.product;

public record ProductResponseDto(
        String id,
        String name,
        Integer price
) {
    public ProductResponseDto(product product) {
        this(product.getId(), product.getName(), product.getPrice());
    }
}
