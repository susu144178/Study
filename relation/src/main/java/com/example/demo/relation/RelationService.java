package com.example.demo.relation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class RelationService {

    @Autowired
    private RelationRepository relationRepository;


    public void insertAcademy(Academy academy, Member member)
    {
        Academy academy1 = new Academy("메가스터디");
        Academy academy2 = new Academy("서면학원");
        Member member1 = new Member("홍길동", academy1);

        relationRepository.insertAcademy(academy1, academy2);
        relationRepository.insertMember(member1);
    }





}
