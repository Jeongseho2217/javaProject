package com.spring_boot.project.dto;

import com.spring_boot.project.entity.Member;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class MemberDTO {

    @Getter
    @NoArgsConstructor
    public static class SignUpRequest {
        private String email;
        private String password;
        private String name;
        private String phone;
        private String zipCode;
        private String address;
        private String address2;
        private String role;
    }

    @Getter
    @NoArgsConstructor
    public static class LoginRequest {
        private String email;
        private String password;
    }

    @Getter
    @Builder
    public static class Response {
        private String id;
        private String email;
        private String name;
        private String phone;
        private String zipCode;
        private String address;
        private String address2;
        private String role;

        public static Response from(Member member) {
            return Response.builder()
                    .id(member.getId())
                    .email(member.getEmail())
                    .name(member.getName())
                    .phone(member.getPhone())
                    .zipCode(member.getZipCode())
                    .address(member.getAddress())
                    .address2(member.getAddress2())
                    .role(member.getRole())
                    .build();
        }
    }
}