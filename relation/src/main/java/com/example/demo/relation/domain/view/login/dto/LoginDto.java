package com.example.demo.relation.domain.view.login.dto;


import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class LoginDto {

    @NotEmpty(message = "필수 항목 입니다.")
    private String loginId;

    @NotEmpty(message = "필수 항목 입니다.")
    private String password;
}
