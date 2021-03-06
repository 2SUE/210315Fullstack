package com.sue.board.board2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sue.board.MyUtils;
import com.sue.board.cmt.CmtDAO;

@WebServlet("/board/detail")
public class DetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int iboard = MyUtils.getParamInt("iboard", request);
		int iuser = MyUtils.getLoginUserPK(request);
		
		BoardVO data = BoardDAO.selBoard(iboard);
		
		request.setAttribute("data", data);
		
		request.setAttribute("cmtList", CmtDAO.selCmtList(iboard));
		
		request.setAttribute("Selcmt", CmtDAO.selCmt(iuser));
		
		MyUtils.openJSP("board/detail", request, response);
	}
}
