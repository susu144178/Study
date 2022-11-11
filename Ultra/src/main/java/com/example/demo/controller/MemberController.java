package com.example.demo.controller;

import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("new")
    public String newMember()
    {
        return "new";
    }

}
