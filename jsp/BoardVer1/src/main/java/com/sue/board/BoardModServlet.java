package com.sue.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mod")
public class BoardModServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String getNo = request.getParameter("no");
		request.setAttribute("data", Database.list.get(Integer.parseInt(getNo)));
		
		String jsp = "/WEB-INF/jsp/mod.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		// 전달받은 값덜
		String no = request.getParameter("no"); // 값을 구분하기 위한 primary key
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");
		
		BoardVO vo = Database.list.get(Integer.parseInt(no));
		
		vo.setTitle(title);
		vo.setCtnt(ctnt);
		
		// detail 화면으로 이동
		response.sendRedirect("/detail?no=" + no);
	}
}
