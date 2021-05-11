package com.sue.board.board2;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sue.board.MyUtils;
import com.sue.board.user.UserVO;

@WebServlet("/board/list")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs = request.getSession();
		UserVO loginUser = (UserVO) hs.getAttribute("loginUser");
		
		// 로그인 성공 => board/list.jsp 파일 응답
		// 로그인 실패 => user/login.jsp 파일 응답
		
		if(loginUser == null) {
			response.sendRedirect("/user/login");
			return;
		}
		
		List<BoardVO> list = BoardDAO.selBoard();
		
		hs.setAttribute("list", list);
		
		MyUtils.openJSP("board/list", request, response);
	}
	
	/*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs = request.getSession();

		Boolean loginSuccess = (Boolean) hs.getAttribute("loginSuccess");
		System.out.println("loginSuccess : " + loginSuccess);
		if(loginSuccess == null || loginSuccess == false) {
			response.sendRedirect("/user/login");
			return;
		}
		
		MyUtils.openJSP("board/list", request, response);
	}
	*/
}