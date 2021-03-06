package com.sue.site.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sue.site.MyUtils;

@WebServlet("/board/list")
public class BoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs = request.getSession();
		
		if(hs.getAttribute("loginUser") == null) {
			response.sendRedirect("/user/login");
			return;
		}
		
		request.setAttribute("list", BoardDAO.selBoardList());
		
		MyUtils.openJSP("/board/list", request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}