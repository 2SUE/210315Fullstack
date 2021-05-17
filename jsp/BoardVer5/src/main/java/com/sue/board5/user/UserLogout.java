package com.sue.board5.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/user/logout")
public class UserLogout extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs = request.getSession();
		hs.invalidate(); // 세션 초기화 (setAttribute 사라진다 ~.~)
//		hs.removeAttribute("삭제할 거"); 삭제할 게 별로 없으면 얘로 부분 삭제 가능
		
		response.sendRedirect("/user/login");
	}
}