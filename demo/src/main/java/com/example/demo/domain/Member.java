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
    private String username;

    public Member(String username)
    {
        this.username = username;
    }


    /*
    @Column(name = "AGE")
    private Integer age;

    @Column(name = "EMAIL")
    private String email;




    public Member(String userName, Integer age, String email)
    {
        this.userName = userName;
        this.age = age;
        this.email = email;
    }

     */
}

// ** [영속성]

// ** 영속 : EntityManager 에 포함된 상태
// ** 비 영속 : EntityManager 에 포함되기 전 상태
// ** 준 영속 : EntityManager 에 포함 되었었고, 현재는 포함되지 않은 상태
// ** 삭제 : 삭제된 상태
