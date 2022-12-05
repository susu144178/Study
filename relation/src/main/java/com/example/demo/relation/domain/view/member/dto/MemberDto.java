package com.example.demo.relation.domain.view.member.dto;


import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

@Data
public class MemberDto {

    @NotEmpty(message = "필수 항목 입니다.") // 비어있는 상태로 받을 수 없다.
    private String loginId;

    @NotEmpty(message = "필수 항목 입니다.")
    private String userEmail;

    @NotEmpty(message = "필수 항목 입니다.")
    private String password;

    @NotEmpty(message = "필수 항목 입니다.")
    private String passwordConfirm;

    @NotEmpty(message = "필수 항목 입니다.")
    private String memberName;

    @NotEmpty(message = "필수 항목 입니다.")
    private String academyName;

}
