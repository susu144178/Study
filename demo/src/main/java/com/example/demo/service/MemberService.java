package com.example.demo.service;


import com.example.demo.domain.Member;
import com.example.demo.dto.MemberDto;
import com.example.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;


    public void insertMember(MemberDto dto)
    {
        memberRepository.insertMember(new Member(dto.getUsername()));
    }

    public List<Member> findAll() {
        return memberRepository.findAll();

    }
}
