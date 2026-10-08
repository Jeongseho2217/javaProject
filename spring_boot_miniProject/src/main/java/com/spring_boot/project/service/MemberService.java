package com.spring_boot.project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring_boot.project.dto.MemberDTO;
import com.spring_boot.project.entity.Member;
import com.spring_boot.project.repository.IMemberRepository;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {

    private final IMemberRepository memberRepository;

    // 회원가입
    @Transactional
    public MemberDTO.Response signUp(MemberDTO.SignUpRequest request) {
        if (memberRepository.existsByEmail(request.getEmail())) {
            throw new IllegalArgumentException("이미 사용 중인 이메일입니다.");
        }

        Member member = Member.builder()
                .email(request.getEmail())
                .password(request.getPassword())
                .name(request.getName())
                .role(request.getRole() != null ? request.getRole() : "ROLE_USER")
                .build();

        Member savedMember = memberRepository.save(member);
        return MemberDTO.Response.from(savedMember);
    }

    // 로그인 검증
    public MemberDTO.Response login(MemberDTO.LoginRequest request) {
        Member member = memberRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new IllegalArgumentException("가입되지 않은 이메일입니다."));

        if (!member.getPassword().equals(request.getPassword())) {
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        }

        return MemberDTO.Response.from(member);
    }

    // 회원 단일 조회
    public MemberDTO.Response getMember(String id) {
        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("회원을 찾을 수 없습니다."));
        return MemberDTO.Response.from(member);
    }
}