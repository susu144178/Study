package com.example.demo.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter @Setter
@NoArgsConstructor // 기본 생성자 만들어준다.
@Entity
@Table(name = "Member")
public class Member {

    @Id @GeneratedValue
    private Long id;

    @Column(name = "NAME")
    private String userName;

    public Member(String userName)
    {
        this.userName = userName;
    }

}
