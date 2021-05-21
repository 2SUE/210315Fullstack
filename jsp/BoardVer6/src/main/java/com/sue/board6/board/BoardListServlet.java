package com.sue.board6.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sue.board6.MyUtils;

@WebServlet("/board/list")
public class BoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String search = request.getParameter("search");
		if(search == null) { search = ""; }
		int page = MyUtils.getParamInt("page", request);
				
		if(page == 0) { // query String을 안 보냈을 때
			page = 1;
		}
		
		int recordCnt = 5; // 한 페이지당 5글씩
		
		int sIdx = (page - 1) * recordCnt;
				
		BoardVO param = new BoardVO();
		param.setsIdx(sIdx);
		param.setPage(recordCnt);
		param.setSearch(search);
		
		request.setAttribute("totalPage", BoardDAO.getAllPage(param));
		request.setAttribute("list", BoardDAO.selBaordList(param));
		
		MyUtils.openJSP("리스트", "board/list", request, response);
	}
}