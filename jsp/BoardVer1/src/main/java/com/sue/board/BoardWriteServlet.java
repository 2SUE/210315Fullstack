package com.sue.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/write")
public class BoardWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String jsp = "/WEB-INF/jsp/write.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(jsp);
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); // POST 방식 한글 깨짐현상 방지
		
		// 클라이언트에서 넘오는 건 모두 getParameter에서 받음
		// input의 name 속성 값 -> key / 입력된 값 -> value
		String title = request.getParameter("title"); 
		String ctnt = request.getParameter("ctnt");
		
		// 곧바로 데이터를 넘기지 않고 객체에 담아서 보낸다~
		// 걍 보내도 되지만 이렇게 써라~
		BoardVO vo = new BoardVO();
		vo.setTitle(title);
		vo.setCtnt(ctnt);
		
		Database.list.add(vo); // ArrayList 내장(?) 함수 add() 사용
		
		// get방식으로 주소 이동
		response.sendRedirect("/list");
	}
}
