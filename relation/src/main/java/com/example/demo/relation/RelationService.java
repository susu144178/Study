package com.example.demo.relation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class RelationService {

    @Autowired
    private RelationRepository relationRepository;


    public void insertMember(Member member1) {
        relationRepository.insertMember(member1);
    }

    public void insertAcademy(Academy academy1, Academy academy2)
    {
        relationRepository.insertAcademy(academy1, academy2);
    }

}
