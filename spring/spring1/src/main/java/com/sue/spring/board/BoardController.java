package com.sue.spring.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// bean 등륙
@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired
    private BoardService service;

    @RequestMapping("/list")
    public String list(BoardDTO param, Model model) { // model은 request에 값 넣어쥼
        model.addAttribute("list", service.selBoardList(param));
        model.addAttribute("maxPageVal", service.selMaxPageVal(param));
        return "board/list";
    }

    /*
    주소 값과 리턴 값이 동일하면 void 가능, return 안 해도 됨됨
   @RequestMapping("/list")
    public void list(어쩌고) { 저쩌고 }
    */

    @RequestMapping("/detail")
    public String detail(BoardDTO param, Model model) {
        System.out.println("iboard : " + param.getIboard());
        BoardDomain data = service.selBoard(param);
        model.addAttribute(data); // key 값을 안 적어주면 보내는 타입을 키 값으로 설정함
        return "board/detail";
    }

    @GetMapping("/writeMod")
    public void writeMod(BoardEntity param) {
        System.out.println("param : " + param);
    } // board/writeMod.jsp file 응답

    @PostMapping("/writeMod")
    public String writeModProc(BoardEntity param) {
        int iboard = service.writeMod(param);
        return "redirect:detail?iboard=" + iboard;
    }

    @ResponseBody // json 형태로 변환
    @RequestMapping(value = "/cmt", method = RequestMethod.POST)
    public Map<String, Integer> cmtIns(@RequestBody BoardCmtEntity param) {
        System.out.println("cmtIns param = " + param);

        int result = service.insBoardCmt(param);

        // 순서 개념이 없어서 for, forEach 이런 거 안 댐
        Map<String, Integer> data = new HashMap<>();
        data.put("result", result);

        return data;
    }

    // query String으로 날아와서 @requestBody 안 적어도 됨
    @ResponseBody
    @RequestMapping("/cmt/{iboard}")                       // 스프링이 객체생성 해줌
    public List<BoardCmtDomain> cmtSel(@PathVariable int iboard, BoardCmtEntity param) {
        param.setIboard(iboard);
        return service.selBoardCmtList(param);
    }

    @ResponseBody
    @RequestMapping(value = "/cmt/{icmt}", method = RequestMethod.DELETE)
    public Map<String, Integer> cmtDel(BoardCmtEntity param, @PathVariable int icmt) {
        param.setIcmt(icmt);

        System.out.println("cmtDel param : " + param);

        int result = service.delBoardCmt(param);

        // JSON 형태로 객체화
        Map<String, Integer> data = new HashMap<>();
        data.put("result", result);

        return data;
    }

    @ResponseBody
    @RequestMapping(value="/cmt", method = RequestMethod.PUT)
    public Map<String, Integer> cmtUpd(@RequestBody BoardCmtEntity param) {
        int result = service.updBoardCmt(param);
        Map<String, Integer> data = new HashMap();
        data.put("result", result);
        return data;
    }
}