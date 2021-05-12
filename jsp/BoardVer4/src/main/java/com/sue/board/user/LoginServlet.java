package com.sue.board.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sue.board.MyUtils;

@WebServlet("/user/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs = request.getSession();
		UserVO loginUser = (UserVO) hs.getAttribute("loginUser");
		
		if(loginUser != null) { // 로그인 상태에서는 로그인 페이지로 넘어가지 않는다
			response.sendRedirect("/board/list");
			return;
		}
			
		MyUtils.openJSP("/user/login", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid = request.getParameter("uid");
		String upw = request.getParameter("upw");
		
		UserVO vo = new UserVO();
		vo.setUid(uid);
		vo.setUpw(upw);
		
		int result = UserDAO.loginUser(vo);
		System.out.println("result : " + result);
		
		// 로그인 성공
		if (result == 1) { 
			HttpSession hs = request.getSession();
			
			vo.setUpw(null); // pw 값 지움

			hs.setAttribute("loginUser", vo);
			// vo가 가리키는 userVO 객체는 iuser, uid, unm 값만 담고 있다.
			
			response.sendRedirect("/board/list");
			return;
		}
		
		String errMsg = null;
		
		switch(result) {
		case 0:
			errMsg = "에러가 발생했습니다.";
			break;
		case 2:
			errMsg = "아이디를 확인해주세요.";
			break;
		case 3:
			errMsg = "비밀번호를 확인해주세요.";
			break;
		}// 로그인 실패
		// doGet을 하거나 sendRedirect를 하거나 둘 중 하나 실행
		// doGet을 사용하면 기존 request의 값이 그대로 전달, 유지
		// sendRedirect를 사용하면 새로운 request를 생성해서 값 전달 x 
		request.setAttribute("errMsg", errMsg);
		doGet(request, response); 
//		response.sendRedirect("login"); 
	}
}