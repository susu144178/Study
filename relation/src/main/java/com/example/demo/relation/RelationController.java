package com.example.demo.relation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class RelationController {

    @Autowired
    private RelationService relationService;

    @GetMapping("main")
    public String insert(Member member, Academy academy)
    {
        Academy academy1 = new Academy("메가스터디");
        Academy academy2 = new Academy("서면학원");
        Member member1 = new Member("홍길동", academy1);

        relationService.insertAcademy(academy1, academy2);
        relationService.insertMember(member1);

        return "redirect:/";
    }

}
