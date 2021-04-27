package com.sue.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/modify")
public class Modify extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pageNum = request.getParameter("no");
		BoardVO vo = Database.LIST.get(Integer.parseInt(pageNum));
		
		request.setAttribute("data", vo);
		
		String jsp = "/WEB-INF/jsp/modify.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String pageNum = request.getParameter("no");
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");
		BoardVO vo = Database.LIST.get(Integer.parseInt(pageNum));
		
		vo.setTitle(title);
		vo.setCtnt(ctnt);
		
		response.sendRedirect("/detail?no=" + pageNum);
	}
}
