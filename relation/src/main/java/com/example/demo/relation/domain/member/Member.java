package com.example.demo.relation.domain.member;


import com.example.demo.relation.domain.academy.Academy;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@SecondaryTables({
        @SecondaryTable(name = "member_address", pkJoinColumns = @PrimaryKeyJoinColumn(name = "id"))
})
@NoArgsConstructor
@Entity
public class Member {

    @Id @GeneratedValue
    private Long id;

    @Column(name = "login_id")
    private String loginId;

    @Column(name = "member_name")
    private String memberName;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "password")
    private String password;

    @AttributeOverrides({
            @AttributeOverride(name = "address1", column = @Column(table = "member_address", name = "address1")),
            @AttributeOverride(name = "address2", column = @Column(table = "member_address", name = "address2")),
            @AttributeOverride(name = "zipcode", column = @Column(table = "member_address", name = "zipcode") )
    })
    private Address address;

    @JoinColumn(name = "academy_id")
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Academy academy;

    public Member(String loginId, String memberName, String userEmail,  String password, Academy academy, Address address) {
        this.loginId = loginId;
        this.memberName = memberName;
        this.userEmail = userEmail;
        this.password = password;
        this.academy = academy;
        this.address = address;

    }

}
