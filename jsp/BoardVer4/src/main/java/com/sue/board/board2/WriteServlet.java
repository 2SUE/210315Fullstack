package com.sue.board.board2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sue.board.MyUtils;
import com.sue.board.user.UserVO;

@WebServlet("/board/write")
public class WriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs = request.getSession();
		UserVO loginUser = (UserVO) hs.getAttribute("loginUser");
		
		if(loginUser == null) {
			response.sendRedirect("/user/login");
			return;
		}
		
		MyUtils.openJSP("board/write", request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");
		
		/*
		HttpSession hs = request.getSession();
		UserVO loginUser = (UserVO) hs.getAttribute("loginUser");
		
		int iuser = loginUser.getIuser();
		*/
		
		// iuser 값이 넘어옴 
		int iuser = MyUtils.getLoginUserPK(request);
		System.out.println(iuser);
		
		BoardVO param = new BoardVO();
		param.setIuser(iuser);
		param.setTitle(title);
		param.setCtnt(ctnt);
		
		BoardDAO.insBoard(param);
		
		response.sendRedirect("list");
	}
}