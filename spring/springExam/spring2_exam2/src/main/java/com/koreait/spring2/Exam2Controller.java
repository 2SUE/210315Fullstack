package com.koreait.spring2;

import com.koreait.spring2.vo.ApartmentInfoEntity;
import com.koreait.spring2.vo.SearchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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
    public String result(SearchDTO param, Model model) {
        model.addAttribute("resultList", service.selInfo(param));
        return "result";
    }

    @PostMapping("/result")
    public String result(SearchDTO param) {

        service.saveData(param);
        return "redirect:/result?deal_year=" + param.getDeal_year()
                + "&deal_month=" + param.getDeal_month()
                + "&deal_day=" + param.getDeal_day()
                + "&external_cd=" + param.getExternal_cd();

    }
}
