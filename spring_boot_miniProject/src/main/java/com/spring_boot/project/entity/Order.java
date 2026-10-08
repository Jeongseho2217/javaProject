package com.spring_boot.project.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ORDERS")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ord_id")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mem_id", nullable = false)
    private Member member;

    @Column(name = "ord_total_price", nullable = false)
    private Integer totalPrice;

    @Column(name = "ord_name", nullable = false)
    private String receiverName;

    @Column(name = "ord_tel", nullable = false)
    private String phone;

    @Column(name = "ord_zipcode", nullable = false)
    private String zipCode;

    @Column(name = "ord_address", nullable = false)
    private String address;

    @Column(name = "ord_address2")
    private String addressDetail;

    @Column(name = "ord_status", nullable = false)
    private String status; // 'ORDER_COMPLETED', 'CANCELLED'

    @CreationTimestamp
    @Column(name = "ord_date", updatable = false)
    private LocalDateTime regDate;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> orderItems = new ArrayList<>();

    @Builder
    public Order(Member member, Integer totalPrice, String receiverName, 
                 String phone, String zipCode, String address, String addressDetail, String status) {
        this.member = member;
        this.totalPrice = totalPrice;
        this.receiverName = receiverName;
        this.phone = phone;
        this.zipCode = zipCode;
        this.address = address;
        this.addressDetail = addressDetail;
        this.status = (status != null) ? status : "ORDER_COMPLETED";
    }

    public void addOrderItem(OrderItem orderItem) {
        this.orderItems.add(orderItem);
        orderItem.assignOrder(this);
    }

    public void cancelOrder() {
        this.status = "CANCELLED";
    }
}