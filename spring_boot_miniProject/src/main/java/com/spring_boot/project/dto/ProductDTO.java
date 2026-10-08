package com.spring_boot.project.dto;

import com.spring_boot.project.entity.Product;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProductDTO {
    private String id;
    private String categoryId;
    private String name;
    private Integer price;
    private Integer stock;
    private String imageUrl;
    private String description;
    private String layout;
    private Integer pin;
    private String status;

    public static ProductDTO from(Product product) {
        return ProductDTO.builder()
                .id(product.getId())
                .categoryId(product.getCategoryId())
                .name(product.getName())
                .price(product.getPrice())
                .stock(product.getStock())
                .imageUrl(product.getImageUrl())
                .description(product.getDescription())
                .layout(product.getLayout())
                .pin(product.getPin())
                .status(product.getStatus())
                .build();
    }
}