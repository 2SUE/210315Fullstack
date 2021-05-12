package com.sue.board.board2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sue.board.MyUtils;

@WebServlet("/board/del")
public class DelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int iboard = MyUtils.getParamInt("iboard", request);
		int iuser = MyUtils.getLoginUserPK(request);
		
		BoardVO param = new BoardVO();
		param.setIboard(iboard);
		param.setIuser(iuser);
		BoardDAO.delBoard(param);
		
		response.sendRedirect("list");
	}
}
