package com.koreait.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/join")
    public String join() {
        return "user/join";
    }

    @PostMapping("/join")
    public String join(UserVO param) {
        service.insUser(param);
        return "redirect:/user/login";
    }

    @GetMapping("/login")
    public String login() {
        return "/user/login";
    }

    @PostMapping("/login")
    public String login(UserVO param, Model model) {
        int result = service.selUser(param);

        switch (result) {
            case 0:
                model.addAttribute("errMsg", "아이디 없음");
                return "/user/login";
            case 2:
                model.addAttribute("errMsg", "비밀번호 틀림");
                return "/user/login";
        }
        return "redirect:/board/list";
    }
}