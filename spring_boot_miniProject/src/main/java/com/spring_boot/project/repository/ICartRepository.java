package com.spring_boot.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_boot.project.entity.Cart;
import java.util.List;

public interface ICartRepository extends JpaRepository<Cart, String> {
    List<Cart> findByMemberIdOrderByRegDateDesc(String memberId);
    void deleteByMemberIdAndBundleId(String memberId, String bundleId);
}