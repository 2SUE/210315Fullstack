package com.sue.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list") // 중요~! URL mapping
public class BoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// get방식 주목적 : 화면 띄우기 -> jsp파일 응답
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
 						  // String, Object(모든 타입이 다 들어감)
		request.setAttribute("data", Database.list);
		
		// 아래 두 줄은 항상 들어간다고 보면 됨
		String jsp = "/WEB-INF/jsp/list.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
	}
}