package com.sue.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/del")
public class BoardDelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String iBoard = request.getParameter("iboard");
		int intIboard = Integer.parseInt(iBoard);
		
		BoardVO param = new BoardVO();
		param.setIboard(intIboard);
		BoardDAO.delBoard(param);
		
		response.sendRedirect("/list");
	}
}
