package com.sue.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.event.ListDataListener;

@WebServlet("/detail")
public class BoardDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// query string에서 넘겨준 key값
		String no = request.getParameter("no"); 
		System.out.println("no : " + no); // 야는 콘솔에 찍힘
		
		int intNo = Integer.parseInt(no);
		BoardVO vo = Database.list.get(intNo);
							     // BoardVO 객체 주소값
		request.setAttribute("data", vo); // request.setAttribute("data", Database.list.get(Integer.parseInt(no));
		// jsp에 넘겨줄 값 담는중
		
		// 일종의 리턴값 -> 하단에 적어줘야 함
		String jsp = "/WEB-INF/jsp/detail.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
