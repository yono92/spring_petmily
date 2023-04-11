package com.petmily.petmily.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userkey")
    private int userkey;

    @Column(name = "userid")
    private String userid;

    @Column(name = "password")
    private String password;

    @Column(name = "username")
    private String username;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "address")
    private String address;

    @Column(name = "zipcode")
    private String zipcode;

    @Column(name = "phonenum")
    private String phonenum;

    @Column(name = "email")
    private String email;

    @Column(name = "usertype")
    private String usertype;
}
