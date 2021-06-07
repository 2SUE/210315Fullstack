package com.sue.spring.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService service;

    @RequestMapping("/list")
    public String list(Model model) { // model은 request에 값 넣어쥼
        List<BoardDomain> list = service.selBoardList();
        model.addAttribute("list", list);
        return "board/list";
    }

    @RequestMapping("/detail")
    public String detail(BoardDTO param, Model model) {
        System.out.println("iboard : " + param.getIboard());
        BoardDomain data = service.selBoard(param);
        model.addAttribute("data", data);
        return "board/detail";
    }

    @ResponseBody // json 형태로 변환글씨
    @RequestMapping(value = "/cmtIns", method = RequestMethod.POST)
    public Map<String, Integer> cmtInsSel(@RequestBody BoardCmtEntity param) {
        System.out.println("param = " + param);

        int result = service.insBoardCmt(param);

        // 순서 개념이 없어서 for, forEach 이런 거 안 댐
        Map<String, Integer> data = new HashMap<>();
        data.put("result", result);

        return data; ㅎ
    }

    @ResponseBody
    @RequestMapping("/cmtSel")
    // query String으로 날아와서 @requestBody 안 적어도 됨
    public List<BoardCmtDomain> cmtSel(BoardCmtEntity param) {
        System.out.println("param = " + param);

        return service.selBoardCmtList(param);
    }
}