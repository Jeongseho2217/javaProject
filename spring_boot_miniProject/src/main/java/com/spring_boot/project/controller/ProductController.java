                                                                                                                           package com.spring_boot.project.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.spring_boot.project.dto.ProductDTO;
import com.spring_boot.project.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    // 전체 상품 조회
    @GetMapping
    public ResponseEntity<List<ProductDTO>> getProducts(
            @RequestParam(name = "category", required = false) String category) {
        
        if (category != null && !category.isBlank()) {
            return ResponseEntity.ok(productService.getProductsByCategory(category.toUpperCase()));
        }
        return ResponseEntity.ok(productService.getAllProducts());
    }

    // 단일 상품 상세 조회
    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductDetail(@PathVariable("id") String id) {
        return ResponseEntity.ok(productService.getProductById(id));
    }
}