package com.spring_boot.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring_boot.project.entity.Order;

import java.util.List;

public interface IOrderRepository extends JpaRepository<Order, String> {
    List<Order> findByMemberIdOrderByRegDateDesc(String memberId);
}