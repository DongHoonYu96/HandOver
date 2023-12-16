package com.dev.handover.controller;

import com.dev.handover.domain.Member;
import com.dev.handover.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // 컨트롤러 계층, 웹 요청 처리, 서비스를 사용하는곳
public class SignupController {

    @Autowired
    private MemberService memberService; // 주입

    @PostMapping("/signup") // POST 요청 처리
    public String registerUser(@RequestParam String username,
                               @RequestParam String password) {
        Member member = new Member();
        member.setName(username); // 사용자 이름 설정
        member.setPassword(password); // 비밀번호 설정
        memberService.saveMember(member); // 사용자 정보 저장
        return "redirect:/login";   // 로그인 페이지로 리디렉션
    }
}
