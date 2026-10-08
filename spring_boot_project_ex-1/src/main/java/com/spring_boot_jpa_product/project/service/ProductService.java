package com.spring_boot_jpa_product.project.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_boot_jpa_product.project.dto.ProductDTO;
import com.spring_boot_jpa_product.project.entity.ProductEntity;

//DTO<->ENTITY 변환
// 컨트롤러 -> 서비스 -> 데이터핸들서비스 -> DAO -> 레포 -> DB 데이터 이동
//컨트롤러 <- 서비스 <- 데이터핸들서비스 <- DAO <- 레포 <- DB 데이터 이동
@Service
public class ProductService implements IProductService{

	ProductServiceDataHandle productServiceDataHandle;
	
	@Autowired
	public ProductService(ProductServiceDataHandle productServiceDataHandle) {
		this.productServiceDataHandle = productServiceDataHandle;
	}
	
	@Override
	public ArrayList<ProductEntity> listAllProduct() {
		ArrayList<ProductEntity> entityList = productServiceDataHandle.listAllProduct();
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		
		//entityList에 저장되어있는 레코드(entity)를 dto로 현환해서 list에 저장
		for(ProductEntity entity : entityList) {
			ProductDTO dto = ProductDTO.toDto(entity);
			list.add(dto);
		}
		return null;
	}
	
	@Override
	public void insertProduct(ProductDTO dto) {
		ProductEntity e = ProductEntity.toEntity(dto);
		productServiceDataHandle.insertProduct(e);
		
	}

	@Override
	public void updateProduct(ProductDTO dto) {
		ProductEntity e = ProductEntity.toEntity(dto);
		productServiceDataHandle.updateProduct(e);
	}

	@Override
	public void deleteProduct(String prdNo) {
		productServiceDataHandle.deleteProduct(prdNo);
		
	}

	@Override
	public ProductEntity detailViewProduct(String prdNo) {
		ProductEntity e = productServiceDataHandle.detailViewProduct(prdNo);
		ProductDTO dto = ProductDTO.toDto(e);
		
		return dto;
	}

	@Override
	public String prdNoCheck(String prdNo) {
		String res = productServiceDataHandle.prdNoCheck(prdNo);
		return res;
	}

	@Override
	public List<ProductEntity> productSearch(HashMap<String, Object> map) {
		List<ProductEntity> EntityList = productServiceDataHandle.productSearch(map);
		List<ProductEntity> dtoList = new ArrayList<ProductDTO>();
		for(ProductEntity e : entityList) {
			dtoList.add(ProductDTO.toDto(e));
		}
		return dtoList;
	}
	
}
