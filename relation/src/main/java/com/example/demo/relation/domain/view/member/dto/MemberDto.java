package com.example.demo.relation.domain.view.member.dto;


import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class MemberDto {

    @NotEmpty // 비어있는 상태로 받을 수 없다.
    private String loginId;

    @NotEmpty
    private String password;

    @NotEmpty
    private String memberName;

    @NotEmpty
    private String academyName;

}
