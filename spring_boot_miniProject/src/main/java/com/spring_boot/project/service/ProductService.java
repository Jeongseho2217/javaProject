package com.spring_boot.project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring_boot.project.dto.ProductDTO;
import com.spring_boot.project.repository.IProductRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final IProductRepository productRepository;

    // 전체 판매 중인 상품 조회
    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll().stream()
                .map(ProductDTO::from)
                .collect(Collectors.toList());
    }

    // 카테고리별 상품 목록 조회
    public List<ProductDTO> getProductsByCategory(String categoryId) {
        return productRepository.findByCategoryIdAndStatus(categoryId, "ON_SALE").stream()
                .map(ProductDTO::from)
                .collect(Collectors.toList());
    }

    // 단일 상품 상세 조회
    public ProductDTO getProductById(String id) {
        return productRepository.findById(id)
                .map(ProductDTO::from)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 상품입니다. (ID: " + id + ")"));
    }
}