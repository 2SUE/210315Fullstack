package com.sue.spring.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
// bean(스프링에서 관리하는 객체) 등록
@Controller

// 서블릿과 주소값 매핑
// class 위 RequestMapping : 1차 주소값
@RequestMapping("/user")
public class UserController {

    // 자동으로 연결
    @Autowired
    private com.sue.spring.user.UserService service;

    // class 아래 RequestMapping : 2차 주소값
    // default : method = RequestMethod.GET
    @RequestMapping("/login")
    public String login() {
        return "user/login";
    }

    /*
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login() { return "user/login"; }
    */

    @RequestMapping("/join")
    public String join() { return "user/join"; }

    @RequestMapping(value = "/join", method = RequestMethod.POST)
    public String join(UserEntity param) {
        System.out.println("멤버필드 : " + param);
        service.join(param);

        return "user/login"; // response.sendRedirect 역할
    }
}