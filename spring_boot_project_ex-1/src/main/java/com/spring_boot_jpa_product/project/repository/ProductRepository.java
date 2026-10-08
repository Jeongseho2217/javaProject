package com.spring_boot_jpa_product.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring_boot_jpa_product.project.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, String>{
	// 기본 CRUD 메소드 제공 : findAll()
	@Query(value="SELECT prdNo FROM ProductEntity p WHERE p.prdNo = :prdNo")
	String searchById(@Param("prdNo") String prdNo);
	
	@Query(value="SELECT p FROM ProductEntity p"
			+ "WHERE (:type='prdName' AND p.prdName LIKE CONCAT('%', :keyword, '%'))"
			+ "OR (:type='prdCompany' AND p.prdComopany LIKE CONCAT('%', :keyword, '%'))"
			)
	List<ProductEntity> productSearch(String type, String keyword);
}
