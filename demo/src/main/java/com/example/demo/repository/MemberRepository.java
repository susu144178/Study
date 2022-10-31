package com.example.demo.repository;


import com.example.demo.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository  {

    @PersistenceContext
    private EntityManager em;

    public void insertMember(Member member)
    {
        em.persist(member);
    }


}
