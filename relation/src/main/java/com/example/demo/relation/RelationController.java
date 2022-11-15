package com.example.demo.relation;


import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional(readOnly = true)
@Controller
public class RelationController {

    @PersistenceContext
    private EntityManager em;

    @Transactional()
    @GetMapping("main")
    public String insert()
    {
        Academy academy1 = new Academy("메가스터디컴퓨터학원");
        Academy academy2 = new Academy("서면컴퓨터학원");
        Academy academy3 = new Academy("부산컴퓨터학원");
        Member member = new Member("홍길동", academy2);
        academy3.addMember(member);

        em.persist(member);
        em.persist(academy1);
        em.persist(academy2);
        em.persist(academy3);

        return "redirect:/";
    }
}
