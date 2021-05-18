package com.sue.board5.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sue.board5.MyUtils;
import com.sue.board5.cmt.CmtDAO;

@WebServlet("/board/detail")
public class DetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int iboard = MyUtils.getParamInt("iboard", request);
		BoardVO vo = new BoardVO();
		vo.setIboard(iboard);
		
		request.setAttribute("vo", BoardDAO.selBoard(vo)); // 글의 정보
		request.setAttribute("cmtlist", CmtDAO.selCmtList(iboard)); // 댓글 리스트의 정보
				
		MyUtils.openJSP("board/detail", request, response);
	}
}