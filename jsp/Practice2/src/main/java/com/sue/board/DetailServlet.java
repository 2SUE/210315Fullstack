package com.sue.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/detail")
public class DetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pageNo = request.getParameter("no");
		
		BoardVO vo = Database.LIST.get(Integer.parseInt(pageNo));
		
		vo.getTitle();
		vo.getCtnt();
		
		request.setAttribute("data", vo);
		
		request.getRequestDispatcher("/WEB-INF/jsp/detail.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}