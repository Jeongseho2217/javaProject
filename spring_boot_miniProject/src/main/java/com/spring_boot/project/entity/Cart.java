package com.spring_boot.project.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "CARTS")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "cart_id")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY) // 지연로딩
    @JoinColumn(name = "mem_id", nullable = false)
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prd_id", nullable = false)
    private Product product;

    @Column(name = "cart_qty", nullable = false)
    private Integer quantity;

    @Column(name = "bundle_id")
    private String bundleId;

    @CreationTimestamp
    @Column(name = "cart_date", updatable = false)
    private LocalDateTime regDate;

    @Builder
    public Cart(Member member, Product product, Integer quantity, String bundleId) {
        this.member = member;
        this.product = product;
        this.quantity = (quantity != null) ? quantity : 1;
        this.bundleId = bundleId;
    }

    public void updateQuantity(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("수량은 1개 이상이어야 합니다.");
        }
        this.quantity = quantity;
    }
}