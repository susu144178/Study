package com.example.demo.relation.domain.view.member;


import com.example.demo.relation.domain.academy.Academy;
import com.example.demo.relation.domain.academy.AcademyRepository;
import com.example.demo.relation.domain.member.Member;
import com.example.demo.relation.domain.service.MemberService;
import com.example.demo.relation.domain.service.OrderService;
import com.example.demo.relation.domain.view.member.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/members")
@RequiredArgsConstructor // final 을 찾아서 생성해준다.
@Controller
public class RelationController {

    private final MemberService memberService;

    private final AcademyRepository academyRepository;

    @GetMapping("/new")
    public String insert(@ModelAttribute("form") MemberDto dto) {
        return "members/newMemberForm";
    }

    @PostMapping("/new")
    public String save(@Valid @ModelAttribute("form") MemberDto dto) {

        List<Member> members = memberService.findByName(dto.getAcademyName());

        if(members.isEmpty()){

            Academy academy = new Academy(dto.getAcademyName());

            memberService.insert(new Member(
                    dto.getLoginId(), dto.getMemberName(), dto.getPassword(), academy));
        }
        else {
            for (Member member : members) {
                if(!member.getMemberName().equals(dto.getMemberName())) {

                    Academy academy = new Academy(dto.getAcademyName());

                    memberService.insert(new Member(
                            dto.getLoginId(), dto.getMemberName(), dto.getPassword(), academy));
                }
                System.out.println(member.getMemberName());
            }
        }



        /*
        List<Academy> all = academyRepository.findAll();
        if(all.isEmpty())
        {
            Academy academy = new Academy(dto.getAcademyName());
            memberService.insert(new Member( dto.getLoginId(), dto.getMemberName(), dto.getPassword(), academy));
        }
        else {
            for (Academy element : all) {

                if (element.getAcademyName().equals(dto.getAcademyName())) {
                    Academy academy = academyRepository.findById(element.getId());
                    memberService.insert(new Member( dto.getLoginId(), dto.getMemberName(), dto.getPassword(), academy));
                }
            }
        }

         */

        return "redirect:/";
    }

    }








