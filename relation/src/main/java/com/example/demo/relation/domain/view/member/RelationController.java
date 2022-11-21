package com.example.demo.relation.domain.view.member;


import com.example.demo.relation.domain.academy.Academy;
import com.example.demo.relation.domain.member.Member;
import com.example.demo.relation.domain.service.OrderService;
import com.example.demo.relation.domain.view.member.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/members")
@RequiredArgsConstructor // final 을 찾아서 생성해준다.
@Controller
public class RelationController {

    private final OrderService orderService;

    @GetMapping("/new")
    public String insert(@ModelAttribute("form") MemberDto dto) {
        return "members/newMemberForm";
    }

    @PostMapping("/new")
    public String save(@Valid @ModelAttribute("form") MemberDto dto) {
        orderService.insert(
                new Member( dto.getMemberName()) );
        return "redirect:/";
    }

}
