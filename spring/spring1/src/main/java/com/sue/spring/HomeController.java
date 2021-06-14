package com.sue.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "main/home";
    }

    /*
    @@RequestMapping("/home")
    public void home() { }
    return 파일명과 주소값이 동일하면 void 가능
    */
}
