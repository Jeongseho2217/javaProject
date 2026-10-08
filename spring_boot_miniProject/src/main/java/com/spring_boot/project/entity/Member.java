package com.spring_boot.project.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "MEMBERS")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "mem_id")
    private String id;

    @Column(name = "mem_email", nullable = false, unique = true)
    private String email;

    @Column(name = "mem_pw", nullable = false)
    private String password;

    @Column(name = "mem_name", nullable = false)
    private String name;

    @Column(name = "mem_tel")
    private String phone;

    @Column(name = "mem_zipcode")
    private String zipCode;

    @Column(name = "mem_address")
    private String address;

    @Column(name = "mem_address2")
    private String address2;

    @Column(name = "mem_role", nullable = false)
    private String role;

    @CreationTimestamp
    @Column(name = "mem_date", updatable = false)
    private LocalDateTime regDate;

    @Builder
    public Member(String email, String password, String name, 
                  String phone, String zipCode, String address, String address2, String role) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.zipCode = zipCode;
        this.address = address;
        this.address2 = address2;
        this.role = (role != null) ? role : "ROLE_USER";
    }
}