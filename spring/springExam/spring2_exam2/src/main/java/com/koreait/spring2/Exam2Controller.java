package com.koreait.spring2;

<<<<<<< HEAD
import com.koreait.spring2.vo.ApartmentInfoEntity;
=======
>>>>>>> 44930beee6abc414103c4e0ded1bf9bde9b4a88e
import com.koreait.spring2.vo.SearchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

=======
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

>>>>>>> 44930beee6abc414103c4e0ded1bf9bde9b4a88e
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
<<<<<<< HEAD
    public String result(SearchDTO param, Model model) {
        model.addAttribute("resultList", service.selInfo(param));
        return "result";
=======
    public String result() {
        return "";
>>>>>>> 44930beee6abc414103c4e0ded1bf9bde9b4a88e
    }

    @PostMapping("/result")
    public String result(SearchDTO param) {
<<<<<<< HEAD

        service.saveData(param);
        return "redirect:/result?deal_year=" + param.getDeal_year()
                + "&deal_month=" + param.getDeal_month()
                + "&deal_day=" + param.getDeal_day()
                + "&external_cd=" + param.getExternal_cd();

=======
        service.saveData(param);
        return "redirect:/result";
>>>>>>> 44930beee6abc414103c4e0ded1bf9bde9b4a88e
    }
}
