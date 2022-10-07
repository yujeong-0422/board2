package com.example.board.controller;

import com.example.board.Entity.UserInfo;
import com.example.board.Repository.UserInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequiredArgsConstructor
public class TestController {


    private final UserInfoRepository userInfoRepository;

    @GetMapping ("/lab")
    public String name(){
        return "name";
    }

    @PostMapping("/lab/loginpro")
    public String loginpro(String loginId, String loginPw){

//        if(userInfoRepository.findByLoginId(loginId).getLoginId() != null){
//
//            if(userInfoRepository.findByLoginId(loginId).getLoginPw().equals(loginPw)){
//                System.out.println(loginId);
//                System.out.println(loginPw);
//                return "success";
//            }else {
//                System.out.println(loginId);
//                System.out.println(loginPw);
//                return "name";
//            }
//        }
//
//        return "success";


        System.out.println("들어온 값");
        System.out.println(loginId);
        System.out.println(loginPw);


        UserInfo userInfo = new UserInfo();

        userInfo.setLoginId(loginId);
        userInfo.setLoginPw(loginPw);
        System.out.println("세팅한 값");
        System.out.println(userInfo.getLoginId());
        System.out.println(userInfo.getLoginPw());

        userInfoRepository.save(userInfo);
        return "success";
    }


    @GetMapping ("lab/cal")
    public String calculator(){
        return "calculator";
    }

    @PostMapping("/lab/calresult")
    public String calresult(String num1, String num2) {

        UserInfo userInfo = new UserInfo();
        userInfo.setLoginId(num1);
        userInfo.setLoginPw(num2);

        System.out.println("결과값");


        userInfoRepository.save(userInfo);

        System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));

        return "success";

    }


}
