package com.sue.board7.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sue.board7.MyUtils;

@WebServlet("/board/list")
public class BoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDTO param = new BoardDTO();
		
		// 페이징
		final int recordCnt = 5; // 일단 하드코딩,,, 나중엔 값 받아서 사용할 예정		
		int cPage = MyUtils.getParamInt("cPage", request);
		if(cPage == 0) { cPage = 1; } // cPage 키 값이 없을 때, cPage 키 값으로 0 보냈을 때
		int startIdx = (cPage - 1) * recordCnt;
		
		param.setRecordCnt(recordCnt);
		param.setStartIdx(startIdx);
		
		// 검색
		int searchType = MyUtils.getParamInt("searchType", request);
		String searchText = request.getParameter("searchText");
		if(searchType != 0 && searchText != null && !searchText.equals("")) {
			param.setSearchType(searchType);
			param.setSearchText(searchText);
		}
		
		request.setAttribute("pagingCnt", BoardDAO.selPagingCnt(param));
		request.setAttribute("list", BoardDAO.selBoardList(param));
		
		MyUtils.openJSP("리스트", "board/boardList", request, response);
	}	
}