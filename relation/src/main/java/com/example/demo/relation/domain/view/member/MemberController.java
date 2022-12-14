package com.example.demo.relation.domain.view.member;


import com.example.demo.relation.domain.academy.Academy;
import com.example.demo.relation.domain.academy.AcademyRepository;
import com.example.demo.relation.domain.member.Address;
import com.example.demo.relation.domain.member.Member;
import com.example.demo.relation.domain.service.RelationService;
import com.example.demo.relation.domain.view.member.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.sound.midi.MetaMessage;
import javax.validation.Valid;
import java.util.List;

@RequestMapping("/members")
@RequiredArgsConstructor // final 을 찾아서 생성해준다.
@Controller
public class MemberController {

    private final RelationService relationService;

    private final AcademyRepository academyRepository;

    @GetMapping("/new")
    public String insert(@ModelAttribute("form") MemberDto dto) {
        return "members/newMemberForm";
    }

    @PostMapping("/new")
    public String save(@Valid @ModelAttribute("form") MemberDto dto, BindingResult bindingResult) {

        if(bindingResult.hasErrors())
            return "members/newMemberForm";

        List<Academy> academies = academyRepository.findByName(dto.getAcademyName());

        Academy academy = null;

        if(!academies.isEmpty())
            academy = academies.get(0);

        else
            academy = new Academy(dto.getAcademyName());

        List<Member> members = relationService.findById(dto.getLoginId());

        if(!members.isEmpty()) {
            System.out.println("Error Message");
            return "members/newMemberForm";
        }
        else
        {
            Address address = new Address(
                    dto.getCountry(),
                    dto.getCity(),
                    dto.getAddress1(),
                    dto.getAddress2(),
                    dto.getZipcode() );

            relationService.insert (
                    new Member(
                            dto.getLoginId(),
                            dto.getMemberName(),
                            dto.getUserEmail(),
                            dto.getPassword(),
                            academy, address) );
        }
        return "redirect:/";
    }

}









