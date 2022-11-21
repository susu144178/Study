package com.example.demo.relation.domain.view.member.dto;


import com.example.demo.relation.domain.academy.Academy;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberDto {

    private String memberName;
    private Academy academy;


    public MemberDto(String memberName, Academy academy) {
        this.memberName = memberName;
        this.academy = academy;
    }
}
