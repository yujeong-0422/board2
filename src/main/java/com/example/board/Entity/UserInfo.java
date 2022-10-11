package com.example.board.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity @Getter @Setter
public class UserInfo {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long uid;

    private String loginId;
    private String loginPw;


    private String title;
    private String content;

}
