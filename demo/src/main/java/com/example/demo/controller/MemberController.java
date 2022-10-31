package com.example.demo.controller;


import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;


    @GetMapping("new")
    public String newMember()
    {
        return "new";
    }

    //@GetMapping("create")
    @PostMapping("create")
    public String createMember(Member member)
    {
      //  Member member = new Member("홍길동");
        memberService.insertMember(member);

        return "create";
    }
}
