package com.spring_boot.project.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "PRODUCTS")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "prd_id")
    private String id;

    @Column(name = "ctg_id", nullable = false)
    private String categoryId;

    @Column(name = "prd_name", nullable = false)
    private String name;

    @Column(name = "prd_price", nullable = false)
    private Integer price;

    @Column(name = "prd_stock", nullable = false)
    private Integer stock;

    @Column(name = "prd_img")
    private String imageUrl;

    @Column(name = "prd_desc")
    private String description;

    @Column(name = "prd_layout")
    private String layout;

    @Column(name = "prd_pin")
    private Integer pin;

    @Column(name = "prd_status", nullable = false)
    private String status;

    @CreationTimestamp
    @Column(name = "prd_date", updatable = false)
    private LocalDateTime regDate;
    
    @Builder
    public Product(String categoryId, String name, Integer price, Integer stock, 
                   String imageUrl, String description, String layout, Integer pin, String status) {
        this.categoryId = categoryId;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.imageUrl = imageUrl;
        this.description = description;
        this.layout = layout;
        this.pin = pin;
        this.status = status;
    }

    public void decreaseStock(int quantity) {
        int remainingStock = this.stock - quantity; // 구매 수량 만큼 재고 줄이기
        if (remainingStock < 0) {
            throw new IllegalStateException("상품 재고가 부족합니다. (현재 재고: " + this.stock + ")"); // 더이상 없을 경우 문구 반환
        }
        this.stock = remainingStock;
        if (this.stock == 0) {
            this.status = "SOLD_OUT"; // 딱 0이 되면 매진 표시
        }
    }

    public void increaseStock(int quantity) {
        this.stock += quantity; // 재고 수량만큼 더하기
        if (this.stock > 0 && "SOLD_OUT".equals(this.status)) { // 재고가 없었다면
            this.status = "ON_SALE"; // 다시 판매중으로 돌리기
        }
    }
}
