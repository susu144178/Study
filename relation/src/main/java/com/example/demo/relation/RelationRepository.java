package com.example.demo.relation;


import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class RelationRepository {

    @PersistenceContext
    private EntityManager em;


    public void insertMember(Member member1) { em.persist(member1); }

    public void insertAcademy(Academy academy1, Academy academy2)
    {
        em.persist(academy1);
        em.persist(academy2);
    }
}
