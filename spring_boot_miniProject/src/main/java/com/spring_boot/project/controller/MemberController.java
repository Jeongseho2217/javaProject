package com.spring_boot.project.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.spring_boot.project.dto.MemberDTO;
import com.spring_boot.project.service.MemberService;

@RestController
@RequestMapping("/api/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    // 회원가입
    @PostMapping("/signup")
    public ResponseEntity<MemberDTO.Response> signUp(@RequestBody MemberDTO.SignUpRequest request) {
        return ResponseEntity.ok(memberService.signUp(request));
    }

    // 로그인
    @PostMapping("/login")
    public ResponseEntity<MemberDTO.Response> login(@RequestBody MemberDTO.LoginRequest request) {
        return ResponseEntity.ok(memberService.login(request));
    }

    // 내 정보 조회
    @GetMapping("/{id}")
    public ResponseEntity<MemberDTO.Response> getProfile(@PathVariable("id") String id) {
        return ResponseEntity.ok(memberService.getMember(id));
    }
}