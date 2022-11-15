package com.example.demo.controller;

import com.example.demo.dto.MemberDto;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;


@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("new")
    public String newMember() { return "new"; }

    @GetMapping("trigger")
    public String triggerMember() { return "trigger"; }

    @GetMapping("sixultra")
    public String sixultraMember()
    {
        return "sixultra";
    }

    @GetMapping("taro")
    public String taroMember() { return "taro"; }

    @PostMapping("create")
    public String createMember(@Valid MemberDto dto)
    {
        memberService.insertMember(dto);

        return "redirect:/";
    }



}
