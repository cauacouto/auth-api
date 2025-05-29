package com.example.api_products.model;

import com.example.api_products.dto.ProductRequestDto;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Entity
@Table(name = "product")
@Getter

@EqualsAndHashCode(of = "id")
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private Integer price;

    public product(ProductRequestDto data) {
        this.name = data.name();
        this.price = data.price();
    }

  public product(){}

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


}
