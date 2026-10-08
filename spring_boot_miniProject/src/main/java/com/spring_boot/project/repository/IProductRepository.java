package com.spring_boot.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring_boot.project.entity.Product;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product, String> {
    List<Product> findByCategoryIdAndStatus(String categoryId, String status);
}