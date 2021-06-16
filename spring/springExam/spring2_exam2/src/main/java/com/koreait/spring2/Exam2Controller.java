package com.koreait.spring2;

import com.koreait.spring2.vo.SearchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Exam2Controller {
    @Autowired
    private Exam2Service2 service;

    @RequestMapping("/")
    public String main(Model model) {
        model.addAttribute("locationList", service.selLocationCodeList());
        return "main";
    }

    @GetMapping("/result")
    public String result() {
        return "";
    }

    @PostMapping("/result")
    public String result(SearchDTO param) {
        service.saveData(param);
        return "redirect:/result";
    }
}
