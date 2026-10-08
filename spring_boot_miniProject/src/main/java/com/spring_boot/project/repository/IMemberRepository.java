package com.spring_boot.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring_boot.project.entity.Member;
import java.util.Optional;

public interface IMemberRepository extends JpaRepository<Member, String> {
    Optional<Member> findByEmail(String email);
    boolean existsByEmail(String email);
}