package com.spring_boot_jpa_product.project.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.spring_boot_jpa_product.project.dto.ProductDTO;
import com.spring_boot_jpa_product.project.entity.ProductEntity;

public interface IProductServiceDataHandle {
	public ArrayList<ProductEntity> listAllProduct();
	
	public void insertProduct(ProductEntity dto);
	
	public void updateProduct(ProductEntity dto);
	
	public void deleteProduct(String prdNo);
	
	//상품 CRUD는 spring_boot_mybatis 프로젝트에서 진행함
	public Optional<ProductEntity> detailViewProduct(String prdNo);
	
	public String prdNoCheck(String prdNo);
	
	public List<ProductEntity> productSearch(HashMap<String, Object> map);
	
}
