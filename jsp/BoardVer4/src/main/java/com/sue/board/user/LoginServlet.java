package com.sue.board.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sue.board.MyUtils;

@WebServlet("/user/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MyUtils.openJSP("user/login", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid = request.getParameter("uid");
		String upw = request.getParameter("upw");
		
		UserVO vo = new UserVO();
		vo.setUid(uid);
		vo.setUpw(upw);
		
		int result = UserDAO.loginUser(vo);
		System.out.println("result : " + result);
		
		switch(result) {
		case 1:
			response.sendRedirect("/board/list");
			break;
		default:
			// doGet을 하거나 sendRedirect를 하거나 둘 중 하나 실행
			// doGet을 사용하면 기존 request의 값이 그대로 전달, 유지
			// sendRedirect를 사용하면 새로운 request를 생성해서 값 전달 x 
			doGet(request, response); 
//			response.sendRedirect("login"); 
			break;
		}
	}
}