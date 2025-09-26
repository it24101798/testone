package com.example.registerapp.service;

import com.example.registerapp.entity.Member;
import com.example.registerapp.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    // Method to register a member
    public Member registerMember(Member member) {
        return memberRepository.save(member);
    }
}
