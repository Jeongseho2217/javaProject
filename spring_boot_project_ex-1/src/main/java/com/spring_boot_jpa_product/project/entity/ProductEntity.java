package com.spring_boot_jpa_product.project.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.spring_boot_jpa_product.project.dto.ProductDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name="product")
@Getter
@NoArgsConstructor // 엔티티 클래스에서 반드시 필요한 기본 생성자
@AllArgsConstructor
@Builder // 매개변수가 있는 생성자가 자동으로 구성
public class ProductEntity {
	
	@Id //기본키 필드
	private String prdNo;
	// DB 테이블의 컬럼명(DB)과 필드명(here)이 다를 경우 @Column으로 바인딩
	//@Column(name="prd_name")
	private String prdName;
	private int prdPrice;
	private String prdCompany;
	private int prdStock;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date prdDate;
	
	// DTO->Entity 반환시 사용
	public static ProductEntity toEntity(ProductDTO dto) {
		return ProductEntity.builder()
				.prdNo(dto.getPrdNo())
				.prdName(dto.getPrdName())
				.prdPrice(dto.getPrdPrice())
				.prdCompany(dto.getPrdCompany())
				.prdStock(dto.getPrdStock())
				.prdDate(dto.getPrdDate())
				.build();
	}
	
}
