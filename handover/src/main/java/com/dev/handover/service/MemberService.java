package com.dev.handover.service;

import com.dev.handover.domain.Member;
import com.dev.handover.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // 서비스 계층의 컴포넌트, 비즈니스 로직 처리
public class MemberService {
    @Autowired
    private MemberRepository memberRepository; // UserRepository 주입

    public Member saveMember(Member member) {
        return memberRepository.save(member); // 사용자 정보 저장
    }
}
