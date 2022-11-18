package com.example.demo.relation;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Member {

    @Id @GeneratedValue
    private Long id;
    @Column(name = "member_name")
    private String memberName;
    @JoinColumn
    @ManyToOne
    private Academy academy;

    public Member(String memberName, Academy academy) {
        this.memberName = memberName;
        this.academy = academy;
    }
}
