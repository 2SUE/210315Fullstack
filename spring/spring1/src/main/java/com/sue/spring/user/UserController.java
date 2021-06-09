package com.sue.spring.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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

    // required = false : String에서 무조건 err이라는 쿼리 스트링이 들어가야 하는 강제성 제거
    // int로 줄 땐 defaultValue를 줘야 한다                                          request 같은넘
    public String login(@RequestParam(value = "err", defaultValue = "0") int err, Model model) {
        System.out.println("err : " + err);
        switch (err) {
            case 1: // 아이디 없음
                model.addAttribute("errMsg", "아이디를 확인해 주세요.");
                break;
            case 2: // 비밀번호 틀림
                model.addAttribute("errMsg", "비밀번호를 확인해 주세요.");
                break;
        }
        return "user/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(UserEntity param) {
        return "redirect:" + service.login(param);
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

    @GetMapping("/profile")
    public void profile() {  }

    @PostMapping("/profile") // @RequestMapping(value = "/profile", method = RequestMethod.POST) 똑같음
    public String profile(MultipartFile profileImg) { // MultipartFile[] : 여러 개 보낼 때
        return "redirect:" + service.uploadProfile(profileImg);
    }

    @GetMapping("/logout")
    public String logout(HttpSession hs, HttpServletRequest req) {
        hs.invalidate();

        // 이전 페이지로 이동
        String referer = req.getHeader("Referer");
        return "redirect:" + referer;
        // return "redirect:/user/login";
    }
}