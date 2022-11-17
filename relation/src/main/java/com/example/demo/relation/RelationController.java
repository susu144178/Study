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
        relationService.insertAcademy(academy, member);

        return "redirect:/";
    }

}
