package com.example.demo.service;


import com.example.demo.dto.MemberDto;
import com.example.demo.member.Member;
import com.example.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional @Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public void insertMember(MemberDto dto)
    {
        memberRepository.insertMember(new Member(dto.getUsername()));
    }




}
