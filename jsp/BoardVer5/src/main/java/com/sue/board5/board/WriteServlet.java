package com.sue.board5.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sue.board5.MyUtils;
import com.sue.board5.user.UserVO;

@WebServlet("/board/write")
public class WriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MyUtils.openJSP("board/write", request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");
		
		HttpSession hs = request.getSession();
		UserVO vo = (UserVO) hs.getAttribute("loginUser");
		System.out.println("vo iuser 값 : " + vo.getIuser());
		
		BoardVO param = new BoardVO();
		param.setTitle(title);
		param.setCtnt(ctnt);
		param.setIuser(vo.getIuser());
		System.out.println("param iuser 값 : " + param.getIuser());
		
		BoardDAO.isrtBoard(param);
		
		response.sendRedirect("list");
	}
}